package bn.algo.gromit;

import java.util.Scanner;

public class Step2 {

	public static void main(String[] args) {
		compareGrade();
		
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
		
	}
}
