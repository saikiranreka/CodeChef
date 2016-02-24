package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

class FLAGS {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			int N = Integer.parseInt(br.readLine().trim());
			BigInteger n1 = BigInteger.valueOf(N);
			BigInteger n2 = BigInteger.valueOf(N - 1);
			BigInteger n3 = BigInteger.valueOf(N - 2);
			BigInteger two = BigInteger.valueOf(2);
			BigInteger res = two.multiply(n1.multiply(n2.multiply(n2)));
			res = res.add(n1.multiply(n2.multiply(n3)));
			res = res
					.add(two.multiply(n1.multiply(n2.multiply(n3.multiply(n3)))));
			out.println(res);
		}
		out.close();
	}
}
