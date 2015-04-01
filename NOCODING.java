package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class NOCODING {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			String t = br.readLine().trim();
			int len = t.length();
			int maxLength = 11 * len;
			int instructions = 0;
			for (int j = 1; j < len; j++) {
				int prev = (int) (t.charAt(j - 1));
				int curr = (int) (t.charAt(j));
				if (prev < curr) {

				}
			}
		}

	}

}
