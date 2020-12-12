package bn.algo.barnum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Step4 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Step4 s = new Step4();
		s.problem3();
	}

	public void problem1() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			if (num1 == 0 && num2 == 0) {
				break;
			}
			System.out.println(num1 + num2);
		}

	}

	public void problem2() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			System.out.println(num1 + num2);
		}
	}

	public void problem3() {
		Scanner sc = new Scanner(System.in);
		int cycle = 0;
		int num = sc.nextInt();
		String num_str = "";
		String[] arr_str;

		if (num == 0) {
			cycle++;
			System.out.println(cycle);
			return;
		}

		if (num < 10) {
			num_str = "0" + Integer.toString(num);
		} else {
			num_str = Integer.toString(num);
		}

		while (true) {
			if (num == Integer.parseInt(num_str) && cycle != 0) {
				System.out.println(cycle);
				break;
			}
			arr_str = num_str.split("");

			int sum = Integer.parseInt(arr_str[0]) + Integer.parseInt(arr_str[1]);
			String temp_str = Integer.toString(sum);

			String comp = arr_str[1] + temp_str.charAt(temp_str.length() - 1);
			num_str = comp;
			cycle++;

		}
	}
}
