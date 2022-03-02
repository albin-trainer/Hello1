package com.lnt;

public class Calculator {
public static void main(String [] args){
	System.out.println("Hello");
	int a=10;
}
	public Calculator() {
		System.out.println("constructor");
	}
 public int add(int a,int b) {
	System.out.println("adding");
	 return a+b;
 }
 
 public int diff(int a,int b) {

	 return a-b;
 }
 
 
 public int product(int a,int b) {
	
	 return a*b;
 }
 
 public int div(int a,int b) {
	
	 return a/b;
 }
}
