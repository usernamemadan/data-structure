package com.algorithms;

public class AnagramAndPalindrome {
	public static void main(String[] args) {
		for (int i = 0; i <= 1000; i++) {
			if (isPrime(i) && isPalindrome(i)) {
				System.out.print(i + " ");
			}
			
		}

	}
	
	public static boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isPalindrome(int n) {
		 int temp = n;    
		 int sum = 0;
		  while(n>0){    
		   int r = n%10;  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   return true;
		  else    
		   return false;   
	}
}
