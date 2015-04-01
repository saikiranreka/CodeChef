package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class CARVANS {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine().trim());
		PrintWriter out = new PrintWriter(System.out);
		for (int i = 0; i < test; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			String[] t = br.readLine().trim().split("\\s+");
			int max = Integer.MAX_VALUE;
			int count = 0;
			for (int j = 0; j < n; j++) {
				int k = Integer.parseInt(t[j].trim());
				if (k <= max) {
					count++;
					max = k;
				}
				
			}
			out.println(count);
		}
		out.close();
	}
}
