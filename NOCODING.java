package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class NOCODING {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			String t = br.readLine().trim();
			int total = 1 + t.length();
			for (int j = 1; j < t.length(); j++) {
				int diff = t.charAt(j) - t.charAt(j - 1);
				if (diff < 0)
					diff += 26;
				total += diff;
			}
			if (total <= 11 * t.length())
				out.println("YES");
			else {
				out.println("NO");
			}
		}
		out.close();
	}

}
