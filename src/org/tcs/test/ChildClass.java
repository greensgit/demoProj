package org.tcs.test;

public class ChildClass extends ParentClass {
	
	public void childName() {
		System.out.println("Child name is deepika");
	}
	
	public static void main(String[] args) {
		
		ChildClass c = new ChildClass();  //object 1-memory will be allocated (100)
		c.childName();
		c.parentName();
		
	}

}
