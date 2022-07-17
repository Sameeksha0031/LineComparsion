package com.lineSystem.java;

import java.util.Scanner;

public class CartesianSystem {

   
	public static void main(String[] args) {
		
	 System.out.println("Welcome to Line Comparison Computation ");
	 Scanner sc = new Scanner(System.in);
	 CartesianSystem obj = new CartesianSystem();
	 CartesianSystem obj1 = new CartesianSystem();
	 Double result1, result2;
	 System.out.println("Line 1 points");
	 System.out.println("Enter the point for x1 :");
	 double x1 = sc.nextDouble();
	 System.out.println("Enter the point for y1 :");
	 double y1 = sc.nextDouble();
	 System.out.println("Enter the point for x2 :");
	 double x2 = sc.nextDouble();
	 System.out.println("Enter the point for y2 :");
	 double y2 = sc.nextDouble();
	 
	 result1=obj.Calculate_length(x1,y1,x2,y2);
	 System.out.println("calculated length for 1st Line :" + result1);
	 //line 2
	 System.out.println("Line 2 points");
	 System.out.println("Enter the point for x1 :");
	 double a1 = sc.nextDouble();
	 System.out.println("Enter the point for y1 :");
	 double b1 = sc.nextDouble();
	 System.out.println("Enter the point for x2 :");
	 double a2 = sc.nextDouble();
	 System.out.println("Enter the point for y2 :");
	 double b2 = sc.nextDouble();
	 
	 result2 = obj.Calculate_length(a1,b1,a2,b2);
	 System.out.println("calculated length for 2nd Line :" + result2);
	 
	 if(result1.equals(result2)) {
	    	
	    	System.out.println("Lines are equal");
	    	
	      } else {
	    	  
	    	  System.out.println("Lines are not equal");
	      }
	    
	 if(result1.compareTo(result2) == 0) {   
	        
	      System.out.println("Line are equal");	
	      
	  }else if(result1.compareTo(result2) == -1) {
		
		System.out.println("Line 1 is Smaller than line 2");   // -1 for less
		
      }else{
		
		System.out.println("Line 1 is greater than line 2");   // 1 for greater
	  }
	
	 
	}
	
	 public double Calculate_length(double x1,double y1,double x2, double y2){
		 double len;
		 len=Math.sqrt((Math.pow(x2-x1,2)) + Math.pow(y2-y1,2));
	 return len;
	 }
}  
