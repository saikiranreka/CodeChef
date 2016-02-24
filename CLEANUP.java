package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class CLEANUP {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine().trim());
		PrintWriter out = new PrintWriter(System.out);
		for (int i = 0; i < tests; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			int n = Integer.parseInt(t[0].trim());
			int m = Integer.parseInt(t[1].trim());
			String[] tt = br.readLine().trim().split("\\s+");
			int[] jobs = new int[n + 1];
			for (int j = 0; j < m; j++) {
				jobs[Integer.parseInt(tt[j].trim())] = 1;
			}
			StringBuilder chefjobs = new StringBuilder();
			StringBuilder assisjobs = new StringBuilder();
			boolean chefj = true;
			for (int j = 1; j <= n; j++) {
				if (jobs[j] != 1) {
					if (chefj) {
						chefj = false;
						chefjobs.append(j + " ");
					} else {
						chefj = true;
						assisjobs.append(j + " ");
					}
				}
			}
			if (chefjobs.length() == 0) {
				out.println(" ");
			} else {
				out.println(chefjobs.toString().trim());
			}
			if (assisjobs.length() == 0) {
				out.println(" ");
			} else {
				out.println(assisjobs.toString().trim());
			}
		}
		out.close();
	}

}
