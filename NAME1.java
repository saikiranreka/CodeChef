package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

class NAME1 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			String t = br.readLine().trim().toLowerCase();
			HashMap<Character, Integer> list = new HashMap<Character, Integer>();
			for (int j = 0; j < t.length(); j++) {
				char temp = t.charAt(j);
				if (temp != ' ') {
					if (list.get(temp) != null) {
						list.put(temp, list.get(temp) + 1);
					} else {
						list.put(temp, 1);
					}
				}
			}
			int k = Integer.parseInt(br.readLine().trim());
			StringBuilder sb = new StringBuilder();
			for (int j = 0; j < k; j++) {
				sb.append(br.readLine().trim());
			}
			char[] s = sb.toString().toCharArray();
			boolean flag = true;
			for (int j = 0; j < s.length; j++) {
				if (list.get(s[j]) != null) {
					if (list.get(s[j]) <= 0) {
						flag = false;
						break;
					} else {
						list.put(s[j], list.get(s[j]) - 1);
					}
				} else {
					flag = false;
					break;
				}
			}
			if (!flag) {
				out.println("NO");
			} else {
				out.println("YES");
			}
		}
		out.close();
	}

}
