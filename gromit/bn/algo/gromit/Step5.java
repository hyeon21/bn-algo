package bn.algo.gromit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Step5 {

	public static void main(String[] args) throws IOException {
		isAboveAverage();
	}

	public static void getMinMax() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String count = br.readLine();
		String[] arrStr = br.readLine().split(" ");
		br.close();
		
		int[] arrNums = Arrays.stream(arrStr).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(arrNums);
		System.out.println(arrNums[0] + " " + arrNums[arrNums.length-1]);
	}
	
	public static void getMaxValue() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		int max = 0;
		int index = 1;
		
		for (int i = 1; i <= 9; i++) {
			num = Integer.parseInt(br.readLine());
			if (max < num) {
				max = num;
				index = i;
			}
		}
		br.close();
		System.out.println(max);
		System.out.println(index);
		
	}
	
	public static void getNumCount() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String strValue = (Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine())) + "";
		br.close();
		int curNum = 0;
		int[] arrResult = new int[10];
		
		for (int i = 0; i < strValue.length(); i++) {
			curNum = Integer.parseInt(Character.toString(strValue.charAt(i)));
			for (int j = 0; j < 10; j++) {
				if (curNum == j) {
					arrResult[j] += 1;
					continue;
				}
			}
		}
		
		for (int num : arrResult) {
			System.out.println(num);
		}
	}
	
	public static void getRemainderCount() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arrContainer = new int[10];
		int result = 0;
		int count = 0;
		
		for (int i = 0; i < 10; i++) {
			arrContainer[i] = Integer.parseInt(br.readLine()) % 42;
			count = 0;
			for (int j = 0; j < i; j++) {
				if (arrContainer[i] == arrContainer[j]) {
					count++;
					break;
				}
			}
			
			if (count == 0) {
				result++;
			}
		}
		
		System.out.println(result);
	}
	
	public static void getNewAverage() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int subjectCount = Integer.parseInt(br.readLine());
		int score = 0;
		int highestScore = 0;
		int totalScore = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		
		for (int i = 0; i < subjectCount; i++) {
			score = Integer.parseInt(st.nextToken()); 
			totalScore += score;
			if (highestScore < score) {
				highestScore = score; 
			}
		}
		
		double newAverage = 100.0 * totalScore / highestScore / subjectCount;
		System.out.println(newAverage);
	}
	
	public static void ox() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		int oxLength, oCombo, sum;
		String[] ox;
		
		for (int i = 0; i < count; i++) {
			ox = br.readLine().split("");
			oxLength = ox.length;
			oCombo = 0;
			sum = 0;
			for (int j = 0; j < oxLength; j++) {
				
				if (ox[j].equals("O")) {
					oCombo++;
					sum += oCombo;
				} else {
					oCombo = 0;
				}
				
			}
			System.out.println(sum);
		}
	} 
	
	public static void isAboveAverage() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		int count, sum;
		float average, above, abovePer;
		int[] score;
		
		
		for (int i = 0; i < testCase; i++) {
			score = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
			count = score[0];
			sum = 0;
			average = 0;
			above = 0;
			abovePer = 0;

			for (int j = 1; j <= count; j++) {
				sum += score[j];
			}
			
			average = (float)sum / count; 
			
			for (int k = 1; k <= count; k++) {
				if (average < score[k]) {
					above++;
				}
			}
			
			abovePer = (float) (above / count * 100.0);
			System.out.printf("%.3f", abovePer);
			System.out.println("%");
		}
	}
	
}
