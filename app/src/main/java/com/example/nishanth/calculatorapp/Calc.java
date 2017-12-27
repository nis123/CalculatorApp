package com.example.nishanth.calculatorapp;

import java.util.Stack;

public class Calc {
	private Stack<Double> stack = new Stack<Double>();
	
	public void addOp(String op){
		if(isDouble(op)){
			stack.push(Double.parseDouble(op));
		}
		switch(op){
			case "*":
				stack.push(stack.pop() * stack.pop());
				break;
			case "/":
				Double val1 = stack.pop();
				stack.push(stack.pop() / val1);
				break;
			case "+":
				stack.push(stack.pop() + stack.pop());
				break;
			case "-":
				Double v1 = stack.pop();
				stack.push(stack.pop() - v1);
				break;
			default:
				break;
		}
	}
	
	public Double getValue(){
		return stack.pop();
	}
	
	public boolean isDouble(String val){
		try{
			Double.parseDouble(val);
			return true; //is double
		}catch(Exception e){
			return false; //not double
		}
	}
}
