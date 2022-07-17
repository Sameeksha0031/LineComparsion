package com.lineSystem.java;

import java.util.Scanner;

public class CartesianSystem {

   
	public static void main(String[] args) {
		
	 System.out.println("Welcome to Line Comparison Computation ");
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the point for x1 :");
	 double x1 = sc.nextDouble();
	 System.out.println("Enter the point for y1 :");
	 double y1 = sc.nextDouble();
	 System.out.println("Enter the point for x2 :");
	 double x2 = sc.nextDouble();
	 System.out.println("Enter the point for y2 :");
	 double y2 = sc.nextDouble();
	 CartesianSystem obj = new CartesianSystem();
	 obj.Calculate_length(x1,y1,x2,y2);
	}
	
	 public double Calculate_length(double x1,double y1,double x2, double y2){
		 double len;
		 len=Math.sqrt((Math.pow(x2-x1,2)) + Math.pow(y2-y1,2));
		 System.out.println("calculated length:" + len);
	 return len;
	 }
}  
