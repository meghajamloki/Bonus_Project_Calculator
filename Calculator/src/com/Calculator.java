package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double num1, num2, total;
	String operation, result, labelResult;;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//initializing frame
		frame = new JFrame();
		frame.setBounds(100, 100, 442, 521); //bounds for frame of calculator
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Calibri", Font.BOLD, 19));
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 92, 408, 34);
		frame.getContentPane().add(lblNewLabel); //adding button to frame
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBackground(SystemColor.text);
		textField.setEditable(false);
		textField.setFont(new Font("Calibri", Font.BOLD, 32));
		textField.setBounds(10, 10, 408, 73);
		frame.getContentPane().add(textField); //adding button to frame
		textField.setColumns(10);
		
		
		//button with 7 number
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn7.getText();
				textField.setText(num);
			}
		});
		btn7.setFont(new Font("Calibri", Font.BOLD, 19));
		btn7.setBounds(10, 206, 85, 60);
		frame.getContentPane().add(btn7); //adding button to frame
		
		//button with 4 number
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn4.getText();
				textField.setText(num);
			}
		});
		btn4.setFont(new Font("Calibri", Font.BOLD, 19));
		btn4.setBounds(10, 276, 85, 60);
		frame.getContentPane().add(btn4); //adding button to frame
		
		//button with 1 number
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn1.getText();
				textField.setText(num);
			}
		});
		btn1.setFont(new Font("Calibri", Font.BOLD, 19));
		btn1.setBounds(10, 346, 85, 60);
		frame.getContentPane().add(btn1); //adding button to frame
		
		//button with 8 number
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn8.getText();
				textField.setText(num);
			}
		});
		btn8.setFont(new Font("Calibri", Font.BOLD, 19));
		btn8.setBounds(105, 206, 85, 60);
		frame.getContentPane().add(btn8); //adding button to frame
		
		//button with 5 number
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn5.getText();
				textField.setText(num);
			}
		});
		btn5.setFont(new Font("Calibri", Font.BOLD, 19));
		btn5.setBounds(105, 276, 85, 60);
		frame.getContentPane().add(btn5); //adding button to frame
		
		//button with 2 number
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn2.getText();
				textField.setText(num);
			}
		});
		btn2.setFont(new Font("Calibri", Font.BOLD, 19));
		btn2.setBounds(105, 346, 85, 60);
		frame.getContentPane().add(btn2); //adding button to frame
		
		//button with 9 number
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn9.getText();
				textField.setText(num);
			}
		});
		btn9.setFont(new Font("Calibri", Font.BOLD, 19));
		btn9.setBounds(200, 206, 85, 60);
		frame.getContentPane().add(btn9); //adding button to frame
		
		//button with 6 number
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn6.getText();
				textField.setText(num);
			}
		});
		btn6.setFont(new Font("Calibri", Font.BOLD, 19));
		btn6.setBounds(200, 276, 85, 60);
		frame.getContentPane().add(btn6); //adding button to frame
		 
		//button with 3 number
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn3.getText();
				textField.setText(num);
			}
		});
		btn3.setFont(new Font("Calibri", Font.BOLD, 19));
		btn3.setBounds(200, 346, 85, 60);
		frame.getContentPane().add(btn3); //adding button to frame
		
		//button with dot
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btndot.getText();
				textField.setText(num);
			}
		});
		btndot.setFont(new Font("Calibri", Font.BOLD, 19));
		btndot.setBounds(200, 413, 85, 60);
		frame.getContentPane().add(btndot); //adding button to frame
		
		//button with 0 number
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String num = textField.getText() + btn0.getText();
				textField.setText(num);
			}
		});
		btn0.setFont(new Font("Calibri", Font.BOLD, 19));
		btn0.setBounds(10, 413, 180, 60);
		frame.getContentPane().add(btn0); //adding button to frame
		
		//button with = sign
		JButton btntEqual = new JButton("=");
		btntEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2 = Double.parseDouble(textField.getText());
				if(operation == "+") {
					total = num1 + num2;
					result = String.format("%.1f + %.1f", num1, num2);
					labelResult = String.format("%.2f",total);
					textField.setText(result);
					lblNewLabel.setText(labelResult);
				}
				if(operation == "-") {
					total = num1 - num2;
					result = String.format("%.1f - %.1f", num1, num2);
					labelResult = String.format("%.2f",total);
					textField.setText(result);
					lblNewLabel.setText(labelResult);
				}
				if(operation == "*") {
					total = num1 * num2;
					result = String.format("%.1f * %.1f", num1, num2);
					labelResult = String.format("%.2f",total);
					textField.setText(result);
					lblNewLabel.setText(labelResult);
				}
				if(operation == "/") {
					total = num1 / num2;
					result = String.format("%.1f / %.1f", num1, num2);
					labelResult = String.format("%.2f",total);
					textField.setText(result);
					lblNewLabel.setText(labelResult);
				}
			}
		});
		btntEqual.setFont(new Font("Calibri", Font.BOLD, 19));
		btntEqual.setBounds(295, 413, 127, 60);
		frame.getContentPane().add(btntEqual); //adding button to frame
		
		//button with + sign
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="+";
			}
		});
		btnAdd.setFont(new Font("Calibri", Font.BOLD, 19));
		btnAdd.setBounds(295, 136, 127, 60);
		frame.getContentPane().add(btnAdd); //adding button to frame
		
		//button with - sign
		JButton btnSubtract = new JButton("-");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="-";
			}
		});
		btnSubtract.setFont(new Font("Calibri", Font.BOLD, 19));
		btnSubtract.setBounds(295, 276, 127, 60);
		frame.getContentPane().add(btnSubtract); //adding button to frame
		
		//button with * sign
		JButton btnMultiply = new JButton("*");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="*";
			}
		});
		btnMultiply.setFont(new Font("Calibri", Font.BOLD, 19));
		btnMultiply.setBounds(295, 346, 127, 60);
		frame.getContentPane().add(btnMultiply); //adding button to frame
		
		//button with / sign
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				operation ="/";}
		});
		btnDivide.setFont(new Font("Calibri", Font.BOLD, 19));
		btnDivide.setBounds(295, 206, 127, 60);
		frame.getContentPane().add(btnDivide); //adding button to frame
		
		//button with AC sign
		JButton btnC = new JButton("AC");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				lblNewLabel.setText(null);
			}
		});
		btnC.setFont(new Font("Calibri", Font.BOLD, 19));
		btnC.setBounds(10, 136, 180, 60);
		frame.getContentPane().add(btnC); //adding button to frame
		
		//button with C sign
		JButton btnBack = new JButton("C");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String back = null;
				if(textField.getText().length() > 0) {
					StringBuilder sb = new StringBuilder(textField.getText());
					sb.deleteCharAt(textField.getText().length() - 1);
					back = sb.toString();
					textField.setText(back);
				}
			}
		});
		btnBack.setFont(new Font("Calibri", Font.BOLD, 19));
		btnBack.setBounds(200, 136, 85, 60);
		frame.getContentPane().add(btnBack); //adding button to frame
		
	
	}
}
