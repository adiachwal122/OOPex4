package partB;

import java.util.Random;

/**
 * number game for player1 vs player2
 * they play without planning as asked because they didn't do algo' 1
 * to play press RUN and enjoy! 
 *the GUI is build with layout code that we were written
 * @author user
 */
@SuppressWarnings("serial")
public class NumberGame extends javax.swing.JFrame {

	//Variables 
	private javax.swing.JButton Left1;
	private javax.swing.JButton Left2;
	private javax.swing.JMenuItem NewGame;
	private javax.swing.JMenuItem PvC;
	private javax.swing.JButton Right1;
	private javax.swing.JButton Right2;
	private javax.swing.JButton Start;
	private javax.swing.JLabel Label1;
	private javax.swing.JLabel Label2;
	private javax.swing.JLabel Label3;
	private javax.swing.JLabel Label4;
	private javax.swing.JLabel Label5;
	private javax.swing.JLabel Label6;
	private javax.swing.JLabel Label7;
	private javax.swing.JLabel Label8;
	private javax.swing.JMenu Menu;
	private javax.swing.JMenuBar MenuBar;
	private javax.swing.JTextField sum1;
	private javax.swing.JTextField sum2;
	private javax.swing.JTextField textnew;
	private javax.swing.JTextField textperv;
	private javax.swing.JLabel win;

	/**
	 * constructor to create bottoms and start game
	 */
	public NumberGame() {
		initComponents();
		Left1.setEnabled(false);
		Right1.setEnabled(false);
		Left2.setEnabled(false);
		Right2.setEnabled(false);
		textperv.setText("Press 'Start' to begin, Good luck!");
	}

	/**
	 * the constructor calls this function to initialize the form.
	 */
	private void initComponents() {
		Start = new javax.swing.JButton();
		Label1 = new javax.swing.JLabel();
		Label2 = new javax.swing.JLabel();
		textperv = new javax.swing.JTextField();
		textnew = new javax.swing.JTextField();
		Label3 = new javax.swing.JLabel();
		Label4 = new javax.swing.JLabel();
		Label5 = new javax.swing.JLabel();
		Label6 = new javax.swing.JLabel();
		Left2 = new javax.swing.JButton();
		Left1 = new javax.swing.JButton();
		Right2 = new javax.swing.JButton();
		Right1 = new javax.swing.JButton();
		Label7 = new javax.swing.JLabel();
		Label8 = new javax.swing.JLabel();
		sum1 = new javax.swing.JTextField();
		sum2 = new javax.swing.JTextField();
		win = new javax.swing.JLabel();
		MenuBar = new javax.swing.JMenuBar();
		Menu = new javax.swing.JMenu();
		PvC = new javax.swing.JMenuItem();
		NewGame = new javax.swing.JMenuItem();

		//set font
		Start.setFont(new java.awt.Font("David", 1, 13));
		Label1.setFont(new java.awt.Font("David", 1, 13));
		Label2.setFont(new java.awt.Font("David", 1, 13));
		textperv.setFont(new java.awt.Font("David", 1, 13));
		textnew.setFont(new java.awt.Font("David", 1, 13));
		Label3.setFont(new java.awt.Font("David", 1, 13));
		Label4.setFont(new java.awt.Font("David", 1, 13));
		Label5.setFont(new java.awt.Font("David", 1, 13));
		Label6.setFont(new java.awt.Font("David", 1, 13));
		Left2.setFont(new java.awt.Font("David", 1, 13));
		Left1.setFont(new java.awt.Font("David", 1, 13));
		Right2.setFont(new java.awt.Font("David", 1, 13));
		Right1.setFont(new java.awt.Font("David", 1, 13));
		Label7.setFont(new java.awt.Font("David", 1, 13));
		Label8.setFont(new java.awt.Font("David", 1, 13));
		sum1.setFont(new java.awt.Font("David", 1, 13));
		sum2.setFont(new java.awt.Font("David", 1, 13));
		win.setFont(new java.awt.Font("David", 1, 13));
		MenuBar.setFont(new java.awt.Font("David", 1, 13));
		Menu.setFont(new java.awt.Font("David", 1, 13));
		PvC.setFont(new java.awt.Font("David", 1, 13));
		NewGame.setFont(new java.awt.Font("David", 1, 13));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		Start.setText("Start");
		Start.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				StartActionPerformed(evt);
			}
		});

		Label1.setText("Previous");
		Label2.setText("Current");

		textperv.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		textperv.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				textpervActionPerformed(evt);
			}
		});

		textnew.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		Label3.setText("Player #1");

		Label4.setText("Player #2");
		Label5.setText("Select number");
		Label6.setText("Select number");
		Left2.setText("Left");
		Left2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Left2ActionPerformed(evt);
			}
		});
		Left1.setText("Left");
		Left1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Left1ActionPerformed(evt);
			}
		});

		Right2.setText("Right");
		Right2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Right2ActionPerformed(evt);
			}
		});

		Right1.setText("Right");
		Right1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Right1ActionPerformed(evt);
			}
		});

		Label7.setText("Sum #1");
		Label8.setText("Sum #2");

		sum1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sum1ActionPerformed(evt);
			}
		});

		win.setText(" ");

		Menu.setText("Game");

		PvC.setText("Restart game vs Computer");
		PvC.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				PvCActionPerformed(evt);
			}
		});
		Menu.add(PvC);

		NewGame.setText("New Game");
		NewGame.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				NewGameActionPerformed(evt);
			}
		});
		Menu.add(NewGame);
		MenuBar.add(Menu);

		setJMenuBar(MenuBar);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup()
										.addGap(40, 40, 40)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(Label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(Label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup()
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(Label3)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(Label4)
														.addGap(21, 21, 21))
												.addGroup(layout.createSequentialGroup()
														.addGap(10, 10, 10)
														.addComponent(textnew))
												.addGroup(layout.createSequentialGroup()
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(textperv))
												.addGroup(layout.createSequentialGroup()
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(Label8)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(sum2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
										.addGap(65, 65, 65)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
														.addComponent(Label7)
														.addGap(10, 10, 10)
														.addComponent(sum1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(Left1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(Label6)
														.addComponent(Right1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(Label5)
												.addComponent(Left2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(Right2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGap(57, 57, 57))
				.addGroup(layout.createSequentialGroup()
						.addGap(166, 166, 166)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(win, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
								.addComponent(Start, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(win, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(textperv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Label1))
						.addGap(9, 9, 9)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Label2)
								.addComponent(textnew))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Label4)
								.addComponent(Label3))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(Label6)
								.addComponent(Label5))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Left2)
								.addComponent(Left1))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Right1)
								.addComponent(Right2))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(sum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(Label7))
								.addGroup(layout.createSequentialGroup()
										.addGap(3, 3, 3)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(sum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(Label8))))
						.addGap(31, 31, 31))
				);

		pack();
	}
	int size = 10;
	int [] prevArr = new int[size];
	int usr1Choice, usr2Choice;
	int usr1Sum = 0, usr2Sum = 0;
	int left = 0; int right = prevArr.length;
	/**
	 * random function for numbers to fill the array
	 * @param arr array of int
	 */
	private void Randomize(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
		}
	}
	/**
	 * updating the sum after a choice is been made
	 * @param arr array of int
	 * @param start 
	 * @param end
	 * @return string s after adding the choice
	 */
	private String ArrToString(int[] arr, int start, int end) {
		String s = "";
		if (arr != null && arr.length > 0) {
			for (int i = start; i < end; i++) {
				if(i == end-1) {  
					s = s + arr[i];
					break;
				}
				s = s + arr[i] + ", ";
			}
		}
		return s;
	}
	/**
	 * initial game
	 * @param arr
	 */
	private void Play(int[] arr) {
		Randomize(arr);
		String s = ArrToString(arr, left, right);
		textperv.setText(s);
	}
	/**
	 * checks who wins, player1 or player2
	 */
	private void WhoWins(){
		if(usr1Sum > usr2Sum){
			win.setText("Player 1 is the winner!");
		}
		else if(usr2Sum > usr1Sum){
			win.setText("Player 2 is the winner!");
		}
		else{
			win.setText("Standoff");
		}
		Left1.setEnabled(false);
		Right1.setEnabled(false);
		Left2.setEnabled(false);
		Right2.setEnabled(false);
	}
	/**
	 * text of previous array event
	 * @param evt
	 */
	private void textpervActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}
	/**
	 * left2 action event
	 * @param evt
	 */
	private void Left2ActionPerformed(java.awt.event.ActionEvent evt) {
		String s = ArrToString(prevArr, left, right);
		textperv.setText(s);
		usr2Sum += prevArr[left++];
		String uSum2 = String.valueOf(usr2Sum);
		sum2.setText(uSum2);
		s = ArrToString(prevArr, left, right);
		textnew.setText(s);
		if(left>=right){
			WhoWins();
			return;
		}
		Left1.setEnabled(true);
		Right1.setEnabled(true);
		Left2.setEnabled(false);
		Right2.setEnabled(false);
	}
	/**
	 * right2 action event
	 * @param evt
	 */
	private void Right2ActionPerformed(java.awt.event.ActionEvent evt) {
		String s = ArrToString(prevArr, left, right);
		textperv.setText(s);
		usr2Sum += prevArr[right-1];
		right--;
		String uSum2 = String.valueOf(usr2Sum);
		sum2.setText(uSum2);
		s = ArrToString(prevArr, left, right);
		textnew.setText(s);
		if(left>=right){
			WhoWins();
			return;
		}
		Left1.setEnabled(true);
		Right1.setEnabled(true);
		Left2.setEnabled(false);
		Right2.setEnabled(false);
	}
	/**
	 * right1 action event
	 * @param evt
	 */
	private void Right1ActionPerformed(java.awt.event.ActionEvent evt) {
		String s = ArrToString(prevArr, left, right);
		textperv.setText(s);
		usr1Sum += prevArr[right-1];
		right--;
		String uSum1 = String.valueOf(usr1Sum);
		sum1.setText(uSum1);
		s = ArrToString(prevArr, left, right);
		textnew.setText(s);

		if(left>=right){
			WhoWins();
			return;
		}
		Left1.setEnabled(false);
		Right1.setEnabled(false);
		Left2.setEnabled(true);
		Right2.setEnabled(true);
	}
	/**
	 * sum for player1 enent
	 * @param evt
	 */
	private void sum1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}
	/**
	 * player vs computer game event
	 * @param evt
	 */
	private void PvCActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
		NumberGameComputer game = new NumberGameComputer();
		game.setVisible(true);
	}
	/**
	 * new game player vs player event
	 * @param evt
	 */
	private void NewGameActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
		NumberGame newGame = new NumberGame();
		newGame.setVisible(true);
	}
	/**
	 * start game event, initial
	 * choosing who starts using random
	 * @param evt
	 */
	private void StartActionPerformed(java.awt.event.ActionEvent evt) {
		Start.setEnabled(false);
		Random rand = new Random();
		int n = rand.nextInt(10);
		if (n<5) {
			Left1.setEnabled(true);
			Right1.setEnabled(true);
		}
		else {
			Left2.setEnabled(true);
			Right2.setEnabled(true);
		}
		Play(prevArr);
	}
	/**
	 * left1 action event
	 * @param evt
	 */
	private void Left1ActionPerformed(java.awt.event.ActionEvent evt) {
		String s = ArrToString(prevArr, left, right);
		textperv.setText(s);
		usr1Sum += prevArr[left++];
		String uSum1 = String.valueOf(usr1Sum);
		sum1.setText(uSum1);
		s = ArrToString(prevArr, left, right);
		textnew.setText(s);
		if(left>=right){
			WhoWins();
			return;
		}
		Left1.setEnabled(false);
		Right1.setEnabled(false);
		Left2.setEnabled(true);
		Right2.setEnabled(true);
	}

	/**
	 * using swing for better show
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(NumberGameComputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(NumberGameComputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(NumberGameComputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(NumberGameComputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new NumberGame().setVisible(true);
			}
		});
	}
}
