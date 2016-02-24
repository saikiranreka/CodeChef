package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class CIEL8STR {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String t = br.readLine().trim();
		long res = 0;
		int zero = 0;
		for (int i = 0; i < t.length(); i++) {
			if (t.charAt(i) == '0' || t.charAt(i) == '8')
				res++; // single digit results

			if (t.charAt(i) != '0') {
				zero++;
				if (i < t.length() - 1
						&& ((t.charAt(i) - '0') * 10 + (t.charAt(i + 1) - '0')) % 8 == 0)
					res++; // two digit results
			}
			if (i < t.length() - 2)
				if (((t.charAt(i) - '0') * 100 + (t.charAt(i + 1) - '0') * 10 + (t
						.charAt(i + 2) - '0')) % 8 == 0)
					res += zero;
		}

		out.println(res);
		out.close();
	}

}
