package bn.algo.genie;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Step5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		problem7();
	}

	public static void problem1() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num = Integer.parseInt(br.readLine());
			
			String[] split = br.readLine().split(" ");
			
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			
			for(String str : split) {
				int val = Integer.parseInt(str);
				
				if(min > val) {
					min = val;
				}
				
				if(max < val) {
					max = val;
				}
			}
			
			bw.write(String.format("%d %d", min, max));
			bw.flush();
			
			br.close();
			bw.close();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void problem2() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String line = "";
			
			int[] arr = new int[10];

			int index = 1;
			
			int maxIndex = -1;
			int max = Integer.MIN_VALUE;
			while((line = br.readLine()) != null) {
				int val = Integer.parseInt(line);
			
				arr[index] = val;
			
				if(max < val) {
					max = val;
					maxIndex = index;
				}
				
				index++;
			}
			
			bw.write(String.format("%d", max));
			bw.newLine();
			bw.write(String.format("%d", maxIndex));
			bw.flush();
			
			br.close();
			bw.close();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void problem3() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String line = "";
			
			int[] arr = new int[10];
			
			int res = 1;
			while((line = br.readLine()) != null) {
				res *= Integer.parseInt(line);
			}

			while(true) {
				int b = res % 10;
				res /= 10;
				
				arr[b]++;
				
				if(res == 0) {
					break;
				}
			}
			
			for(int val : arr) {
				bw.write(String.format("%d", val));
				bw.newLine();
			}
			br.close();
			bw.close();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void problem4() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String line = "";
			
			int[] arr = new int[42];
			
			int res = 1;
			while((line = br.readLine()) != null) {
				arr[Integer.parseInt(line) % 42]++;
			}

			int count = 0;
			for(int val : arr) {
				if(val != 0) {
					count++;
				}
			}
			
			bw.write(String.format("%d", count));
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
			int num = Integer.parseInt(br.readLine());
			double[] arr = new double[num + 1];
			
			int max = Integer.MIN_VALUE;
			
			String[] split = br.readLine().split(" ");
			
			int index = 1;
			for(String str : split) {
				int val = Integer.parseInt(str);
				
				if(max < val) {
					max = val;
				}
				
				arr[index++] = val;
			}
			
			for(int i = 1; i <= num; i++) {
				arr[i] = arr[i] / max * 100;
				arr[0] += arr[i];
			}
			
			double avg = arr[0] / (arr.length - 1);
			
			bw.write(String.format("%f", avg));
			br.close();
			bw.close();
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void problem6() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= num; i++) {
				String line = br.readLine();
				
				int size = line.length();
			
				int[] arr = new int[80];
				
				int index = 1;
				for(int j = 0; j < size; j++) {
					char str = line.charAt(j);
					
					if(str == 'O') {
						arr[index]++;
						index++;
					} else {
						index = 1;
					}
				}
				
				int sum = 0;
				for(int j = 1; j < arr.length; j++) {
					sum += arr[j] * j;
				}
				
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
	
	public static void problem7() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			int num = Integer.parseInt(br.readLine());
			
			for(int i = 1; i <= num; i++) {
				String[] split = br.readLine().split(" ");
				
				int size = Integer.parseInt(split[0]);
				
				double[] arr = new double[size + 1];

				for(int j = 1; j < split.length; j++) {
					arr[j] = Integer.parseInt(split[j]);
					arr[0] += arr[j];
				}
				
				arr[0] /= size;
				
				double count = 0;
				
				for(int j = 1; j < split.length; j++) {
					if(arr[j] > arr[0]) {
						count++;
					}
				}
				
				bw.write(String.format("%.3f", (count / size * 100)) + "%");
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
}