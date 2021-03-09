package com.java.annotations.custom;

public @interface CustomAnnotation {
	String name() default "Attra";
	int count() default 999;
	String[] tags() default {"Attra","Payment","Domain"};
	

}
