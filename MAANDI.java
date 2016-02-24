package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class MAANDI {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine().trim());
			int count = 0;
			for (int j = 1; j * j <= k; j++) {
				if (k % j == 0) {
					if (checkLucky(j)) {
						count++;
					}
					if (checkLucky(k / j)) {
						count++;
					}
				}
			}
			out.println(count);
		}
		out.close();
	}

	private static boolean checkLucky(int i) {
		String t = Integer.toString(i);
		for (int j = 0; j < t.length(); j++) {
			if (t.charAt(j) == '4' || t.charAt(j) == '7') {
				return true;
			}
		}
		return false;
	}

}
