package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class MCHAIRS {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int[] dp = new int[100000001];
		dp[1] = 1;
		for (int i = 2; i <= 100000000; i++) {
			dp[i] = ((2 * (dp[i - 1] + 1)) % 1000000007) - 1;
		}
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			int k = Integer.parseInt(br.readLine().trim());
			out.println(dp[k]);
		}
		out.close();
	}

}
