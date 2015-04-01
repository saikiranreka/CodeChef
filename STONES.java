package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

class STONES {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int test = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < test; i++) {
			char[] t = br.readLine().trim().toCharArray();
			char[] tt = br.readLine().trim().toCharArray();
			HashMap<Character, Integer> jewels = new HashMap<Character, Integer>();
			for (int j = 0; j < t.length; j++) {
				jewels.put(t[j], 1);
			}
			int count = 0;
			for (int j = 0; j < tt.length; j++) {
				if (jewels.get(tt[j]) != null) {
					count++;
				}
			}
			out.println(count);
		}
		out.close();
	}
}
