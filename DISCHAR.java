package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.TreeSet;

class DISCHAR {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			char[] t = br.readLine().trim().toCharArray();
			TreeSet<Character> set = new TreeSet<Character>();
			for (int j = 0; j < t.length; j++) {
				set.add(t[j]);
			}
			out.println(set.size());
		}
		out.close();
	}

}
