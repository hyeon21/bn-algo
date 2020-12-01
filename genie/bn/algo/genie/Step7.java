package bn.algo.genie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Step7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem9();
	}
	
	public static void problem1() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int ascii = br.read();
			
			bw.write(String.format("%d", ascii));
			
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void problem2() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num = Integer.parseInt(br.readLine());
			
			String line = br.readLine();
			
			int sum = 0;
			for(int i = 0; i < num; i++) {
				sum += Integer.parseInt(line.substring(i, i + 1));
			}
			bw.write(String.format("%d", sum));
			
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void problem3() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String line = br.readLine();

			int[] arr = new int[26];
			for(int i = 0, size = arr.length; i < size; i++) {
				arr[i] = -1;
			}
			
			for(int i = 0, size = line.length(); i < size; i++) {
				char alpha = line.charAt(i);
				int index = alpha - 'a';
				
				if(arr[index] == -1) {
					arr[index] = i;
				}
			}
			
			for(int val : arr) {
				bw.write(String.format("%d ", val));
			}
			
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void problem4() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= num; i++) {
				String line = br.readLine();
				String[] split = line.split(" ");
				
				int repCnt = Integer.parseInt(split[0]);
				String str = split[1];
				
				for(int j = 0; j < str.length(); j++) {
					char alpha = str.charAt(j);
					
					for(int k = 0; k < repCnt; k++) {
						bw.write(alpha);
					}
				}
				bw.newLine();
			}
			
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void problem5() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String line = br.readLine();
			line = line.toUpperCase();
			
			int[] arr = new int[26];
			for(int i = 0, size = line.length(); i < size; i++) {
				char alpha = line.charAt(i);
				
				arr[alpha - 'A']++;
			}
			
			int cnt = 0;
			int max = 0;
			int index = 0;
			for(int i = 0, size = arr.length; i < size; i++) {
				int val = arr[i];
				if(max < val) {
					cnt = 0;
					index = i;
					max = val;
					cnt++;
				} else if(max == val) {
					cnt++;
				}
			}
			
			if(cnt > 1) {
				bw.write("?");
			} else {
				bw.write('A' + index);
			}
		
			bw.flush();
			bw.close();
			br.close();
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
			String[] split = line.split(" ");
		
			int cnt = 0;
			
			for(String word : split) {
				if(!word.equals("")) {
					cnt++;
				}
			}
			bw.write(String.format("%d", cnt));
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void problem7() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String line = br.readLine();
			String[] split = line.split(" ");

			int[] arr = new int[split.length];

			int index = 0;
			for(String strNum : split) {
				StringBuffer strRevNum = new StringBuffer();
				for(int i = strNum.length() - 1; i >= 0; i--) {
					strRevNum.append(strNum.charAt(i));
				}
				int revNum = Integer.parseInt(strRevNum.toString());
				arr[index++] = revNum;
			}
			
			int max = Integer.MIN_VALUE;
			for(int val : arr) {
				if(val > max) {
					max = val;
				}
			}
			
			bw.write(String.format("%d", max));
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void problem8() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int[] dial = new int[8];
			dial[0] = 3;
			dial[1] = 3;
			dial[2] = 3;
			dial[3] = 3;
			dial[4] = 3;
			dial[5] = 4;
			dial[6] = 3;
			dial[7] = 4;
			int[] arr = new int[26];
			char std = 'A';
			
			int num = 3;
			for(int val : dial) {
				for(int i = 0; i < val; i++) {
					arr[std++ - 'A'] = num;
				}
				num++;
			}
			
			int sum = 0;
			String line = br.readLine();
			for(int i = 0, size = line.length(); i < size; i++) {
				char alpha = line.charAt(i);
				sum += arr[alpha - 'A'];
			}
			
			bw.write(String.format("%d", sum));
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void problem9() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String[] croatia = new String[8];
			croatia[0] = "c=";
			croatia[1] = "c-";
			croatia[2] = "dz=";
			croatia[3] = "d-";
			croatia[4] = "lj";
			croatia[5] = "nj";
			croatia[6] = "s=";
			croatia[7] = "z=";
			
			String line = br.readLine();
			
			int count = 0;

			for(int i = 0, size = line.length(); i < size;) {
				String alpha = "";
				if(i == size - 1) {
					alpha = line.substring(i, i + 1);
				} else if(i == size - 2){
					alpha = line.substring(i, i + 2);
				} else {
					alpha = line.substring(i, i + 3);
				}
				
				boolean find = false;
				while(alpha.length() != 1) {
					find = isCroatia(croatia, alpha);

					if(find) {
						break;
					}
					
					alpha = alpha.substring(0, alpha.length() - 1);
				}
				
				if(find) {
					i += alpha.length();
				} else {
					i += 1;
				}

				count++;
			}
			
			bw.write(String.format("%d", count));
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static boolean isCroatia(String[] croatia, String word) {
		boolean find = false;
		for(String cro : croatia) {
			if(cro.equals(word)) {
				find = true;
				break;
			}
		}
		return find;
	}
}
