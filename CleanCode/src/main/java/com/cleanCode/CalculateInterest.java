package com.cleanCode;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class CalculateInterest 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Choose either option 1 or 2 :");
    	System.out.println("1.Simple Interest");
    	System.out.println("2.Compound Interest");
    	SimpleInterest simpleInterest = new SimpleInterest();
    	CompoundInterest compoundInterest = new CompoundInterest();
    	int choice = sc.nextInt();
    	switch(choice){
    		case 1:simpleInterest.readValues();
    			   simpleInterest.calculateSimpleInterest();
    			   simpleInterest.displayAmount();
    			   break;
    		case 2:compoundInterest.readValues();
			   compoundInterest.calculateCompoundInterest();
			   compoundInterest.displayAmount();
			   break;
			default:System.out.println("Please Enter Valid Option!");
    	}
    }
}
