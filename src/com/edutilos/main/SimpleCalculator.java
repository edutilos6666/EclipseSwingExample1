package com.edutilos.main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SimpleCalculator extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator frame = new SimpleCalculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SimpleCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 569, 435);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea areaDisplay = new JTextArea();
		areaDisplay.setBounds(24, 29, 508, 127);
		contentPane.add(areaDisplay);
		
		JLabel lblSimpleCalculator = new JLabel("Simple Calculator");
		lblSimpleCalculator.setBounds(215, 4, 217, 14);
		contentPane.add(lblSimpleCalculator);
		
		JButton btn0 = new JButton("0");
		btn0.setBounds(30, 184, 89, 23);
		contentPane.add(btn0);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn1.setBounds(172, 184, 89, 23);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBounds(312, 184, 89, 23);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBounds(443, 184, 89, 23);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBounds(30, 233, 89, 23);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setBounds(172, 233, 89, 23);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBounds(312, 233, 89, 23);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBounds(443, 233, 89, 23);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBounds(30, 281, 89, 23);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBounds(172, 281, 89, 23);
		contentPane.add(btn9);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setBounds(312, 281, 89, 23);
		contentPane.add(btnAdd);
		
		JButton btnSubtract = new JButton("-");
		btnSubtract.setBounds(443, 281, 89, 23);
		contentPane.add(btnSubtract);
		
		JButton btnMultiply = new JButton("*");
		btnMultiply.setBounds(30, 325, 89, 23);
		contentPane.add(btnMultiply);
		
		JButton btnDivide = new JButton("/");
		btnDivide.setBounds(172, 325, 89, 23);
		contentPane.add(btnDivide);
		
		JButton btnEquals = new JButton("=");
		btnEquals.setBounds(312, 325, 89, 23);
		contentPane.add(btnEquals);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(443, 325, 89, 23);
		contentPane.add(btnClear);
		
		ButtonListener bl = new ButtonListener(areaDisplay); 
		btn0.addActionListener(bl);
		btn1.addActionListener(bl);
		btn2.addActionListener(bl);
		btn3.addActionListener(bl);
		btn4.addActionListener(bl);
		btn5.addActionListener(bl);
		btn6.addActionListener(bl);
		btn7.addActionListener(bl);
		btn8.addActionListener(bl);
		btn9.addActionListener(bl);
		btnAdd.addActionListener(bl);
		btnSubtract.addActionListener(bl);
		btnMultiply.addActionListener(bl);
		btnDivide.addActionListener(bl);
		btnEquals.addActionListener(l-> {
			 try {
				 String text = areaDisplay.getText(); 
				Double res = SimpleCalculatorEngine.calculate(text);
				 areaDisplay.setText(text + " = "+ res);
			 } catch(Exception ex) {
				 ex.printStackTrace();
				 areaDisplay.setText(ex.getMessage());
			 }
		});
		
		btnClear.addActionListener(l-> {
			areaDisplay.setText("");
		});
	}
	
	

}
