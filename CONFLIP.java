package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class CONFLIP {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine().trim());
		PrintWriter out = new PrintWriter(System.out);
		for (int i = 0; i < test; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			for (int j = 0; j < n; j++) {
				String[] t = br.readLine().trim().split("\\s+");
				int I = Integer.parseInt(t[0].trim());
				int N = Integer.parseInt(t[1].trim());
				int Q = Integer.parseInt(t[2].trim());
				if (I != Q) {
					out.println(N / 2 + N % 2);
				} else {
					out.println(N - (N / 2 + N % 2));
				}

			}
		}
		out.close();
	}
}
