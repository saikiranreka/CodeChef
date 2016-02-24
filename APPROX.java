package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class APPROX {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine().trim());
			StringBuilder sb = new StringBuilder();
			sb.append("3");
			long remainder = 103993 % 33102;
			if (k > 0) {
				sb.append(".");
			}
			for (int j = 0; j < k; j++) {
				remainder *= 10;
				sb.append(remainder / 33102);
				remainder = remainder % 33102;
			}
			out.println(sb.toString());
		}
		out.close();
	}

}
