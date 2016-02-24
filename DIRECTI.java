package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class DIRECTI {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			String[] dir = new String[n];
			String[] road = new String[n];
			for (int j = 0; j < n; j++) {
				String[] t = br.readLine().trim().split(" on ");
				dir[j] = t[0].trim();
				road[j] = t[1].trim();
			}
			for (int j = n - 1; j >= 0; j--) {
				String temp = null;
				if (j == n - 1) {
					out.println("Begin on " + road[j]);
					continue;
				}
				if (dir[j + 1].equalsIgnoreCase("left")) {
					temp = "Right";
				} else if (dir[j + 1].equalsIgnoreCase("right")) {
					temp = "Left";
				}
				out.println(temp + " on " + road[j]);
			}
		}
		out.close();
	}

}
