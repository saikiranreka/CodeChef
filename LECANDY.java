package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class LECANDY {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine().trim());
		PrintWriter out = new PrintWriter(System.out);

		for (int i = 0; i < test; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			int n = Integer.parseInt(t[0].trim());
			int c = Integer.parseInt(t[1].trim());
			String[] tt = br.readLine().trim().split("\\s+");
			long total = 0;
			for (int j = 0; j < n; j++) {
				total += Integer.parseInt(tt[j].trim());
			}
			if (total <= c) {
				out.println("Yes");
			} else {
				out.println("No");
			}
		}
		out.close();
	}

}
