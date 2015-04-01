package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

class AMSGAME1 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine().trim());
			String[] t = br.readLine().trim().split("\\s+");
			BigInteger res = BigInteger.valueOf(Long.parseLong(t[0]));
			for (int j = 1; j < k; j++) {
				long x = Long.parseLong(t[j]);
				res = res.gcd(BigInteger.valueOf(x));
			}
			out.println(res.longValue());
		}
		out.close();
	}
}
