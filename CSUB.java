package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

class CSUB {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			int N = Integer.parseInt(br.readLine().trim());
			char[] t = br.readLine().trim().toCharArray();
			int count = 0;
			for (int j = 0; j < N; j++) {
				if (t[j] == '1') {
					count++;
				}
			}
			BigInteger res = BigInteger.valueOf(count);
			res = res.multiply(BigInteger.valueOf(count + 1));
			res = res.divide(BigInteger.valueOf(2));

			out.println(res);

		}
		out.close();
	}

}
