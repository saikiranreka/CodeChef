package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

class GCD2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			long x = Long.parseLong(t[0].trim());
			long y = Long.parseLong(t[1].trim());
			BigInteger res = BigInteger.valueOf(x);
			res = res.gcd(BigInteger.valueOf(y));
			out.println(res.longValue());
		}
		out.close();
	}
}
