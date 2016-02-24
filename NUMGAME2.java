package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class NUMGAME2 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int test = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < test; i++) {
			int x = Integer.parseInt(br.readLine().trim());
			if ((x - 1) % 4 == 0) {
				out.println("ALICE");
			} else {
				out.println("BOB");
			}
		}
		out.close();
	}
}
