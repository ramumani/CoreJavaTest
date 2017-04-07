package com.ramu.ramtech;

import java.math.BigDecimal;

public class AmountVariableTest {
	
	public static void main(String[] args) {
		
		BigDecimal bg = new BigDecimal("10");
		BigDecimal bg2 = new BigDecimal("20");
		
		System.out.println("bg: "+bg);
		
		if (bg.compareTo(bg2)==0) {
			System.out.println("printing...");
		}
			
		
	}
	
}
