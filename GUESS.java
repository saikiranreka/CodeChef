package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

class GUESS {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < N; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			long x = Long.parseLong(t[0].trim());
			long y = Long.parseLong(t[1].trim());
			if (x == 1 && y == 1) {
				out.println("0/1");
				continue;
			}
			BigInteger den = BigInteger.valueOf(x * y);
			BigInteger num;
			if (x == 1 && y != 1) {
				num = BigInteger.valueOf(y - findOdd(y));
			} else if (x != 1 && y == 1) {
				num = BigInteger.valueOf(x - findOdd(x));
			} else {
				long odd1 = findOdd(x);
				long odd2 = findOdd(y);
				//out.println(odd1+" "+odd2);
				num = BigInteger.valueOf(odd1 * (y - odd2) + odd2 * (x - odd1));
			}
			BigInteger gcdd = num.gcd(den);
			out.println(num.divide(gcdd) + "/" + den.divide(gcdd));
		}
		out.close();
	}

	public static long findOdd(long x) {
		if (x % 2 == 0) {
			return x / 2;
		}
		return x / 2 + 1;
	}

}
