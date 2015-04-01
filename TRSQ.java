package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class TRSQ {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			int b = Integer.parseInt(br.readLine().trim());
			int m = b / 2;
			if (b == 0 || b == 1 || b == 2) {
				out.println(0);
			} else {
				int x = m * (m - 1) / 2;
				out.println(x);
			}
		}
		out.close();
	}

}
