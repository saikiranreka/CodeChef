package easy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

class MARCHA1 {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String t;
		try {
			t = br.readLine();
			int n = Integer.parseInt(t.trim());
			for (int i = 0; i < n; i++) {
				String[] ttt = br.readLine().trim().split(" ");
				int notes = Integer.parseInt(ttt[0].trim());
				int sum = Integer.parseInt(ttt[1].trim());
				int money[] = new int[notes];
				for (int j = 0; j < notes; j++) {
					String tt = br.readLine().trim();
					money[j] = Integer.parseInt(tt.trim());
				}
				Arrays.sort(money);
				boolean[][] dp = new boolean[notes + 1][sum + 1];
				for (int j = 1; j <= notes; j++) {
					for (int k = 1; k <= sum; k++) {
						dp[j][k] = dp[j - 1][k];
						if (!dp[j][k]) {
							if (k >= money[j - 1]) {
								if (dp[j - 1][k - money[j - 1]]
										|| k == money[j - 1]) {
									dp[j][k] = true;
								}
							}
						}
					}
				}
				if (dp[notes][sum]) {
					out.println("Yes");
				} else {
					out.println("No");
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		out.close();
	}
}