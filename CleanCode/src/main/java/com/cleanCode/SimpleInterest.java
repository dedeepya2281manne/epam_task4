package com.cleanCode;

import java.util.Scanner;

public class SimpleInterest {
	float principleAmount,rate,time,simpleInterest;
	void readValues(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle Amount : ");
		principleAmount = sc.nextFloat();
		System.out.println("Enter Rate : ");
		rate = sc.nextFloat();
		System.out.println("Enter Time Period : ");
		time = sc.nextFloat();
	}
	void calculateSimpleInterest(){
		simpleInterest = (principleAmount * rate * time)/100;
	}
	void displayAmount(){
		System.out.println("Total Amount : "+simpleInterest);
	}
}
