package partB;

/**
 *number game for Computer vs player 
 *Computer starts because it needs to always win.
 *using the logic from algo' 1
 *to play press RUN and enjoy! 
 *the GUI is build with layout code that we were written
 * @author user
 */
@SuppressWarnings("serial")
public class NumberGameComputer extends javax.swing.JFrame {

	//Variables 
	private javax.swing.JButton Left;
	private javax.swing.JMenuItem NewGame;
	private javax.swing.JMenuItem P1vP2;
	private javax.swing.JButton Right;
	private javax.swing.JTextField com;
	private javax.swing.JTextField current;
	private javax.swing.JLabel Label1;
	private javax.swing.JLabel Label2;
	private javax.swing.JLabel Label3;
	private javax.swing.JLabel Label4;
	private javax.swing.JLabel Label5;
	private javax.swing.JLabel Label6;
	private javax.swing.JLabel Label7;
	private javax.swing.JLabel Label8;
	private javax.swing.JMenuBar MenuBar;
	private javax.swing.JTextField prev;
	private javax.swing.JMenu restart;
	private javax.swing.JButton start;
	private javax.swing.JTextField sum1;
	private javax.swing.JTextField sum2;
	//	private javax.swing.JTextField choice;
	private javax.swing.JLabel win;

	/**
	 * constructor to create bottoms and start game
	 */
	public NumberGameComputer() {
		initComponents();
		Left.setEnabled(false);
		Right.setEnabled(false);
		prev.setText("Press 'Start' to begin, Good luck!");
	}

	/**
	 *the constructor calls this function to initialize the form.
	 */
	private void initComponents() {

		start = new javax.swing.JButton();
		Label2 = new javax.swing.JLabel();
		Label1 = new javax.swing.JLabel();
		prev = new javax.swing.JTextField();
		current = new javax.swing.JTextField();
		Label3 = new javax.swing.JLabel();
		Label4 = new javax.swing.JLabel();
		Label5 = new javax.swing.JLabel();
		com = new javax.swing.JTextField();
		Label6 = new javax.swing.JLabel();
		sum2 = new javax.swing.JTextField();

		Left = new javax.swing.JButton();
		Right = new javax.swing.JButton();
		sum1 = new javax.swing.JTextField();
		Label7 = new javax.swing.JLabel();
		Label8 = new javax.swing.JLabel();
		win = new javax.swing.JLabel();
		//reset = new javax.swing.JButton();
		MenuBar = new javax.swing.JMenuBar();
		restart = new javax.swing.JMenu();
		P1vP2 = new javax.swing.JMenuItem();
		NewGame = new javax.swing.JMenuItem();

		//set font
		start.setFont(new java.awt.Font("David", 1, 13));
		Label1.setFont(new java.awt.Font("David", 1, 13));
		Label2.setFont(new java.awt.Font("David", 1, 13));
		prev.setFont(new java.awt.Font("David", 1, 13));
		current.setFont(new java.awt.Font("David", 1, 13));
		com.setFont(new java.awt.Font("David", 1, 13)); 
		Label3.setFont(new java.awt.Font("David", 1, 13));
		Label4.setFont(new java.awt.Font("David", 1, 13));
		Label5.setFont(new java.awt.Font("David", 1, 13));
		Label6.setFont(new java.awt.Font("David", 1, 13));
		Label7.setFont(new java.awt.Font("David", 1, 13));
		Label8.setFont(new java.awt.Font("David", 1, 13));
		Left.setFont(new java.awt.Font("David", 1, 13));
		Right.setFont(new java.awt.Font("David", 1, 13));
		sum1.setFont(new java.awt.Font("David", 1, 13));
		sum2.setFont(new java.awt.Font("David", 1, 13));
		win.setFont(new java.awt.Font("David", 1, 13));
		//	choice.setFont(new java.awt.Font("David", 1, 13));
		restart.setFont(new java.awt.Font("David", 1, 13));
		MenuBar.setFont(new java.awt.Font("David", 1, 13));
		P1vP2.setFont(new java.awt.Font("David", 1, 13));
		NewGame.setFont(new java.awt.Font("David", 1, 13));


		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		start.setText("Start");
		start.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				startActionPerformed(evt);
			}
		});

		Label2.setText("Previous");
		Label1.setText("Current");

		prev.setHorizontalAlignment(javax.swing.JTextField.CENTER);
		prev.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				prevActionPerformed(evt);
			}
		});

		current.setHorizontalAlignment(javax.swing.JTextField.CENTER);

		Label3.setText("Computer");
		Label4.setText("Player");
		Label4.setToolTipText("");

		Label5.setText("Choice:");
		com.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				comActionPerformed(evt);
			}
		});

		Label6.setText("Sum");

		sum2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sum2ActionPerformed(evt);
			}
		});

		sum1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				sum1ActionPerformed(evt);
			}
		});

		Left.setText("Left");
		Left.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				LeftActionPerformed(evt);
			}
		});

		Right.setText("Rigth");
		Right.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				RightActionPerformed(evt);
			}
		});

		Label7.setText("Sum");
		Label8.setText("Select number");
		win.setText(" ");

		restart.setText("Game");

		P1vP2.setText("Restart game vs another player");
		P1vP2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				P1vP2ActionPerformed(evt);
			}
		});
		restart.add(P1vP2);
		NewGame.setText("New Game");
		NewGame.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				NewGameActionPerformed(evt);
			}
		});
		restart.add(NewGame);
		MenuBar.add(restart);
		setJMenuBar(MenuBar);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(layout.createSequentialGroup()
										.addGap(40, 40, 40)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(layout.createSequentialGroup()
														.addGap(6, 6, 6)
														.addComponent(Label1)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addComponent(current, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(layout.createSequentialGroup()
														.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
																.addComponent(Label5, javax.swing.GroupLayout.Alignment.TRAILING)
																.addComponent(Label6, javax.swing.GroupLayout.Alignment.TRAILING)
																.addComponent(Label2, javax.swing.GroupLayout.Alignment.TRAILING))
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
														.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
																.addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
																		.addComponent(sum1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addComponent(com, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(0, 0, Short.MAX_VALUE))
																.addComponent(Label5)
																.addComponent(sum2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addComponent(prev, javax.swing.GroupLayout.Alignment.LEADING)
																.addGroup(layout.createSequentialGroup()
																		.addComponent(Label3)
																		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																		.addComponent(Label4)
																		.addGap(28, 28, 28)))))) //player gap
								.addGroup(layout.createSequentialGroup()
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(Label8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(Left, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addGroup(layout.createSequentialGroup()
														.addComponent(Label7)
														.addGap(10, 10, 10)
														.addComponent(sum1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addComponent(Right, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addGap(69, 69, 69))
				.addGroup(layout.createSequentialGroup()
						//.addContainerGap()
						.addGap(130, 130, 130)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(win, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(win, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(prev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Label2))
						.addGap(11, 11, 11) //between curr and prev
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(current, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(Label1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(6, 6, 6)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(Label3)
								.addComponent(Label4))
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(Label8)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(Left))
								.addGroup(layout.createSequentialGroup()
										.addGap(54, 54, 54) //between sum
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(com, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(Label5))))
						.addGap(7, 7, 7)
						.addComponent(Right)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(Label6)
										.addComponent(sum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)	)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(Label7)
										.addComponent(sum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGap(31, 31, 31))
				);

		pack();
	}

	int size = 10;
	int[] prevArr = new int[size];
	int compChoice, userChoice;
	int compSum = 0, userSum = 0;
	int sumEven, sumOdd;
	int left = 0;
	int right = prevArr.length;
	boolean GetEven;
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
	 * checks the even and odd sum of the array
	 * @param arr array of int
	 * @return which of the odd or even is better
	 */
	private boolean CheckSum(int[] arr) {
		boolean ans = true;
		for (int i = 0; i < arr.length/2; i++) {
			sumEven += arr[2*i];
			sumOdd += arr[2*i + 1];
		}
		if (sumEven < sumOdd) {
			ans = false;
		}
		return ans;
	}
	/**
	 * the game and the plays thats been made
	 * @param arr array of int
	 */
	private void Play(int[] arr) {
		Randomize(arr);
		String s = ArrToString(arr, left, right);
		prev.setText(s);
		GetEven = CheckSum(arr);

		if (GetEven) {
			com.setText("Left");
			compSum += arr[left++];
		} else {
			com.setText("Right");
			compSum += arr[right - 1];
			right--;
		}

		String cSum = String.valueOf(compSum);
		sum1.setText(cSum);

		s = ArrToString(arr, left, right);
		current.setText(s);
	}
	/**
	 * check who wins, always the computer
	 */
	private void WhoWins() {
		if (compSum > userSum) {
			win.setText("Computer is the winner!!");
		} else if (userSum > compSum) {
			win.setText("You are the winner!");
		} else {
			win.setText("Standoff.");
		}

		Left.setEnabled(false);
		Right.setEnabled(false);
	}


	private void sum2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void sum1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}
	private void comActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void prevActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}
	/**
	 * start event
	 * @param evt
	 */
	private void startActionPerformed(java.awt.event.ActionEvent evt) {
		start.setEnabled(false);
		Left.setEnabled(true);
		Right.setEnabled(true);
		Play(prevArr);
	}
	/**
	 * left action event, all the moves from the left side
	 * @param evt
	 */
	private void LeftActionPerformed(java.awt.event.ActionEvent evt) {
		String s = ArrToString(prevArr, left, right);
		prev.setText(s);
		userSum += prevArr[left++];
		String uSum = String.valueOf(userSum);
		sum2.setText(uSum);
		s = ArrToString(prevArr, left, right);
		current.setText(s);

		if (left >= right) {
			WhoWins();
			return;
		}

		if (left % 2 == 0) {
			if (GetEven == true) {
				com.setText("Left");
				compSum += prevArr[left++];
			} else {
				com.setText("Right");
				compSum += prevArr[--right];
			}
		} else {
			if (GetEven == true) {
				com.setText("Right");
				compSum += prevArr[--right];
			} else {
				com.setText("Left");
				compSum += prevArr[left++];
			}
		}

		String cSum = String.valueOf(compSum);
		sum1.setText(cSum);
		s = ArrToString(prevArr, left, right);
		current.setText(s);

	}
	/**
	 * right action event, all the moves from the right side
	 * @param evt
	 */
	private void RightActionPerformed(java.awt.event.ActionEvent evt) {
		String s = ArrToString(prevArr, left, right);
		userSum += prevArr[right - 1];
		right--;
		String uSum = String.valueOf(userSum);
		sum2.setText(uSum);
		prev.setText(s);
		s = ArrToString(prevArr, left, right);
		current.setText(s);

		if (left >= right) {
			WhoWins();
			return;
		}
		if (left % 2 == 0) {
			if (GetEven == true) {
				com.setText("Left");
				compSum += prevArr[left++];
			} else {
				com.setText("Right");
				compSum += prevArr[--right];
			}
		} else {
			if (GetEven == true) {
				com.setText("Right");
				compSum += prevArr[--right];
			} else {
				com.setText("Left");
				compSum += prevArr[left++];
			}
		}
		String cSum = String.valueOf(compSum);
		sum1.setText(cSum);
		s = ArrToString(prevArr, left, right);
		current.setText(s);       
	}

	/**
	 * game action event
	 * @param evt
	 */
	private void NewGameActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
		NumberGameComputer newGame = new NumberGameComputer();
		newGame.setVisible(true);
	}
	/**
	 * player vs. player event
	 * @param evt
	 */
	private void P1vP2ActionPerformed(java.awt.event.ActionEvent evt) {
		this.setVisible(false);
		NumberGame game2 = new NumberGame();
		game2.setVisible(true);
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
			java.util.logging.Logger.getLogger(NumberGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(NumberGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(NumberGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(NumberGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new NumberGameComputer().setVisible(true);
			}
		});
	}
}


