package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class MUFFINS3 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			if (n == 2) {
				out.println(2);
			} else {
				int a = (n / 2) + 1;
				out.println(a);
			}
		}
		out.close();
	}

}
