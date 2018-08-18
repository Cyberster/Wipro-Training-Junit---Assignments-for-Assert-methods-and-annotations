/*
i) Create the following class and implement the method to check whether given string is a 
palindrome and return the result,
Class Name : MyUnit
Method : palindromeCheck(String):boolean

(Hint: If the reversed string is equal to the actual string is palindrome string. 
Ex: madam, mom, dad, malayalam )

ii) Create a Junit test class to test the above class.
 * */

package com.w3epic.wiprotraining.assignment2;

public class MyUnit {	
	public boolean palindromeCheck(String input1) {
		input1 = input1.toLowerCase();
		int digitCount = input1.length();
		boolean isPalindrome = true;
		
		int range = digitCount / 2;
		if (digitCount % 2 == 0) range--;
		
		for (int i = 0; i <= range; i++) {
			if (input1.charAt(i) != input1.charAt(digitCount - i - 1)) isPalindrome = false;
		}
		
		return isPalindrome;
	}
}
