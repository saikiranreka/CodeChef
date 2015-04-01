package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

class HOLES {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		PrintWriter out = new PrintWriter(System.out);
		HashMap<Character, Integer> holes = new HashMap<Character, Integer>();
		holes.put('A', 1);
		holes.put('B', 2);
		holes.put('D', 1);
		holes.put('O', 1);
		holes.put('P', 1);
		holes.put('R', 1);
		holes.put('Q', 1);
		for (int i = 0; i < n; i++) {
			char[] t = br.readLine().trim().toCharArray();
			int count = 0;
			for (int j = 0; j < t.length; j++) {
				if (holes.get(t[j]) != null) {
					count += holes.get(t[j]);
				}
			}
			out.println(count);
		}
		out.close();
	}
}