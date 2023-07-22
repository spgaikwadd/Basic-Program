package com.practiceprogram;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ref = new Scanner(System.in);
		System.out.println("enter any string");
		String s = ref.next();
		

		StringBuilder builder =new StringBuilder(s);
		System.out.println("........" +builder.reverse());
		
	}

}
