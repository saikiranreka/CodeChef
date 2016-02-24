package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

class CHEFTEAM {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			BigInteger n = new BigInteger(t[0]);
			BigInteger k = new BigInteger(t[1]);
			if (n.compareTo(k) < 0) {
				out.println(0);
			} else if (n.compareTo(k) == 0) {
				out.println(1);
			} else {
				BigInteger num = BigInteger.ONE;
				BigInteger den = BigInteger.ONE;
				if (n.subtract(k).compareTo(k) < 0) {
					k = n.subtract(k);
				}
				for (BigInteger j = BigInteger.ZERO; j.compareTo(k) < 0; j = j
						.add(BigInteger.ONE)) {
					num = num.multiply(n.subtract(j));
					den = den.multiply(k.subtract(j));
				}
				out.println(num.divide(den));
			}
		}
		out.close();
	}

}
