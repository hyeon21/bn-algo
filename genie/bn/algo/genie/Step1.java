package bn.algo.genie;

import java.util.Scanner;

public class Step1 {

	public static void main(String[] args) {
		problem11();
	}
	
	public static void problem1() {
		System.out.println("Hello World!");
	}
	
	public static void problem2() {
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
	}
	
	public static void problem3() {
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
	}
	
	public static void problem4() {
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}
	
	public static void problem5() {
		Scanner scan = new Scanner(System.in);
		
		int valLeft = scan.nextInt();
		int valRight = scan.nextInt();
		
		int sum = valLeft + valRight;
		System.out.println(sum);
	}
	
	public static void problem6() {
		Scanner scan = new Scanner(System.in);
		
		int valLeft = scan.nextInt();
		int valRight = scan.nextInt();
		
		int minus = valLeft - valRight;
		System.out.println(minus);
	}
	
	public static void problem7() {
		Scanner scan = new Scanner(System.in);
		
		int valLeft = scan.nextInt();
		int valRight = scan.nextInt();
		
		int multiple = valLeft * valRight;
		System.out.println(multiple);
	}
	
	public static void problem8() {
		Scanner scan = new Scanner(System.in);
		
		double valLeft = scan.nextDouble();
		double valRight = scan.nextDouble();
		
		double divide = valLeft / valRight;
		System.out.println(divide);
	}
	
	public static void problem9() {
		Scanner scan = new Scanner(System.in);
		
		int valLeft = scan.nextInt();
		int valRight = scan.nextInt();
		
		int plus = valLeft + valRight;
		int minus = valLeft - valRight;
		int multiple = valLeft * valRight;
		double quotient = (double) valLeft / (double) valRight;
		int reminder = valLeft % valRight;
		
		System.out.println(plus);
		System.out.println(minus);
		System.out.println(multiple);
		System.out.println(quotient);
		System.out.println(reminder);
	}
	
	public static void problem10() {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int resFirst = (A + B) % C;
		int resSecond = ((A % C) + (B % C)) % C;
		int resThird = (A * B) % C;
		int resFourth = ((A % C) * (B % C)) % C;
		
		System.out.println(resFirst);
		System.out.println(resSecond);
		System.out.println(resThird);
		System.out.println(resFourth);
	}
	
	public static void problem11() {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int B100 = B / 100;
		int B10 = (B - B100 * 100) / 10;
		int B1 = B - (B100 * 100) - (B10 * 10);
		
		int res1 = A * B1;
		int res10 = A * B10;
		int res100 = A * B100;
		int res = res1 + res10 * 10 + res100 * 100;
		
		System.out.println(A * B1);
		System.out.println(A * B10);
		System.out.println(A * B100);
		System.out.println(res);
	}
}
