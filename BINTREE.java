package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class BINTREE {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			int a1 = Integer.parseInt(t[0].trim());
			int a2 = Integer.parseInt(t[1].trim());
			int count = 0;
			String b1 = Integer.toBinaryString(a1);
			String b2 = Integer.toBinaryString(a2);
			for (int j = 0; j < b1.length() && j < b2.length(); j++) {
				if (b1.charAt(j) == b2.charAt(j)) {
					count++;
				} else {
					break;
				}
			}
			int dep = b1.length() + b2.length() - 2 * count;
			out.println(dep);

		}
		out.close();
	}

}
