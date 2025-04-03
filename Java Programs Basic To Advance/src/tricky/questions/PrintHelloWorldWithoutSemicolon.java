package com.tricky.questions;

public class PrintHelloWorldWithoutSemicolon {

	public static void main(String[] args) {
		/*
		 * Method One
		 */
		if(System.out.printf("Hello World \n") == null)
		{
			
		}
		/*
		 * Method Two
		 */
		if(System.out.append("Hello World \n") == null)
		{
			
		}
		/*
		 * Method Three
		 */
		if(System.out.printf("Hello World \n").equals(null))
		{
			
		}
		/*
		 * Method Four
		 */
		for(System.out.println("Hello World");0<1;)
		{
			
		}
	}
}
