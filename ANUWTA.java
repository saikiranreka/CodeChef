package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

class ANUWTA {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < t; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			BigInteger res = BigInteger.valueOf(n + 1);
			res=res.multiply(BigInteger.valueOf(n + 2));
			res=res.divide(BigInteger.valueOf(2));
			res=res.subtract(BigInteger.ONE);
			out.println(res);
		}
		out.close();

	}

}
