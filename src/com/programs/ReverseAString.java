package com.programs;

public class ReverseAString {

	// Method 1 - Using bufferorBuild
	public void usingBuffer() {
		String given = "Appu";
		StringBuffer buffer = new StringBuffer();
		buffer.append(given);
		System.out.println(buffer.reverse());
	}

	// Method 2 - Using in built functions
	public void usingBuiltin() {
		String given = "Anjana";
		char[] characterArray = given.toCharArray();
		String reversed = "";

		for (int i = characterArray.length - 1; i >= 0; i--) {
			reversed = reversed + characterArray[i];
		}
		System.out.println(reversed);
	}

	public static void main(String[] args) {
		ReverseAString reverse = new ReverseAString();
		reverse.usingBuffer();

		reverse.usingBuiltin();

	}

}
