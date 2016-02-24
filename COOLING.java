package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

class COOLING {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		PrintWriter out = new PrintWriter(System.out);

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine().trim());
			int[] weights = new int[a];
			int[] limits = new int[a];
			String[] t = br.readLine().trim().split("\\s+");
			String[] tt = br.readLine().trim().split("\\s+");
			for (int j = 0; j < a; j++) {
				weights[j] = Integer.parseInt(t[j].trim());
				limits[j] = Integer.parseInt(tt[j].trim());
			}
			Arrays.sort(weights);
			Arrays.sort(limits);
			int count = 0;
			int j = 0, k = 0;
			while (k < a && j < a) {
				if (weights[j] <= limits[k]) {
					count++;
					j++;
					k++;
				} else {
					k++;
				}
			}
			out.println(count);
		}
		out.close();
	}

}
