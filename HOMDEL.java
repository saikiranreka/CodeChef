package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class HOMDEL {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		int[][] map = new int[n][n];
		for (int i = 0; i < n; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(t[j]);
			}
		}
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					map[i][j] = Math.min(map[i][j], map[i][k] + map[k][j]);
				}
			}
		}
		int m = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < m; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			int s = Integer.parseInt(t[0]);
			int g = Integer.parseInt(t[1]);
			int d = Integer.parseInt(t[2]);
			out.println((map[s][g] + map[g][d]) + " "
					+ (map[s][g] + map[g][d] - map[s][d]));
		}
		out.close();
	}

}
