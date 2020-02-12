package com.cleanCode;

import java.util.Scanner;

public class CompoundInterest {
	float principleAmount,rate,time,compoundInterest,n;
	void readValues(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle Amount : ");
		principleAmount = sc.nextFloat();
		System.out.println("Enter Rate : ");
		rate = sc.nextFloat();
		System.out.println("Enter Time Period : ");
		time = sc.nextFloat();
		//System.out.println("Enter Number of times the amount should be compunded : ");
		//n = sc.nextFloat();
	}
	void calculateCompoundInterest(){
		compoundInterest = (float) (principleAmount * (Math.pow((1 + rate / 100.0), time))); 
	}
	void displayAmount(){
		System.out.println("Total Amount : "+compoundInterest);
	}
	

}
