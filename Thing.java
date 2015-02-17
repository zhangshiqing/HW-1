package HW1;

import java.lang.String;

public class Thing
extends java.lang.Object{
	
	java.lang.String name;
	private String className;
	
	public Thing(java.lang.String theName) {
		name = theName;
	}
	

	public java.lang.String toString() {
		className = getClass().getSimpleName();
		if (className == "Thing")
			return name;
		else
			return (name + " " + className);
	}
}
