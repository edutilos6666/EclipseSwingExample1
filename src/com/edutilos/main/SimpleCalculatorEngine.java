package com.edutilos.main;

import java.util.Stack;

public class SimpleCalculatorEngine {
  public static double calculate(String input) throws Exception  {
	   String [] splitted = input.split("\\s+"); 
	   Stack<Double> operands = new Stack<>(); 
	   Stack<String> operators = new Stack<>(); 
	   for(int i=0; i< splitted.length -2 ; i+=2)  {
		   Double n = Double.parseDouble(splitted[0]); 
		   String op = splitted[1]; 
		   operands.push(n); 
		   operators.push(op); 
	   }
	   
	   operands.push(Double.parseDouble(splitted[splitted.length-1])); 
	   
	   Stack<Double> revOperands = new Stack<>();
	   Stack<String> revOperators = new Stack<>();
	   while(!operands.isEmpty()) {
		   revOperands.push(operands.pop()); 
	   }
	   
	   while(!operators.isEmpty()) {
		   revOperators.push(operators.pop()); 
	   }
	   
	   
	   while(!revOperators.isEmpty()) {
		   Double n1  = revOperands.pop(), 
				   n2 = revOperands.pop(); 
		   String op = revOperators.pop(); 
		   switch(op){
		   case "+": n1 += n2 ; break; 
		   case "-": n1 -= n2 ; break; 
		   case "*": n1 *= n2; break; 
		   case "/": n1 /= n2; break; 
		   }
		   
		   revOperands.push(n1); 
	   }
	   
	   
	   return revOperands.pop(); 
  }
}
