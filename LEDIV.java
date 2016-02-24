package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

class LEDIV {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			int N = Integer.parseInt(br.readLine().trim());
			String[] t = br.readLine().trim().split("\\s+");

			BigInteger res = new BigInteger(t[0].trim());
			for (int j = 1; j < N; j++) {
				res = res.gcd(new BigInteger(t[j].trim()));
			}

			if (res.longValue() == 1)
				out.println(-1);
			else {
				long tt = res.longValue();
				boolean flag = false;
				for (int j = 2; j * j <= tt; j++) {
					if (tt % j == 0) {
						flag = true;
						out.println(j);
						break;
					}
				}
				if (!flag) {
					out.println(tt);
				}
			}

		}
		out.close();
	}

}
