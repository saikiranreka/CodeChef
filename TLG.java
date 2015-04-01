package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class TLG {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		int max = Integer.MIN_VALUE;
		int finalwinner = 0;
		int si=0,ti=0;
		for (int i = 0; i < n; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			int s1 = Integer.parseInt(t[0].trim());
			int s2 = Integer.parseInt(t[1].trim());
			int lead;
			int winner;
			si+=s1;
			ti+=s2;
			if (si > ti) {
				lead = si - ti;
				winner = 1;
			} else {
				lead = ti - si;
				winner = 2;
			}
			if (lead > max) {
				max = lead;
				finalwinner = winner;
			}
		}
		System.out.println(finalwinner + " " + max);
	}

}
