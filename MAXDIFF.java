package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

class MAXDIFF {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			int N = Integer.parseInt(t[0].trim());
			int K = Integer.parseInt(t[1].trim());
			int total = 0;
			t = br.readLine().trim().split("\\s+");
			int[] list = new int[N];
			for (int j = 0; j < N; j++) {
				int x = Integer.parseInt(t[j].trim());
				list[j] = x;
				total += x;
			}
			Arrays.sort(list);
			int ksum = 0;
			int aksum = 0;
			for (int j = 0; j < K; j++) {
				ksum += list[j];
				aksum += list[N - 1 - j];
			}

			out.println(Math.max(Math.abs(total - 2 * ksum),
					Math.abs(total - 2 * aksum)));
		}
		out.close();
	}
}