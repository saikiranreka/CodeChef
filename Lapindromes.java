package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.TreeMap;

class Lapindromes {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int test = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < test; i++) {
			char[] t = br.readLine().trim().toCharArray();
			int len = t.length;
			TreeMap<Character, Integer> l1 = new TreeMap<Character, Integer>();
			TreeMap<Character, Integer> l2 = new TreeMap<Character, Integer>();
			for (int j = 0; j < len / 2; j++) {
				if (l1.get(t[j]) != null) {
					l1.put(t[j], l1.get(t[j]) + 1);
				} else {
					l1.put(t[j], 1);
				}
				if (l2.get(t[len - 1 - j]) != null) {
					l2.put(t[len - 1 - j], l2.get(t[len - 1 - j]) + 1);
				} else {
					l2.put(t[len - 1 - j], 1);
				}

			}
			boolean palin = true;
			for (char x : l1.keySet()) {
				if (l2.get(x) != null) {
					if (l1.get(x) != l2.get(x)) {
						palin = false;
						break;
					}
				} else {
					palin = false;
					break;
				}
			}
			if (palin) {
				out.println("YES");
			} else {
				out.println("NO");
			}
		}
		out.close();
	}

}
