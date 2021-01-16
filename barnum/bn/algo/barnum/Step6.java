package bn.algo.barnum;

public class Step6 {
	public static void main(String[] args) {
	}

	static long problem1(int[] arr) {
		long count = 0;
		for (long num : arr) {
			count += num;
		}
		return count;
	}
}
