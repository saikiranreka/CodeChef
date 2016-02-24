package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

class LCPESY {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			String t1 = br.readLine().trim();
			String t2 = br.readLine().trim();
			int count = 0;
			HashMap<Character, Integer> list = new HashMap<Character, Integer>();
			for (int j = 0; j < t1.length(); j++) {
				char temp = t1.charAt(j);
				if (list.get(temp) != null) {
					list.put(temp, list.get(temp) + 1);
				} else {
					list.put(temp, 1);
				}
			}
			for (int j = 0; j < t2.length(); j++) {
				char temp = t2.charAt(j);
				if (list.get(temp) != null && list.get(temp) > 0) {
					list.put(temp, list.get(temp) - 1);
						count++;
				}

			}
			out.println(count);
		}
		out.close();
	}
}
