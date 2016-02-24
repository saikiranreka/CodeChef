package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

class JOHNY {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			String[] t = br.readLine().trim().split(" ");
			int[] a = new int[n + 1];
			for (int j = 1; j <= n; j++) {
				a[j] = Integer.parseInt(t[j - 1]);
			}
			int value = a[Integer.parseInt(br.readLine().trim())];
			Arrays.sort(a);
			int start = 1;
			int end = n;
			int pos = binarySearch(a, start, end, value);
			out.println(pos);
		}
		out.close();
	}

	public static int binarySearch(int[] a, int start, int end, int value) {
		int mid = (start + end) / 2;
		if (a[mid] > value) {
			return binarySearch(a, start, mid, value);
		}
		if (a[mid] < value) {
			return binarySearch(a, mid, end, value);
		}
		if (a[mid] == value) {
			return mid;
		}
		return 0;
	}

}
