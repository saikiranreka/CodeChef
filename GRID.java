package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class GRID {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			int N = Integer.parseInt(br.readLine().trim());
			char[][] map = new char[N][N];
			for (int j = 0; j < N; j++) {
				map[j] = br.readLine().trim().toCharArray();
			}
			boolean[][] dp = new boolean[N][N];
			for (int j = N - 1; j >= 0; j--) {
				for (int k = N - 1; k >= 0; k--) {
					if (j == N - 1 || k == N - 1) {
						if (map[j][k] == '.') {
							dp[j][k] = true;
						}
					} else {
						if (map[j][k] == '.' && (dp[j][k + 1] || dp[j + 1][k])) {
							dp[j][k] = true;
						}
					}

				}
			}
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < N; k++) {
					out.print(dp[j][k] + " ");
				}
				out.println();
			}
		}
		out.close();
	}

}
