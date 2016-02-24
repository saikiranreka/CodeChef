package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class GARDENSQ {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int N = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < N; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			int n = Integer.parseInt(t[0]);
			int m = Integer.parseInt(t[1]);
			char[][] map = new char[n][m];
			for (int j = 0; j < n; j++) {
				map[j] = br.readLine().trim().toCharArray();
			}
			int count = 0;
			for (int j = 0; j < n - 1; j++) {
				for (int k = 0; k < m - 1; k++) {
					for (int l = k + 1; l < m && l < n - j + k; l++) {
						if (map[j][k] == map[j][l]
								&& map[j][k] == map[j + l - k][k]
								&& map[j][k] == map[j + l - k][l]) {
							count++;
						}
					}
				}
			}
			out.println(count);
		}
		out.close();
	}

}
