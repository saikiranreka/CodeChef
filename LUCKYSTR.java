package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class LUCKYSTR {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String[] t = br.readLine().trim().split("\\s+");
		int K = Integer.parseInt(t[0].trim());
		int N = Integer.parseInt(t[1].trim());
		String[] lucky = new String[K];
		for (int i = 0; i < K; i++) {
			lucky[i] = br.readLine().trim();
		}
		for (int i = 0; i < N; i++) {
			String tt = br.readLine().trim();
			if (tt.length() >= 47) {
				out.println("Good");
				continue;
			}
			boolean good = false;
			for (int j = 0; j < K; j++) {
				if (tt.contains(lucky[j])) {
					out.println("Good");
					good = true;
					break;

				}
			}
			if (!good) {
				out.println("Bad");
			}
		}
		out.close();
	}

}
