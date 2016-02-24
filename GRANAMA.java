package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

class GRANAMA {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			HashMap<Character, Integer> list = new HashMap<Character, Integer>();
			t[0] = t[0].trim();
			t[1] = t[1].trim();
			for (int j = 0; j < t[0].length(); j++) {
				char temp = t[0].charAt(j);
				if (list.containsKey(temp)) {
					list.put(temp, list.get(temp) + 1);
				} else {
					list.put(temp, 1);
				}
			}
			boolean flag = false;
			for (int j = 0; j < t[1].length(); j++) {
				char temp = t[1].charAt(j);
				if (list.containsKey(temp)) {
					list.put(temp, list.get(temp) - 1);

				} else {
					flag = true;
					out.println("YES");
					break;
				}
			}
			if (!flag) {
				boolean flag1 = false;
				for (int te : list.values()) {
					if (te != 0) {
						flag1 = true;
						out.println("NO");
						break;
					}
				}
				if (!flag1) {
					out.println("YES");
				}
			}
		}
		out.close();
	}

}
