package partA;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * return array of elements which larger than median of 2 given sorted arrays
 * @author user
 *
 */
public class BigThanMedian {
	/**
	 * using ThreadPool
	 * @param a first int array
	 * @param b second int array
	 * @return array of elements larger than median after given 2 sorted arrays using multiThread
	 */
	public static int[] bigThanMedianAlgo(int []a, int[] b){

		int [] ans = new int [a.length];
		int num = a.length;
		ExecutorService pool = Executors.newFixedThreadPool(num); 
		for (int i = 0; i < ans.length; i++) {
			int temp = i;
			pool.execute(() -> ans[temp] = Math.max(a[temp], b[b.length-temp-1]));
		}
		pool.shutdown();
		while(true){
			if (pool.isTerminated())
				break;
		}
		return ans;
	} 

	/**
	 * this code is from https://www.geeksforgeeks.org/merge-two-sorted-arrays/ and we made a few changes to match our function
	 * @param arr1
	 * @param arr2
	 * @return merge array of arr1 && arr2
	 */
	private static int [] mergeSortArrays(int[] arr1, int[] arr2) { 
		int[] arr3 = new int [arr1.length+arr2.length];
		int i = 0, j = 0, k = 0; 
		int n1 = arr1.length, n2 = arr2.length;
		while (i<n1 && j <n2) { 
			if (arr1[i] < arr2[j]) 
				arr3[k++] = arr1[i++]; 
			else
				arr3[k++] = arr2[j++]; 
		} 
		while (i < n1) 
			arr3[k++] = arr1[i++]; 
		while (j < n2) 
			arr3[k++] = arr2[j++]; 
		return arr3;
	} 
	/**
	 * using function merge sort and without threads
	 * @param a first int array
	 * @param b second int array
	 * @return array of elements larger than median after given 2 sorted arrays without threads
	 */
	public static int[] bigThanMedianMerge(int[]a, int[] b){
		int [] temp = mergeSortArrays(a,b);
		int [] ans = new int [temp.length/2];
		int k = temp.length/2;
		for (int i = 0; i < ans.length; i++) {
			ans[i] = temp [k++];
		}
		return ans;
	}
	/*public static void main(String[] args) {

		int[]a = new int [10000];
		int[]b = new int [10000];
	
		for(int i=0; i<a.length; i++){
			a[i] = (int)(Math.random()*1000);
		}
		for(int i=0; i<b.length; i++){
			b[i] = (int)(Math.random()*1000);
		}
		Arrays.sort(a);
		Arrays.sort(b);
		//time for bigThanMedianAlgo
		long start = System.currentTimeMillis();
		int[] ans1 = bigThanMedianAlgo(a, b);
		long end = System.currentTimeMillis();
		System.out.println("bigThanMedianAlgo time is: " + (end - start) + " ms");
		//time for bigThanMedianMerge
		start = System.currentTimeMillis();
		int[] ans2 = bigThanMedianMerge(a,b);
		end = System.currentTimeMillis();
		System.out.println("bigThanMedianMerge time is: "+(end - start)+" ms");

	}*/
}
