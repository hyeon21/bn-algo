package bn.algo.barnum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Step3 {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
	}

	public void problem1() {
		int gugudan = sc.nextInt();
		for (int i = 1; i < 10; i++) {
			System.out.println(gugudan + " * " + i + " = " + gugudan * i);
		}

	}

	public void problem2() {
		int count = sc.nextInt();

		for (int i = 0; i < count; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println(num1 + num2);
		}
	}

	public void problem3() {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int sum = 0;

		for (int i = count; i > 0; i--) {
			sum += i;
		}
		System.out.println(sum);

	}

	public void problem4() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String countNum;

		try {
			countNum = br.readLine();
			int count = Integer.parseInt(countNum);

			String numbers;
			int num1;
			int num2;
			String sum;

			for (int i = 0; i < count; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				num1 = Integer.parseInt(st.nextToken());
				num2 = Integer.parseInt(st.nextToken());
				sum = Integer.toString(num1 + num2);

				bw.write(sum);
				bw.newLine();
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void problem5() {
		Scanner sc = new Scanner(System.in);
		int end = sc.nextInt();

		for (int i = 1; i <= end; i++) {
			System.out.println(i);
		}
	}

	public void problem6() {
		Scanner sc = new Scanner(System.in);
		int start = sc.nextInt();

		for (int i = start; i >= 1; i--) {
			System.out.println(i);
		}
	}

	public void problem7() {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		for (int i = 1; i <= count; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			System.out.println("Case #" + i + ": " + (num1 + num2));
		}
	}

	public void problem8() {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();

		for (int i = 1; i <= count; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();

			System.out.println("Case #" + i + ": " + num1 + " + " + num2 + " = " + (num1 + num2));
		}
	}

	public void problem9() {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 1; i <= count; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void problem10() {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for (int i = 1; i <= count; i++) {
			for (int j = 0; j < count; j++) {
				if (j < count - i)
					System.out.print(" ");
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public void probleom11() {
		Scanner sc = new Scanner(System.in);
		String line1 = sc.nextLine();
		String line2 = sc.nextLine();
		StringTokenizer st = new StringTokenizer(line1);
		StringTokenizer st2 = new StringTokenizer(line2);
		
        int count = Integer.parseInt(st.nextToken());
		int condition = Integer.parseInt(st.nextToken());
		while(st2.hasMoreTokens()) {
			int comp = Integer.parseInt(st2.nextToken()); 
			if(comp < condition) {
				System.out.print(comp);
				System.out.print(" ");
			}
		}
	
	}
}
