package com.testversion;


public class main {

	public static void main(String[] args) {
		Calculator(1,2);
		Calculator(2,4);
	}
	
	
	public static void Calculator(int val1, int val2){
		System.out.println("Addition: "+(val1+val2));
		System.out.println("Sub: "+(val1 - val2));
		System.out.println("Multiply: "+(val1*val2));
	}
	
	public static int Stuff(){
		System.out.println("I am here");
	}

}
