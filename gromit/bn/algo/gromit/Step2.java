package bn.algo.gromit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Step2 {

	public static void main(String[] args) throws IOException {
		alarmsClocks();
		
	}
	
	public static void compare() {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		if (a > b) {
			System.out.println(">");
		} else if (a < b) {
			System.out.println("<");
		} else {
			System.out.println("==");
		}
	}
	
	public static void compareGrade() {
		Scanner scanner = new Scanner(System.in);
		int a;
		a = scanner.nextInt();
		
		switch (a / 10) {
			case 10: 
				System.out.println("A");
				break;
			case 9:
				System.out.println("A");
				break;
			case 8:
				System.out.println("B");
				break;
			case 7:
				System.out.println("C");
				break;
			case 6:
				System.out.println("D");
				break;
			default :
				System.out.println("F");
		}
	}
	
	public static void isLeapYear() {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int isLeapYear = 0;
		
		if (year % 4 == 0) {
			if (year % 100 != 0 || year % 400 == 0) {
				isLeapYear = 1;
			}
		}
		
		System.out.println(isLeapYear);
	}
	
	public static void quadrantN() {
		int quadrant = 0;
		Scanner scanner = new Scanner(System.in);
		int coordX, coordY;
		
		coordX = scanner.nextInt();
		coordY = scanner.nextInt();
		
		if (0 < coordY) {
			if (0 < coordX) {
				quadrant = 1;
			} else {
				quadrant = 2;
			}
		} else {
			if (coordX < 0) {
				quadrant = 3;
			} else {
				quadrant = 4;
			}
		}
		
		System.out.println(quadrant);
	}
	
	public static void alarmsClocks() throws IOException {
		int hh, mm;
		int modifiedHour, modifiedMin;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		hh = Integer.parseInt(st.nextToken());
		mm = Integer.parseInt(st.nextToken());
		
		modifiedHour = hh;
		modifiedMin = mm - 45;
		
		if (modifiedMin < 0) {
			modifiedHour--;
			if (modifiedHour < 0) {
				modifiedHour = 23;
			}
			modifiedMin += 60;
		}
		
		System.out.println(modifiedHour + " " + modifiedMin);
	}
}
