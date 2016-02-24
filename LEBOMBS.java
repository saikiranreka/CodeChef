package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class LEBOMBS {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			int len = Integer.parseInt(br.readLine().trim());
			// System.out.println(len);
			int count = 0;
			char[] t = br.readLine().trim().toCharArray();
			for (int j = 0; j < len; j++) {
				boolean flag = true;
				if (t[j] == '1') {
					flag = false;
				} else if (j > 0 && t[j - 1] == '1') {
					flag = false;
				} else if (j < len - 1 && t[j + 1] == '1') {
					flag = false;
				}
				if (flag == true) {
					count++;
				}
			}
			out.println(count);
		}
		out.close();
	}

}
