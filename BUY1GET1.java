package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

class BUY1GET1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine().trim());
		PrintWriter out = new PrintWriter(System.out);
		for (int i = 0; i < test; i++) {
			HashMap<Character, Integer> list = new HashMap<Character, Integer>();
			char[] t = br.readLine().trim().toCharArray();
			for (int j = 0; j < t.length; j++) {
				if (list.get(t[j]) != null) {
					list.put(t[j], list.get(t[j]) + 1);
				} else {
					list.put(t[j], 1);
				}
			}
			int count = 0;
			for (int k : list.values()) {
				if (k % 2 == 0) {
					count += k / 2;
				} else {
					count += (k / 2) + 1;
				}
			}
			out.println(count);
		}
		out.close();
	}
}