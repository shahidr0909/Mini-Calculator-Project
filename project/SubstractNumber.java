package com.calculater.project;

public class SubstractNumber implements Calculator
  {
	public int calculate(int a , int b) {
		int sub;
		sub = a - b;
		return sub;
	}

	@Override
	public int calculate(int a, int b, int c) {
		return 0;
	}

}
