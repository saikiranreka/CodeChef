package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class HOTEL {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int test = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < test; i++) {
			int x = Integer.parseInt(br.readLine().trim());
			String[] t = br.readLine().trim().split("\\s+");
			String[] tt = br.readLine().trim().split("\\s+");
			int[] arr = new int[x];
			int[] dep = new int[x];
			for (int j = 0; j < x; j++) {
				arr[j] = Integer.parseInt(t[j].trim());
				dep[j] = Integer.parseInt(tt[j].trim());
			}
			int maxcount = 0;
			for (int j = 1; j <= 1000; j++) {
				int count = 0;
				for (int k = 0; k < x; k++) {
					if (j >= arr[k] && j < dep[k]) {
						count++;
					}
				}
				if (count > maxcount) {
					maxcount = count;
				}
			}
			out.println(maxcount);
		}
		out.close();
	}

}
