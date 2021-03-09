package com.java.annotations;

/*
 * This example shows that what java annotations looks like and where it can be placed 
 */

@MyAnnotation                              //class
public class BasiAnnotationExmple {
	
	@MyAnnotation                                    //constructor
	public BasiAnnotationExmple() {
	}
	
	@MyAnnotation                             //member vaiable
	private String name = "Attra";
	
	@MyAnnotation                                            //method
	public void printText(@MyAnnotation String text) {         //parameter
		@MyAnnotation                                        //local variable
		String localvar = "localvartext";
	}
	
	@MyAnnotation                                            //static method
	public static void main(@MyAnnotation String args[]) {              //static method parameter
		
	}

}
