package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class CHEFGR {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			String t[] = br.readLine().trim().split("\\s+");
			int N = Integer.parseInt(t[0].trim());
			int M = Integer.parseInt(t[1].trim());
			int sum = 0;
			t = br.readLine().trim().split("\\s+");
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < N; j++) {
				int k = Integer.parseInt(t[j].trim());
				sum += k;
				if (k > max) {
					max = k;
				}
			}
			if ((M + sum) / N >= max && (M + sum) % N == 0) {
				out.println("Yes");
			} else {
				out.println("No");
			}
		}
		out.close();
	}
}
