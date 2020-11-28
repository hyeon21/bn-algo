package bn.algo.barnum;

import java.util.Scanner;

public class Step2 {
	Scanner sc = new Scanner(System.in);

	public void problem1() {

	}

	public void problem2() {

	}

	public void problem3() {

	}

	public void problem4() {

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
			if(hour < 0) {
				hour = 23;
			}
			System.out.print(hour + " " + minute);
		}
	}
}
