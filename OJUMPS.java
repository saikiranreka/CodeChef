package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

class OJUMPS {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		BigInteger n = new BigInteger(br.readLine().trim());
		int res = n.mod(BigInteger.valueOf(6)).intValue();
		if (res == 0 || res == 1 || res == 3) {
			out.println("yes");
		} else {
			out.println("no");
		}
		out.close();
	}

}
