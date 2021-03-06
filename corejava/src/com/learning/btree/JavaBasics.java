package com.learning.btree;

public class JavaBasics {
	
	public static String reverseString(String str) {
		int len = str.length();
		StringBuilder sb = new StringBuilder();
		int ctr = len-1;
		while(ctr >= 0){
			sb.append(str.charAt(ctr));
			ctr--;
		}
		return sb.toString();
	}
	
	public static String reverseByArray(String str) {
		int l = 0;
		int r = str.length() - 1;
		char[] stArray = str.toCharArray();
		while (l < r) {
			char tmp = stArray[l];
			stArray[l] = stArray[r];
			stArray[r] = tmp;
			l++;
			r--;
		}
		return String.valueOf(stArray);
	}
	
	public static String reverseByRecursion(String str) {
		while (str.length() > 0) {
			return str.charAt(str.length() -1)+reverseByRecursion(str.substring(0, str.length()-1));
		}
		return "";
	}
	
	public static String reverseWords(String str) {
		String[] splitted = str.split("\\s+");
		for(int i=splitted.length-1; i>=0; i--) {
			System.out.println(splitted[i]);
		}
		return str;
	}
	
	public static long fact(int n) {
		if(n >=1) {
			return n*fact(n-1);
		}
		return 1l;
	}
	
	public static void fibonacci(int n) {
		int prev1 = 0;
		int prev = 1;
		for (int i=1; i<n; i++) {           
			int next = prev + prev1;
			prev1 = prev;
			prev = next;
			System.out.println(next);
		}
	}
	
	public static int fibonacciR(int n) {
		if(n==0) {
			return 0;
		} else if (n==1) {
			return 1;
		}
		return fibonacciR(n-1) + fibonacciR(n-2);
	}
	
	public static float findHarmonicSum(int terms) {
		float sum = 0.0f;
		for(int i=1; i<terms; i++) {
			sum += 1.0/i;
		}
		return sum;
	}
	
	public static boolean isPalindromeInt(int number) {
		if(number > -10 && number < 10) {
			return true;
		}
		int divisor = 10;
		int remainder = 0;
		int quotient = number;
		int palindrome = 0;
		while(quotient>=10){
			remainder = number%divisor;
			quotient = number/divisor;
			divisor*=10;
		}
		divisor/=10;
		int mm = 1;
		while(divisor>1){
			palindrome+=quotient*mm;
			mm*=10;
			divisor/=10;
			quotient=remainder/divisor;
			remainder=remainder%divisor;
		}
		palindrome+=quotient*mm;
		System.out.println(palindrome);

		return palindrome == number;
	}
	
	public static boolean isPalindrome2(int number) {
		int reversed = 0;
		int copy = number;
		while(number != 0) {
			reversed = reversed*10 + number%10;
			number/=10;
		}
		return reversed==copy;
	}
	
	public static void replaceSpaces(String str) {
		String rep = str.replaceAll("\\s", "%20");
		System.out.println(rep);
	}
	
	public static void printTriangle(int numrows) {
		for(int i=1; i<=numrows; i++) {
			StringBuilder sb = new StringBuilder();
			for (int j=1; j<=i; j++) {
				sb.append(j).append(" ");
			}	
			System.out.println(sb.toString());
		}
	}

	public static void main(String[] args) {
		System.out.println(reverseByArray("valet"));
		System.out.println("fact 4="+fact(4));
		System.out.println(reverseByRecursion("toysand new"));
		fibonacci(8);
		System.out.println(fibonacciR(8));
		reverseWords("a new cent");
		System.out.println("sum="+findHarmonicSum(10));
		System.out.println(isPalindromeInt(1234321));
		System.out.println(isPalindrome2(532235));
		replaceSpaces("space string");
		printTriangle(4);
	}
	
}
