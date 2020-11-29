package bn.algo.genie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Step3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		problem10();
	}
	
	public static void problem1() {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(a + " * " + i + " = " + a * i);
		}
	}
	
	public static void problem2() {
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for(int i = 1; i <= num; i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			System.out.println(a + b);
		}
	}
	
	public static void problem3() {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}
	
	public static void problem4() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= num; i++) {
				String line = br.readLine();
				
				String[] split = line.split(" ");
				
				int a = Integer.parseInt(split[0]);
				int b = Integer.parseInt(split[1]);
				
				int sum = a + b;
				bw.write(String.format("%d", sum));
				bw.newLine();
			}
			bw.flush();
			
			br.close();
			bw.close();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void problem5() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String line = br.readLine();
			
			int num = Integer.parseInt(line);
			
			for(int i = 1; i <= num; i++) {
				bw.write(String.format("%d", i));
				bw.newLine();
			}
			
			bw.flush();
			
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void problem6() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String line = br.readLine();
			
			int num = Integer.parseInt(line);
			
			for(int i = num; i >= 1; i--) {
				bw.write(String.format("%d", i));
				bw.newLine();
			}
			
			bw.flush();
			
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void problem7() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= num; i++) {
				String line = br.readLine();
				
				String[] split = line.split(" ");
				
				int a = Integer.parseInt(split[0]);
				int b = Integer.parseInt(split[1]);
				
				int sum = a + b;
				
				bw.write(String.format("Case #%d: %d", i, sum));
				bw.newLine();
			}
			bw.flush();
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void problem8() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= num; i++) {
				String line = br.readLine();
				
				String[] split = line.split(" ");
				
				int a = Integer.parseInt(split[0]);
				int b = Integer.parseInt(split[1]);
				
				int sum = a + b;
				
				bw.write(String.format("Case #%d: %d + %d = %d", i, a, b, sum));
				bw.newLine();
			}
			bw.flush();
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void problem9() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num = Integer.parseInt(br.readLine());
			
			StringBuffer space = new StringBuffer();
			for(int i = 1; i <= num; i++) {
				space.append(" ");
			}
			
			StringBuffer nLine = new StringBuffer();
			for(int i = 1; i <= num; i++) {
				nLine.append("*");
				bw.write(space.toString().substring(i) + nLine.toString());
				bw.newLine();
			}
			bw.flush();
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void problem10() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String line = br.readLine();
			String[] split = line.split(" ");
			
			int num = Integer.parseInt(split[0]);
			int std = Integer.parseInt(split[1]);
			
			line = br.readLine();
			split = line.split(" ");
			
			for(int i = 0; i < num; i++) {
				int val = Integer.parseInt(split[i]);
				
				if(std > val) {
					bw.write(String.format("%d", val));
					bw.write(" ");
				}
			}
			
			bw.flush();
			br.close();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
