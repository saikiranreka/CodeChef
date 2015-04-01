package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class SNAPE {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			String[] t = br.readLine().trim().split(" ");
			int b = Integer.parseInt(t[0].trim());
			int ls = Integer.parseInt(t[1].trim());
			double maxRS = Math.sqrt((b * b) + (ls * ls));
			double minRS = Math.sqrt((ls * ls) - (b * b));
			out.println(minRS + " " + maxRS);
		}
		out.close();
	}

}
