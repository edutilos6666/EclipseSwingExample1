package com.edutilos.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class ButtonListener implements ActionListener{

	private JTextArea areaDisplay ; 
	
	
	public ButtonListener(JTextArea areaDisplay) {
	
		this.areaDisplay = areaDisplay;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
	    JButton causer = (JButton) e.getSource(); 
	    String txt = causer.getText(); 
	    
	    String display = areaDisplay.getText(); 
	    String appender = "" ; 
	    System.out.println(txt);
	   switch(txt) {
	   case "0": 
	   case "1": 
	   case "2": 
	   case "3": 
	   case "4": 
	   case "5": 
	   case "6": 
	   case "7": 
	   case "8": 
	   case "9":  
	     appender = txt ; 
	     break; 
	   case "+": 
	   case "-": 
	   case "*":
	   case "/": 
		   appender = " "+ txt + " "; 
		   break; 
	   }
	   
	   
	   areaDisplay.setText(display+appender); 
	}
  
}
