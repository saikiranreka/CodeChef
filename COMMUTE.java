package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class COMMUTE {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			int arrival = 0;
			for (int j = 0; j < n; j++) {
				String[] t = br.readLine().trim().split("\\s+");
				int x = Integer.parseInt(t[0]);
				int l = Integer.parseInt(t[1]);
				int f = Integer.parseInt(t[2]);
				if (j == 0)
					arrival = x + l;
				else {
					if (arrival <= x) {
						arrival = x;
						arrival += l;
					} else {
						while (arrival > x)
							x += f;
						arrival = x;
						arrival += l;
					}
				}
			}
			out.println(arrival);
		}
		out.close();
	}

}
