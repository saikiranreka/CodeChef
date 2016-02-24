package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class CRAWA {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			long x = Long.parseLong(t[0]);
			long y = Long.parseLong(t[1]);
			if ((y <= 0 && y % 2 == 0 && x >= y && x <= -y + 1)
					|| (y > 0 && y % 2 == 0 && x >= -y && x <= y - 1)
					|| (x > 0 && x % 2 == 1 && y >= -x + 1 && y <= x + 1)
					|| (x < 0 && x % 2 == 0 && y >= x && y <= -x)) {
				out.println("YES");
			} else {
				out.println("NO");
			}
		}
		out.close();
	}

}
