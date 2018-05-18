package forms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

public class frmmain {

	public JFrame frame;
	private JTextField textDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public frmmain() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setBounds(10, 11, 350, 35);
		frame.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText=textDisplay.getText();
				currentText+="7";
				textDisplay.setText(currentText);
			}
		});
		btn7.setBounds(10, 57, 49, 35);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText=textDisplay.getText();
				currentText+="8";
				textDisplay.setText(currentText);
			}
		});
		btn8.setBounds(69, 57, 49, 35);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText=textDisplay.getText();
				currentText+="9";
				textDisplay.setText(currentText);
			}
		});
		btn9.setBounds(128, 57, 49, 35);
		frame.getContentPane().add(btn9);
		
		JButton btnc = new JButton("C");
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnc.setBounds(221, 57, 49, 35);
		frame.getContentPane().add(btnc);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText=textDisplay.getText();
				currentText+="4";
				textDisplay.setText(currentText);
			}
		});
		btn4.setBounds(10, 103, 49, 35);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText=textDisplay.getText();
				currentText+="5";
				textDisplay.setText(currentText);
			}
		});
		btn5.setBounds(69, 103, 49, 35);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText=textDisplay.getText();
				currentText+="6";
				textDisplay.setText(currentText);
			}
		});
		btn6.setBounds(125, 103, 49, 35);
		frame.getContentPane().add(btn6);
		
		JButton button_6 = new JButton("+");
		button_6.setBounds(221, 103, 49, 35);
		frame.getContentPane().add(button_6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String currentText=textDisplay.getText();
				currentText+="1";
				textDisplay.setText(currentText);
			}
		});
		btn1.setBounds(10, 149, 49, 35);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText=textDisplay.getText();
				currentText+="2";
				textDisplay.setText(currentText);
			}
		});
		btn2.setBounds(69, 149, 49, 35);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String currentText=textDisplay.getText();
				currentText+="3";
				textDisplay.setText(currentText);
			}
		});
		btn3.setBounds(125, 149, 49, 35);
		frame.getContentPane().add(btn3);
		
		JButton button_10 = new JButton("+");
		button_10.setBounds(221, 149, 49, 35);
		frame.getContentPane().add(button_10);
		
		JButton btnoperations = new JButton("+/-");
		btnoperations.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String current=textDisplay.getText();
				//if(current.indexOf("-")==-1) current="-"
			}
		});
		btnoperations.setBounds(10, 195, 49, 35);
		frame.getContentPane().add(btnoperations);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String currentText=textDisplay.getText();
				currentText+="0";
				textDisplay.setText(currentText);
			}
		});
		btnZero.setBounds(69, 195, 49, 35);
		frame.getContentPane().add(btnZero);
		
		JButton btndecimal = new JButton(".");
		btndecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		btndecimal.setBounds(125, 195, 49, 35);
		frame.getContentPane().add(btndecimal);
		
		JButton button_14 = new JButton("+");
		button_14.setBounds(221, 195, 49, 35);
		frame.getContentPane().add(button_14);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mCalculate = new JMenu("Calculate");
		menuBar.add(mCalculate);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mCalculate.add(mntmExit);
	}
}
