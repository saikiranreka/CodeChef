package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

class DAILY {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String[] t = br.readLine().trim().split("\\s+");
		int x = Integer.parseInt(t[0].trim());
		int n = Integer.parseInt(t[1].trim());
		long count = 0;
		HashMap<Integer, Integer> factTable = new HashMap<Integer, Integer>() {
			{
				put(0, 1);
				put(1, 1);
				put(2, 2);
				put(3, 6);
				put(4, 24);
				put(5, 120);
				put(6, 720);
			}
		};
		for (int i = 0; i < n; i++) {
			String tt = br.readLine().trim();

			int last = 53;
			for (int j = 0; j < 9; j++) {
				int count1 = 0;
				if (tt.charAt(j * 4 + 0) == '0') {
					count1++;
				}
				if (tt.charAt(j * 4 + 1) == '0') {
					count1++;
				}
				if (tt.charAt(j * 4 + 2) == '0') {
					count1++;
				}
				if (tt.charAt(j * 4 + 3) == '0') {
					count1++;
				}
				if (tt.charAt(last) == '0') {
					count1++;
				}
				last--;
				if (tt.charAt(last) == '0') {
					count1++;
				}
				last--;
				if (count1 >= x) {
					count += factTable.get(count1)
							/ (factTable.get(x) * factTable.get(count1 - x));

				}
			}

		}
		out.println(count);
		out.close();
	}

}
