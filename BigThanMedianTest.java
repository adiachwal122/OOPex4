package partA;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Test;

class BigThanMedianTest {

	@Test
	void testBigThanMedianAlgo() {
		int [] a = {3,5,7,9};
		int [] b = {1,4,7,12};
		int [] actual = BigThanMedian.bigThanMedianAlgo(a, b);
		int [] expected  = {12,7,7,9};
		assertTrue(Arrays.equals(actual, expected));
		
		a = new int [100];
		b = new int [100];
		Random generator = new Random(100);	
		for(int i=0; i<a.length; i++){
			a[i] = generator.nextInt();
		}
		for(int i=0; i<b.length; i++){
			b[i] = generator.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		int [] actual2 = BigThanMedian.bigThanMedianAlgo(a, b);
		//System.out.println(Arrays.toString(actual2));
		int [] expected2  = {2115435214, 2071411240, 2050022934, 1998585299, 1944489180, 1886619111, 1882995632, 1873765769, 1870375384, 1839228830, 1740822411, 1718866999, 1663894169, 1601141409, 1560687403, 1507965401, 1486922998, 1454512669, 1402552856, 1331513737, 1238116795, 1229475173, 1156981887, 1154768277, 1122590157, 1083617672, 1078959357, 1065249860, 1012570766, 954706621, 825530643, 758415394, 701271400, 675194542, 614952908, 597939959, 597620707, 455452124, 447034491, 374760919, 349121377, 276417176, 172175276, 168000524, 145613277, 121799991, 97423803, 84807778, 25002851, 54569456, 75313292, 112648380, 118249332, 127077838, 210685648, 294587754, 310512119, 377763062, 464282119, 480115204, 484807789, 505500111, 521203012, 538765107, 623232076, 650170975, 653376516, 834961746, 837415749, 908746904, 976418386, 1001319800, 1001630858, 1016840512, 1068497434, 1147896915, 1151814890, 1183529742, 1204183377, 1213472252, 1231480079, 1232802238, 1301674577, 1306120225, 1310258000, 1327222584, 1483247468, 1493735697, 1501705166, 1508363652, 1774864511, 1785100857, 1809535719, 1831638704, 1932656050, 1965042692, 2016372201, 2087512925, 2092624704, 2134557307};
		assertTrue(Arrays.equals(actual2, expected2));

	}

	@Test
	void testBigThanMedianMerge() {
		int[]a = new int [100];
		int[]b = new int [100];
		Random generator = new Random(100);	
		for(int i=0; i<a.length; i++){
			a[i] = generator.nextInt();
		}
		for(int i=0; i<b.length; i++){
			b[i] = generator.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		int [] actual = BigThanMedian.bigThanMedianMerge(a, b);
		//System.out.println(Arrays.toString(actual));
		int [] expected  = {25002851, 54569456, 75313292, 84807778, 97423803, 112648380, 118249332, 121799991, 127077838, 145613277, 168000524, 172175276, 210685648, 276417176, 294587754, 310512119, 349121377, 374760919, 377763062, 447034491, 455452124, 464282119, 480115204, 484807789, 505500111, 521203012, 538765107, 597620707, 597939959, 614952908, 623232076, 650170975, 653376516, 675194542, 701271400, 758415394, 825530643, 834961746, 837415749, 908746904, 954706621, 976418386, 1001319800, 1001630858, 1012570766, 1016840512, 1065249860, 1068497434, 1078959357, 1083617672, 1122590157, 1147896915, 1151814890, 1154768277, 1156981887, 1183529742, 1204183377, 1213472252, 1229475173, 1231480079, 1232802238, 1238116795, 1301674577, 1306120225, 1310258000, 1327222584, 1331513737, 1402552856, 1454512669, 1483247468, 1486922998, 1493735697, 1501705166, 1507965401, 1508363652, 1560687403, 1601141409, 1663894169, 1718866999, 1740822411, 1774864511, 1785100857, 1809535719, 1831638704, 1839228830, 1870375384, 1873765769, 1882995632, 1886619111, 1932656050, 1944489180, 1965042692, 1998585299, 2016372201, 2050022934, 2071411240, 2087512925, 2092624704, 2115435214, 2134557307};
		assertTrue(Arrays.equals(actual, expected));		
	}
}