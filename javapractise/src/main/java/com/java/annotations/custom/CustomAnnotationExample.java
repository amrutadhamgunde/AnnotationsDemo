package com.java.annotations.custom;

@CustomAnnotation
public class CustomAnnotationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@CustomAnnotation(count=123)
		int tmpVar = 0 ;
		
		System.out.println("tmpVar :"+tmpVar);
		

	}

}
