package bn.algo.barnum;

import java.util.Scanner;

public class Step2 {
	Scanner sc = new Scanner(System.in);

	public void problem1() {
		int num1 =  sc.nextInt();
		int num2 =  sc.nextInt();
		
		if(num1 > num2) {
			System.out.println(">");
		}
		else if(num1 < num2) {
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}
	}

	public void problem2() {
		int score = sc.nextInt() / 10;
		
		switch(score) {
		case 10: case 9:
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
		default:
			System.out.println("F");
		}
	}

	public void problem3() {
		int year = sc.nextInt();
		if(((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}

	public void problem4() {
		int x = sc.nextInt();
		int y = sc.nextInt();

		if (x < 0) {
			if (y < 0) {
				System.out.println("3");
			} else {
				System.out.println("2");

			}
		} else {
			if (y < 0) {
				System.out.println("4");
			} else {
				System.out.println("1");
			}

		}
	}

	public void problem5() {
		int hour = sc.nextInt();
		int minute = sc.nextInt();

		if (minute >= 45) {
			minute -= 45;
			System.out.print(hour + " " + minute);
		} else {
			int leftMinute = 45 - minute;
			minute = 60 - leftMinute;

			hour -= 1;
			if (hour < 0) {
				hour = 23;
			}
			System.out.print(hour + " " + minute);
		}
	}
}
