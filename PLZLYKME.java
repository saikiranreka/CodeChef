package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class PLZLYKME {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			long L = Long.parseLong(t[0]);
			long D = Long.parseLong(t[1]);
			long S = Long.parseLong(t[2]);
			long C = Long.parseLong(t[3]);

			for (long j = 1; j < D && S < L; j++) {
				S += S * C;
			}
			if (S >= L) {
				out.println("ALIVE AND KICKING");
			} else {
				out.println("DEAD AND ROTTING");
			}
		}
		out.close();
	}

}
