package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

class DIVIDING {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		String[] t = br.readLine().trim().split("\\s+");
		BigInteger res = BigInteger.valueOf(0);
		for (int i = 0; i < n; i++) {
			res = res.add(BigInteger.valueOf(Long.parseLong(t[i].trim())));
		}
		BigInteger res1 = BigInteger.valueOf(n);
		res1 = res1.multiply(BigInteger.valueOf(n + 1));
		res1 = res1.divide(BigInteger.valueOf(2));
		if (res.compareTo(res1) == 0) {
			out.println("YES");
		} else {
			out.println("NO");
		}
		out.close();
	}

}
