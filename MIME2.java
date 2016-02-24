package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

class MIME2 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String[] t = br.readLine().trim().split("\\s+");
		int n = Integer.parseInt(t[0].trim());
		int q = Integer.parseInt(t[1].trim());
		HashMap<String, String> dict = new HashMap<String, String>();

		for (int i = 0; i < n; i++) {
			t = br.readLine().trim().split("\\s+");
			dict.put(t[0].trim(), t[1].trim());
		}
		for (int i = 0; i < q; i++) {
			t = br.readLine().trim().split("\\.");
			int len = t.length;
			if (len >= 2) {
				if (dict.get(t[len - 1].trim()) != null) {
					out.println(dict.get(t[len - 1].trim()));
				} else {
					out.println("unknown");
				}
			} else {
				out.println("unknown");
			}
		}
		out.close();
	}

}
