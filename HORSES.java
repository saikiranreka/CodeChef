package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

class HORSES {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine().trim());
		PrintWriter out = new PrintWriter(System.out);
		for (int i = 0; i < test; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			int[] arr = new int[n];
			String[] t = br.readLine().trim().split("\\s+");
			for (int j = 0; j < n; j++) {
				arr[j] = Integer.parseInt(t[j].trim());
			}
			Arrays.sort(arr);
			int mindiff = Integer.MAX_VALUE;
			for (int j = 0; j < n - 1; j++) {
				int diff = arr[j + 1] - arr[j];
				if (diff < mindiff) {
					mindiff = diff;
				}
			}
			out.println(mindiff);
		}
		out.close();
	}

}
