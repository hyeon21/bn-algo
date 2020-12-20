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
			if(i == 0) {
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
			if(remainder[i] != 0) {
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
		
		for(int i = 0; i < subjectsNum; i++) {
			score_Int[i] = Integer.parseInt(score[i]);
		}
		
		Arrays.sort(score_Int);
		max_score = score_Int[score_Int.length - 1];
		
		for(int eachScore : score_Int) {
			total_score += (double)eachScore / max_score * 100 ;
		}
		
		System.out.println(total_score / subjectsNum);
		
		
		
	}
}
