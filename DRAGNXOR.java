package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.BitSet;

class DRAGNXOR {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			String[] t = br.readLine().trim().split(" ");
			int n = Integer.parseInt(t[0].trim());
			int a = Integer.parseInt(t[1].trim());
			int b = Integer.parseInt(t[2].trim());
			int a1 = 0, a0 = 0, b1 = 0, b0 = 0;
			while (a > 0) {
				a1 += a & 1;
				a = a >> 1;
			}
			while (b > 0) {
				b1 += b & 1;
				b = b >> 1;
			}
			a0 = n - a1;
			b0 = n - b1;
			BitSet bs = new BitSet(n);
			int num = Math.min(a0, b1) + Math.min(a1, b0);
			for (int j = 0; j < n; j++) {
				if (j < num)
					bs.set(n - 1 - j);
				else
					bs.clear(n - 1 - j);
			}
			int result = 0;
			for (int j = 0; j < bs.length(); j++) {
				if (bs.get(j)) {
					result |= (1 << j);
				}
			}
			result &= Integer.MAX_VALUE;
			out.println(result);
		}
		out.close();
	}

}
