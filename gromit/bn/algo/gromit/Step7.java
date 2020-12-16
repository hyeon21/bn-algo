package bn.algo.gromit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Step7 {

	public static void main(String[] args) throws IOException {
		groupWordCount();
	}

	public static void getAscii() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int ch = (int)(br.readLine().charAt(0));
		br.close();
		
		System.out.println(ch);
	}
	
	public static void getSum() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int length = Integer.parseInt(br.readLine());
		String[] arrNums = br.readLine().split("");
		int sum = 0;
		for (int i = 0; i < length; i++) {
			sum += Integer.parseInt(arrNums[i]);
		}
		System.out.println(sum);
	}
	
	public static void hasS() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		br.close();
		
		int sL = s.length();
		int a = 97;
		int z = 122;
		int index = 0;
		boolean flag = false;

		
		for (int i = a; i <= z; i++) {
			flag = false;
			for (int j = 0; j < sL; j++) {
				if ((int)s.charAt(j) == i) {
					flag = true;
					index = j;
					break;
				}
			}
			if (flag) {
				bw.write(index + " ");
			} else {
				bw.write("-1 ");
			}
		}
		bw.flush();
		bw.close();
	}
	
	public static void repeatString() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int tcCount = Integer.parseInt(br.readLine());
		int repeat = 0;
		String[] tcStr = new String[2];
		String str = "";
		int strLength = 0;
		
		for (int i = 0; i < tcCount; i++) {
			tcStr = br.readLine().split(" ");
			repeat = Integer.parseInt(tcStr[0]);
			str = tcStr[1];
			strLength = str.length();
			for (int j = 0; j < strLength; j++) {
				for (int k = 0; k < repeat; k++) {
					bw.write(str.charAt(j));
				}
			}
			bw.write("\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static void usedMost() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		br.close();
		
		int wordLength = word.length();
		int a = 65;
		int z = 90;
		int max = 0;
		int index = 0;
		int count = 0;
		int[] arrAlphabet = new int[26]; 
		for (int i = 0; i < wordLength; i++) {
			for (int j = a; j <= z; j++) {
				index = (int)(word.charAt(i));
				if (90 < index) {
					index -= 32;
				}
				if (index == j) {
					arrAlphabet[j-65]++;
					break;
				}
			}
		}
		
		for (int i = 0; i < 26; i++) {
			if (max < arrAlphabet[i]) {
				max = arrAlphabet[i];
				index = i;
			}
		}
		
		for (int i = 0; i < 26; i++) {
			if (max == arrAlphabet[i]) {
				count++;
				
			}
		}
		
		if (1 < count) {
			System.out.println("?");
		} else {
			System.out.println((char)(index+65));
		}
	}
	
	
	public static void howManyWords() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String sentence = br.readLine();
		br.close();
		String[] arrWord = sentence.trim().split(" ");
		
		if (arrWord[0].length() == 0) {
			System.out.println(0);
		} else {
			System.out.println(arrWord.length);
		} 
	}
	
	public static void theWayHeReadsNumbers() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String twoNums = br.readLine();
		br.close();
		String[] arrNum = twoNums.split(" ");
		int numA = Integer.parseInt(new StringBuffer(arrNum[0]).reverse().toString());
		int numB = Integer.parseInt(new StringBuffer(arrNum[1]).reverse().toString());
		int bigNum = numA < numB ? numB : numA;
		System.out.println(bigNum);
	}
	
	public static void grandmasPhoneNumber()throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strPhoneNumber = br.readLine();
		br.close();
		
		int length = strPhoneNumber.length();
		int num = 0;
		int time = 0;
		
		for (int i = 0; i < length; i++) {
			num = (int)strPhoneNumber.charAt(i) - 65;
			
			if (num < 3) {
				time += 3;
			} else if (num < 21) {
				time += (num / 3) + 3;
			} else {
				time += 10;
			}
			
			if (num == 18 || num == 21) {
				time--;
			}
		}
		
		System.out.println(time);
	}
	
	public static void croatiaAlphabet() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arrCA = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String words = br.readLine();
		br.close();
		
		int index;
		int totalCount = words.length();
		for (String ca : arrCA) {
			index = 0;
			while (words.indexOf(ca, index) != -1) {
				index = words.indexOf(ca, index) + 1;
				totalCount--;
			};
		}
		
		System.out.println(totalCount);
	}
	
	public static void groupWordCount() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tcWord = Integer.parseInt(br.readLine());
		String word = "";
		char curCh = ' ';
		boolean isGroupWord = true;
		boolean isGroupEnd = false;
		int wordLength;
		int groupWordCount = 0;
		
		for (int i = 0; i < tcWord; i++) {
			word = br.readLine();
			wordLength = word.length();
			if (wordLength == 1) {
				groupWordCount++;
				continue;
			}
			isGroupWord = true;
			for (int j = 0; j < wordLength; j++) {
				isGroupEnd = false;
				curCh = word.charAt(j);
				for (int k = j+1; k < wordLength; k++) {
					if (curCh == word.charAt(k)) {
						if (isGroupEnd) {
							isGroupWord = false;
							break;
						}
						continue;
					} else {
						isGroupEnd = true;
					}
				}
			}

			if (isGroupWord) {
				groupWordCount++;
			}
		}
		br.close();
		
		System.out.println(groupWordCount);
	}
	
	
	
}
