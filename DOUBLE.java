package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class DOUBLE {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			if (n % 2 == 0) {
				out.println(n);
			} else {
				out.println(n - 1);
			}
		}
		out.close();
	}

}
