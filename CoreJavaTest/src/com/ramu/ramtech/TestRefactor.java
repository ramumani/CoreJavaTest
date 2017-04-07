package com.ramu.ramtech;

public class TestRefactor {
	
	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		
		int d = getCalc(a, b, c);
		
		System.out.println("d:"+d);
		
	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	private static int getCalc(int a, int b, int c) {
		int d = a + b *c /a +b;
		return d;
	}

}
