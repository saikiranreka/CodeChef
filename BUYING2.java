package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class BUYING2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine().trim());
		PrintWriter out = new PrintWriter(System.out);
		for (int i = 0; i < test; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			int n = Integer.parseInt(t[0].trim());
			int x = Integer.parseInt(t[1].trim());
			int min = Integer.MAX_VALUE;
			int total = 0;
			t = br.readLine().trim().split("\\s+");
			for (int j = 0; j < n; j++) {
				int k = Integer.parseInt(t[j].trim());
				if (k < min) {
					min = k;
				}
				total += k;
			}
			if (total % x >= min) {
				out.println(-1);
			} else {
				out.println(total / x);
			}
		}
		out.close();
	}
}
