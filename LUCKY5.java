package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class LUCKY5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			String t = br.readLine().trim();
			int count = 0;
			for (int j = 0; j < t.length(); j++) {
				if (t.charAt(j) != '4' && t.charAt(j) != '7') {
					count++;
				}
			}
			out.println(count);
		}
		out.close();
	}
}
