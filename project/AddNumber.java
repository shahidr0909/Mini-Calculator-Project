package com.calculater.project;

public class AddNumber implements Calculator
  {
	public int calculate(int a , int b) {
		int add;
		add = a + b;
		return add;
	}
	
	public int calculate(int a, int b, int c) {
	    int add;
	    add = a + b + c;
	    return add;



  }
}