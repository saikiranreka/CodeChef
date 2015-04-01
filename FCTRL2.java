package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

class FCTRL2 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		PrintWriter out = new PrintWriter(System.out);
		String[] dp = new String[101];
		BigInteger result = new BigInteger("1");
		for (int i = 1; i <= 100; i++) {
			result = result.multiply(BigInteger.valueOf(i));
			dp[i] = result.toString();
		}
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine().trim());
			out.println(dp[a]);
		}
		out.close();
	}
}
