package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

class CHEFSTON {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int t = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < t; i++) {
			String[] tt = br.readLine().trim().split("\\s+");
			int n = Integer.parseInt(tt[0]);
			long k = Long.parseLong(tt[1]);
			BigInteger res = BigInteger.ZERO;
			tt = br.readLine().trim().split("\\s+");
			String[] ttt = br.readLine().trim().split("\\s+");
			for (int j = 0; j < n; j++) {
				BigInteger time = new BigInteger(tt[j]);
				BigInteger prof = new BigInteger(ttt[j]);
				BigInteger ppr = BigInteger.valueOf(k).divide(time);
				ppr = ppr.multiply(prof);
				if (res.compareTo(ppr) < 0) {
					res = ppr;
				}
			}
			out.println(res);
		}
		out.close();
	}

}
