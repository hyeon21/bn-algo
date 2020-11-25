package bn.algo.gromit;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.println(a * ((b % 100) % 10));
		System.out.println(a * ((b % 100) / 10));
		System.out.println(a * (b / 100));
		System.out.println(a * b);
	}
}

class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}

class WeLoveKriii {
	public static void main(String[] args) {
		System.out.println("강한친구 대한육군");
		System.out.println("강한친구 대한육군");
		
	}
}

class Cat {
	public static void main(String[] args) {
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
	}
}

class Dog {
	public static void main(String[] args) {
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
	}
}

class Plus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.println(a + b);
	}
}

class minus {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.println(a - b);
	}
}

class Multiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.println(a * b);
	}
}

class Division {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.println((double)a / b);
	}
}

class Calcul {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
	}
}

class Remainder {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		System.out.println((a + b) % c);
		System.out.println(((a % c) + (b % c)) % c);
		System.out.println((a * b) % c);
		System.out.println(((a % c) * (b % c)) % c);
	}
}

class RemainderMultiply {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.println(a * ((b % 100) % 10));
		System.out.println(a * ((b % 100) / 10));
		System.out.println(a * (b / 100));
		System.out.println(a * b);
	}
}