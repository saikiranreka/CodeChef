package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

class NOTATRI {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String t = null;
		while (!(t = br.readLine().trim()).equals("0")) {
			int n = Integer.parseInt(t);
			String[] tt = br.readLine().trim().split("\\s+");
			int[] list = new int[n];
			for (int i = 0; i < n; i++) {
				list[i] = Integer.parseInt(tt[i].trim());
			}
			int count = 0;
			Arrays.sort(list);
			for (int i = n - 1; i >= 2; i--) {
				int l = 0;
				int r = i - 1;
				while (l < r) {
					if (list[l] + list[r] < list[i]) {
						count += r - l;
						l++;
					}

					else
						r--;
				}
			}
			out.println(count);
		}
		out.close();
	}

}
