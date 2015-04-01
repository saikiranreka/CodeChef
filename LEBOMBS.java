package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class LEBOMBS {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			int len = Integer.parseInt(br.readLine().trim());
			// System.out.println(len);
			int count = 0;
			char[] t = br.readLine().trim().toCharArray();
			for (int j = 0; j < len; j++) {
				if (j == 0) {
					if (t[j] == '1' || t[j + 1] == '1') {
						count++;
					}
				} else if (j > 0 && j + 1 < len) {
					if (t[j - 1] == '1' || t[j] == '1' || t[j + 1] == '1') {
						count++;
					}
				} else {
					if (t[j - 1] == '1' || t[j] == '1') {
						count++;
					}
				}
			}
			System.out.println(len - count);
		}
		// out.close();
	}

}
