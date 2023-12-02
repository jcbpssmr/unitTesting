package com.promineotech;

import java.util.Random;

public class TestDemo {
	public int addPositive(int a, int b) {
		if (a <= 0 || b <= 0) {
			throw new IllegalArgumentException("Both parameters must be positive!");
		} else {
			return a + b;
		}
	}
	public boolean checkForTrue(int a, int b) {
		if (a <= 0 || b <= 0) {
			return true;
		} else {
			return false;
		}
		
	}
	public int randomNumberSquared(){
		int number = getRandomInt();
		int squared = number*number;
		return squared;
		
	}
	public int getRandomInt() {
		    Random random = new Random();
		    return random.nextInt(10) + 1;
		
	}
}
