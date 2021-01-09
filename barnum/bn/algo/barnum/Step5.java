package bn.algo.barnum;

import java.util.Arrays;
import java.util.Scanner;

public class Step5 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		problem5();
	}

	public static void problem1() {
		Scanner sc = new Scanner(System.in);
		int min = 0;
		int max = 0;
		int comp;
		int count = Integer.parseInt(sc.nextLine());

		String numbersLine = sc.nextLine();
		String[] numbers = numbersLine.split(" ");

		for (int i = 0; i < count; i++) {
			comp = Integer.parseInt(numbers[i]);
			if (i == 0) {
				min = comp;
				max = comp;
				continue;
			}

			if (comp < min) {
				min = comp;
			} else if (comp > max) {
				max = comp;
			}
		}
		System.out.println(min + " " + max);
	}

	public static void problem2() {
		Scanner sc = new Scanner(System.in);
		int temp;
		int max = 0;
		int index = -1;

		for (int i = 0; i < 9; i++) {
			temp = sc.nextInt();
			if (i == 0) {
				max = temp;
				index = i + 1;
				continue;
			}
			if (temp > max) {
				max = temp;
				index = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}

	public static void problem3() {
		Scanner sc = new Scanner(System.in);
		int sum = 1;
		int[] count = new int[10];
		int temp;

		for (int i = 0; i < 3; i++) {
			sum *= sc.nextInt();
		}
		String[] sumStr = String.valueOf(sum).split("");
		for (int i = 0; i < sumStr.length; i++) {
			temp = Integer.parseInt(sumStr[i]);
			count[temp]++;
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println(count[i]);
		}

	}

	public static void problem4() {
		Scanner sc = new Scanner(System.in);

		int[] remainder = new int[42];
		int count = 0;
		int index;

		for (int i = 0; i < 10; i++) {
			index = sc.nextInt() % 42;
			remainder[index]++;
		}

		for (int i = 0; i < remainder.length; i++) {
			if (remainder[i] != 0) {
				count++;
			}
		}
		System.out.println(count);

	}

	public static void problem5() {
		Scanner sc = new Scanner(System.in);

		int subjectsNum = Integer.parseInt(sc.nextLine());
		int[] score_Int = new int[subjectsNum];
		int max_score;
		double total_score = 0;

		String scores = sc.nextLine();
		String[] score = scores.split(" ");

		for (int i = 0; i < subjectsNum; i++) {
			score_Int[i] = Integer.parseInt(score[i]);
		}

		Arrays.sort(score_Int);
		max_score = score_Int[score_Int.length - 1];

		for (int eachScore : score_Int) {
			total_score += (double) eachScore / max_score * 100;
		}

		System.out.println(total_score / subjectsNum);

	}

	public static void problem6() {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String QuizStr;
		String[] QuizStr_Arr;
		int total_score;
		int acc_score;

		for (int i = 0; i < count; i++) {
			total_score = 0;
			acc_score = 0;
			QuizStr = sc.next();
			QuizStr_Arr = QuizStr.split("");

			for (String OX_char : QuizStr_Arr) {
				if (OX_char.equals("O")) {
					acc_score++;
					total_score += acc_score;
				} else {
					acc_score = 0;
				}
			}
			System.out.println(total_score);
		}
	}

	public static void problem7() {
		Scanner sc = new Scanner(System.in);
		double sum;
		int people_num;
		int above_average;
		double average;
		int count = sc.nextInt();
		sc.nextLine();

		String[] line_arr;

		for (int i = 0; i < count; i++) {
			sum = 0;
			average = 0;
			above_average = 0;
			line_arr = sc.nextLine().split(" ");
			people_num = Integer.parseInt(line_arr[0]);

			for (int j = 1; j < line_arr.length; j++) {
				sum += Integer.parseInt(line_arr[j]);
			}

			average = sum / people_num; 

			for (int k = 1; k < line_arr.length; k++) {
				if (Integer.parseInt(line_arr[k]) > average) {
					above_average++; 
				}
			}
			System.out.printf("%.3f", ((double) above_average / people_num) * 100); 
			System.out.println("%"); 
			

		}
	}
}
