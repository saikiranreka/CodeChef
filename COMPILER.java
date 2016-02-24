package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class COMPILER {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			String t1 = br.readLine().trim();
			int t = 0;
			int max = 0;

			for (int j = 0; j < t1.length(); j++) {
				if (t1.charAt(j) == '<') {
					t++;
				} else {
					t--;
				}
				if (t == 0) {
					if (j + 1 > max) {
						max = j + 1;
					}
				} else if (t < 0) {
					break;
				}
			}
			out.println(max);
		}
		out.close();
	}

}
