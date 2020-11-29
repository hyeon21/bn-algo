package bn.algo.genie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Step4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem3();
	}

	public static void problem1() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = "";
		
		try {
			while(!(line = br.readLine()).equals("0 0")) {
				String[] data = line.split(" ");
				
				int a = Integer.parseInt(data[0]);
				int b = Integer.parseInt(data[1]);
				
				int sum = a + b;
				
				bw.write(String.format("%d", sum));
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
	
	public static void problem2() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line = "";
		
		try {
			while((line = br.readLine()) != null) {
				String[] data = line.split(" ");
				
				if(data.length != 2) {
					break;
				}
				
				int a = Integer.parseInt(data[0]);
				int b = Integer.parseInt(data[1]);
				
				int sum = a + b;
				
				bw.write(String.format("%d", sum));
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
	
	public static void problem3() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num = Integer.parseInt(br.readLine());
			String std = String.format("%02d", num);
			int count = 0;

			while(true) {
				count++;
				
				int first = Integer.parseInt(std.substring(0, 1));
				int second = Integer.parseInt(std.substring(1));
				
				int sum = first + second;
				
				std = String.format("%d%d", second, sum % 10);
				
				if(num == Integer.parseInt(std)) {
					bw.write(String.format("%d", count));
					break;
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
