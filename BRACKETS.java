package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class BRACKETS {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tests; i++) {
			String t = br.readLine().trim();
			int balance = 0;
			int maxbalance = 0;
			for (int j = 0; j < t.length(); j++) {
				if (t.charAt(j) == '(') {
					balance++;
				}
				if (t.charAt(j) == ')') {
					balance--;
				}
				maxbalance = Math.max(maxbalance, balance);
			}
			for (int j = 0; j < maxbalance; j++) {
				sb.append('(');
			}
			for (int j = 0; j < maxbalance; j++) {
				sb.append(')');
			}
			sb.append("\n");
		}
		System.out.print(sb.toString().trim());
	}

}
