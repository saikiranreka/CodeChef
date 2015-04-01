package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class REMISS {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int test = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < test; i++) {
			String[] t = br.readLine().trim().split(" ");
			int c1 = Integer.parseInt(t[0].trim());
			int c2 = Integer.parseInt(t[1].trim());
			out.println(Math.max(c1, c2) + " " + (c1 + c2));
		}
		out.close();
	}

}
