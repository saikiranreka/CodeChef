package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class CHEFLUCK {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			boolean flag = true;
			if (n < 4) {
				out.println(-1);
			} else if (n >= 4 && n < 7) {
				out.println(0);
			} else {
				while (flag) {
					int rem = n % 7;
					if (rem % 4 == 0) {
						n = n - rem;
						flag = false;
					} else {
						n = n - 4;
					}
					if (n < 0) {
						break;
					}
				}
				if (n < 0) {
					out.println(-1);
				} else {
					out.println(n);
				}
			}

		}
		out.close();
	}

}
