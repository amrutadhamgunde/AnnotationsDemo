package com.java.annotations;

public class ClassWithDepricatedMethod {
	
	@Deprecated
	public void doIt() {
		System.out.println("In method doIt()");
	}

}
