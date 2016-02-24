package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class NAME2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			String str, substr;
			if (t[0].trim().length() > t[1].trim().length()) {
				str = t[0].trim();
				substr = t[1].trim();
			} else {
				str = t[1].trim();
				substr = t[0].trim();
			}
			int k = 0;
			for (int j = 0; j < str.length(); j++) {
				if (k < substr.length() && substr.charAt(k) == str.charAt(j)) {
					k++;
				}
			}
			if (k == substr.length()) {
				out.println("YES");
			} else {
				out.println("NO");
			}
		}
		out.close();
	}
}