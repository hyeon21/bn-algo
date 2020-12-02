package bn.algo.gromit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Step6 {

	public static void main(String[] args) throws IOException {
		countHansu2();
	}
	
	public static long nSum(int[] a) {
		long sum = 0;
		
		for (int n : a) {
			sum += n;
		}
		
		return sum;
	}
	
	public static void selfNumber1() throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		final int LIMIT = 10000 + 1;
		int num, fNum, rNum;
		int[] arrDN = new int[LIMIT];
		
		for (int i = 1; i < LIMIT; i++) {
			num = i;
			
			fNum = num / 10;
			rNum = num % 10;

			num += rNum;

			while (9 < fNum) {
				num += fNum % 10;
				fNum /= 10;
			}
			num += fNum;
			
			if (num < LIMIT) {
				arrDN[num]++;
			}
		}
		
		for (int i = 1; i < LIMIT; i++) {
			if (0 == arrDN[i]) {
				bw.write(i + "\n");
				//System.out.println(i);
			}
		}
		bw.flush();
		bw.close();
	}
	
	public static void selfNumber2() {
		final int LIMIT = 10000 + 1;
		int dn = 0;
		int[] arrDN = new int[LIMIT];
		String strNum = "";
		String[] arrStrNum = new String[5];
		
		for (int i = 1; i < LIMIT; i++) {
			dn = i;
			strNum = "" + i;
			arrStrNum = strNum.split("");
			for (int j = 0; j < arrStrNum.length; j++) {
				dn += Integer.parseInt(arrStrNum[j]);
			}
			if (dn < LIMIT) {
				arrDN[dn]++;
			}
		}
		
		for (int i = 1; i < LIMIT; i++) {
			if (0 == arrDN[i]) {
				System.out.println(i);
			}
		}
	}
	
	public static void countHansu1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int count = 99;
		int numLen = 3;
		int[] arrNums = new int[numLen];
		
		int d = 0;
		int num = 0;
		if (n < 100) {
			bw.write(n + "");
			bw.flush();
			bw.close();
			return;
		}
		
		if (n < 1000) {
			n += 1;
		}
		boolean check = true;
		for (int i = 100; i < n; i++) {
			check = true;
			num = i;
			for (int j = 0; j < numLen; j++) {
				arrNums[j] = num % 10;
				num /= 10;
				if (num == 0) {
					break;
				}
			}
			
			d = arrNums[0] - arrNums[1];
			for (int j = 1; j < numLen-1; j++) {
				if (d != (arrNums[j] - arrNums[j+1])) {
					check = false;
				}
			}
			if (check) {
				count++;
			}
		}
		
		bw.write(count + "");
		bw.flush();
		bw.close();
	}
	
	public static void countHansu2() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		int count = 99;
		int[] arrNums = new int[3];
		
		int d, dd, num;
		if (n < 100) {
			bw.write(n + "");
			bw.flush();
			bw.close();
			return;
		}
		
		if (n < 1000) {
			n += 1;
		}
		for (int i = 100; i < n; i++) {
			num = i;
			for (int j = 0; j < 3; j++) {
				arrNums[j] = num % 10;
				num /= 10;
				if (num == 0) {
					break;
				}
			}
			
			d = arrNums[0] - arrNums[1];
			dd = arrNums[1] - arrNums[2];
			if (d == dd) {
				count++;
			}
		}
		
		bw.write(count + "");
		bw.flush();
		bw.close();
	}
}
