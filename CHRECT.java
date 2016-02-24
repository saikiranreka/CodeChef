package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class CHRECT {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			int r = Integer.parseInt(t[0].trim());
			int c = Integer.parseInt(t[1].trim());
			int k = Integer.parseInt(t[2].trim());
			if (r > c) {
				int temp = r;
				r = c;
				c = temp;
			}
			if (r == 1) {
				if (c == 1 || c == 2) {
					out.println(0);
				} else {
					out.println(k);
				}
			} else {
				out.println(ceil(k));
			}
		}
		out.close();
	}

	private static int ceil(int i) {
		if (i % 2 == 0) {
			return i / 2;
		} else {
			return i / 2 + 1;
		}
	}

}
