package edu.kh.array2.practice.service;

import java.util.Scanner;

public class PracticeService {

	public void practice1() {
		int [][] arr = new int[3][3];
		
			for(int a = 0; a < arr.length; a++) {
				for(int b = 0; b < arr[a].length; b++) {
					System.out.print("("+a+", " + b +")");
					
				}
				
				System.out.println();
			}
			
			
			
	}
	
	public void practice2() {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		
		for(int a = 0; a <arr.length; a++) {
			for(int b = 0; b < arr[a].length; b++) {
				System.out.print(arr[a][b] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice3() {
		int arr[][] = {{16,15,14,13},{12,11,10,9},{8,7,6,5},{4,3,2,1}};
		
		for(int a = 0; a < arr.length; a++) {
			for(int b = 0; b < arr[a].length; b++) {
				System.out.print(arr[a][b] + " ");
			}
			System.out.println();
		}
	}
	
	public void practice4() {
		int arr[][] = new int [4][4];
		int sum = 0;
		
		for(int a = 0; a < arr.length; a++) {
			for(int b = 0; b < arr[a].length; b++) {
				int random = (int)(Math.random()*10)+1;
				arr[a][b] = random;
				sum += a;
				System.out.print(arr[a][b] + " ");
				}
			System.out.println();
			}
			
			
			 
		
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행크기");
		int num1 = sc.nextInt();
		
		System.out.print("열크기");
		int num2 = sc.nextInt();
		
		char[][] arr = new char[num1][num2];
		
		for(int a = 0; a < arr.length; a++) {
			for(int b = 0; b < arr[a].length; b++) {
				int random = (char)(Math.random()*26)+65;
				arr[a][b] = (char) random;
				System.out.print(arr[a][b] + " ");
			}
			System.out.println();
		}
	}
	
}
