package com.sample.programs.practice;

public class Dog extends Animal {
	public static void main(String[] args) {
		Dog d=new Dog();
System.out.println(d instanceof Dog);//true
Dog d1=null;
System.out.println(d1 instanceof Dog);//false
//Dog d2=(Dog) new Animal();
//System.out.println(d2 instanceof Animal);//Compiles successfully but ClassCastException is thrown at runtime  


Animal a=new Dog();  
Dog.method(a);  
	}

	 static void method(Animal a) {
		
			 Dog d=(Dog)a;//downcasting  
		       System.out.println("ok downcasting performed");  
		
		
	}

}
