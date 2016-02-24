package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

class ANUUND {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int test = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < test; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			String[] tt = br.readLine().trim().split("\\s+");
			int[] arr = new int[n];

			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(tt[j]);
			}
			Arrays.sort(arr);
			int l = 0;
			int r = arr.length - 1;
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < n; j++) {
				if (j % 2 == 0) {
					sb.append(arr[l] + " ");
					l++;
				} else {
					sb.append(arr[r] + " ");
					r--;
				}
			}
			out.println(sb.toString().trim());
		}
		out.close();
	}
}