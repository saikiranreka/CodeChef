package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class LEPERMUT {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			String[] t = br.readLine().trim().split(" ");
			int[] a = new int[n];
			for (int j = 0; j < n; j++) {
				a[j] = Integer.parseInt(t[j]);
			}
			if (n < 2) {
				out.println("YES");
			} else {
				int localInversions = 0;
				int totalInvesions = 0;
				for (int j = 0; j < n - 1; j++) {
					if (a[j] > a[j + 1]) {
						localInversions++;
					}
					for (int k = j + 1; k < n; k++) {
						if (a[j] > a[k]) {
							totalInvesions++;
						}
					}
				}
				if (totalInvesions == localInversions) {
					out.println("YES");
				} else {
					out.println("NO");
				}
			}
		}
		out.close();
	}

}
