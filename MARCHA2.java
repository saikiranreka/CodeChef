package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class MARCHA2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine().trim());
			int[] list = new int[k];
			String[] t = br.readLine().trim().split("\\s+");
			boolean flag = true;
			boolean rootis1 = false;
			for (int j = 0; j < k; j++) {
				int x = Integer.parseInt(t[j].trim());
				list[j] = x;
				if (j == 0) {
					if (x > 1) {
						flag = false;
						break;
					} else if (x == 1) {
						rootis1 = true;
					}
				} else {
					if (rootis1) {
						flag = false;
						break;
					} else {
						if (j + 1 < k
								&& x >= 0
								&& x < Math
										.pow(2, Math.pow(2, j) - list[j - 1])) {
							continue;
						} else if (j + 1 == k
								&& x == Math.pow(2, Math.pow(2, j)
										- list[j - 1])) {
							continue;

						} else {
							flag = false;
							break;
						}
					}
				}
			}
			if (flag) {
				out.println("Yes");
			} else {
				out.println("No");
			}
		}
		out.close();
	}
}