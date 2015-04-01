package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

class RECIPE {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		PrintWriter out = new PrintWriter(System.out);

		for (int i = 0; i < n; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			int num = Integer.parseInt(t[0].trim());
			long[] vals = new long[num];
			long x = Long.parseLong(t[1].trim());
			vals[0] = x;
			BigInteger res = BigInteger.valueOf(x);
			for (int j = 2; j <= num; j++) {
				x = Long.parseLong(t[j].trim());
				vals[j - 1] = x;
				res = res.gcd(BigInteger.valueOf(x));
			}
			for (int j = 0; j < num; j++) {
				out.print(vals[j] / res.longValue() + " ");
			}
			out.println();
		}
		out.close();
	}
}
