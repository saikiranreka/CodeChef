package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class ANUTHM {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			String[] t = br.readLine().trim().split(" ");
			int m = Integer.parseInt(t[0].trim());
			int n = Integer.parseInt(t[1].trim());
			out.println(m + n - 1);
		}
		out.close();
	}
}
