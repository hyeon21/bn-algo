package bn.algo.genie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Step2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		problem3();
	}

	public static void problem1() {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();

		if(a > b) {
			System.out.println(">");
		} else if(a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}
	
	public static void problem2() {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		if(a >= 90) {
			System.out.println("A");
		} else if(a >= 80) {
			System.out.println("B");
		} else if(a >= 70) {
			System.out.println("C");
		} else if(a >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
	
	public static void problem3() {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		if(a % 4 == 0 && (a % 100 != 0 || a % 400 == 0)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
	
	public static void problem4() {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a > 0 && b > 0) {
			System.out.println(1);
		} else if(a > 0 && b < 0) {
			System.out.println(4);
		} else if(a < 0 && b > 0) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
	} 
	
	public static void problem5() {
		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();
		int min = scan.nextInt();
		
		if(hour == 0) {
			if(min < 45) {
				hour = 23;
				min = 60 - (45 - min);	
			} else {
				min -= 45;
			}
			
		} else {
			if(min < 45) {
				hour -= 1;
				min = 60 - (45 - min);
			} else {
				min -= 45;
			}
		}
		
		System.out.println(hour + " " + min);
	}
}
