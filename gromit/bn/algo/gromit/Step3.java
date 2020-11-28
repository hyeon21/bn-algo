package bn.algo.gromit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Step3 {

	public static void main(String[] args) throws IOException {
		smallerThanX();
	}
	
	public static void gugudan() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}

	public static void repeatAdd() {
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		int[] arrSum = new int[count];
		
		for (int i = 0; i < count; i++) {
			arrSum[i] = scanner.nextInt() + scanner.nextInt(); 
		}
		
		for (int i = 0; i < count; i++) {
			System.out.println(arrSum[i]); 
		}
	}
	
	public static void factorial() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}
	
	public static void fastAdd() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int tCount = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < tCount; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static void printToN() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			bw.write(i + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static void nOtTnirp() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = n; i >= 1; i--) {
			bw.write(i + "\n");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static void caseAdd() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int tCount = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= tCount; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write("Case #" + i + ": ");
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static void prettyAdd() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int tCount = Integer.parseInt(br.readLine());
		int a, b, sum;
		
		for (int i = 1; i <= tCount; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			sum = a + b;
			bw.write("Case #" + i + ": ");
			bw.write(a + " + " + b + " = " + sum + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static void printStar() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
	
	public static void printStarRight() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		for (int i = 1; i <= n; i++) {
			for (int j = n - i; j >= 0; j--) {
				bw.write(" ");
			}
			for (int j = 1; j <= i; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
	}
	
	public static void smallerThanX() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int count = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int cN;
		
		st = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		for (int i = 0; i < count; i++) {
			cN = Integer.parseInt(st.nextToken());
			if (cN < x) {
				bw.write(cN + " ");
			}
		}
		bw.flush();
		bw.close();
	}
	
}
