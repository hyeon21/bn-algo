package bn.algo.genie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Step6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem3();
	}

	public static void problem1() {
		long[] arr = new long[100];
		long sum = sum(arr);
	}
	public static long sum(long[] a) {
		long sum = 0;
		for(long val : a) {
			sum += val;
		}
		
		return sum;
	}	

	public static void problem2() {
		int[] arr = new int[10000 + 1];
		for(int i = 1; i <= 10000; i++) {
			int index = d(i);
			
			if(index > 10000) {
				continue;
			}
			arr[index]++;
		}
		
		for(int i = 1; i <= 10000; i++) {
			int val = arr[i];
			if(val == 0) {
				System.out.println(i);
			}
		}
	}
	
	public static int d(int n) {
		int res = n;
		
		int q = n / 10;
		int r = n % 10;
		while(true) {
			res += r;

			if(q == 0) {
				break;
			} else {
				n /= 10;
				q = n / 10;
				r = n % 10;
			}
		}
		
		return res;
	}
	
	public static void problem3() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int val = Integer.parseInt(br.readLine());
			int count = 0;
			
			for(int i = 1; i <= val; i++) {
				boolean res = hansu(i);
				
				if(res) {
					count++;
				}
			}
			
			bw.write(String.format("%d", count));
			bw.flush();
			bw.close();
			br.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean hansu(int val) {
		int index = 0;
		int[] arr = new int[4];
		while(true) {
			int q = val / 10;
			int r = val % 10;
			
			arr[index++] = r;
			if(q == 0) {
				break;
			} else {
				val /= 10;
			}
		}

		int[] min = new int[3];
		for(int i = 0; i < index - 1; i++) {
			min[i] = arr[i + 1] - arr[i];
		}
		
		boolean flag = true;
		for(int i = 0; i < index - 2; i++) {
			if(min[i] != min[i + 1]) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
