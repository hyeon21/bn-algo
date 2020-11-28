package bn.algo.barnum;

import java.util.Scanner;

public class Step1 {
	Scanner sc = new Scanner(System.in);

	public void problem2() {
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
	}

	public void problem3() {
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.print(" \\(__)|");
	}

	public void problem4() {
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.print("||_/=\\\\__|");
		
	}

	public void problem5() {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.print(num1 - num2);
	}

	public void problem6() {
		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		System.out.print(num1 / num2);
	}

	public void problem7() {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
	}

	public void problem8() {
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		System.out.println((A + B) % C);
		System.out.println(((A % C) + (B % C)) % C);
		System.out.println((A * B) % C);
		System.out.println((((A % C) * (B % C)) % C));
	}

	public void problem9() {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
	}

	public void problem10() {
		   int num1 = sc.nextInt();
    	   int num2 = sc.nextInt();
    	   
    	   String[] sepNum = String.valueOf(num2).split("");
    	   
    	   for(int i = sepNum.length -1;i >= 0;i--) {
    		   System.out.println(num1 * Integer.parseInt(sepNum[i]));
    	   }
    	   System.out.print(num1*num2);
	}
}
