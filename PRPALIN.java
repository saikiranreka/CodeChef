package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class PRPALIN {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int a = Integer.parseInt(br.readLine().trim());
		if (a <= 101) {
			out.println(101);
		} else {
			if (a % 2 == 0) {
				a++;
			}

			for (int i = a; i <= Integer.MAX_VALUE - 2; i += 2) {
				boolean prime = true;
				for (int j = 3; j * j <= i; j += 2) {
					if (i % j == 0) {
						prime = false;
						break;
					}
				}
				if (prime) {
					StringBuilder sb = new StringBuilder(i);
					String tt = sb.toString();
					sb.reverse();
					if (tt.equalsIgnoreCase(sb.toString())) {
						out.print(i);
						break;
					}
				}
			}
		}
		out.close();
	}

}
