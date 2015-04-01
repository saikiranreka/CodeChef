package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class NUMGAME {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		PrintWriter out = new PrintWriter(System.out);
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine().trim());
			if (a % 2 == 0) {
				out.println("ALICE");
			} else {
				out.println("BOB");
			}
		}
		out.close();
	}

}
