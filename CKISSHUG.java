package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class CKISSHUG {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine().trim());

			int s1 = findpower(2, (int) Math.ceil((k + 1) / 2.0));
			int s2 = findpower(2, (int) Math.floor((k + 1) / 2.0));
			int res = (s1 + s2) % 1000000007 - 2;
			out.println(res);
		}
		out.close();
	}

	private static int findpower(int n, int ceil) {
		if (ceil == 0) {
			return 1;
		} else if (ceil == 1) {
			return n;
		} else if (ceil % 2 == 0) {
			return findpower((n * n) % 1000000007, ceil / 2);
		} else {
			return (n * findpower((n * n) % 1000000007, (ceil - 1) / 2))% 1000000007;
		}
	}
}
