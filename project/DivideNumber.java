package com.calculater.project;

public class DivideNumber implements Calculator
  {
	public int calculate(int a , int b) {
		int div;
		div = a/b;
		return div;

 }

	@Override
	public int calculate(int a, int b, int c) {
		return 0;
	}
}
