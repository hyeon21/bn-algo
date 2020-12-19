package bn.algo.barnum;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Step5 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		problem4();
	}

	public static void problem1() { //아직 미완성
		Scanner sc = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int comp;
		int count = Integer.parseInt(sc.nextLine());

		String numbersLine = sc.nextLine();
		String[] numbers = numbersLine.split(" ");

		for (int i = 0; i < count; i++) {
			comp = Integer.parseInt(numbers[i]);
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
		
		
	}
}
