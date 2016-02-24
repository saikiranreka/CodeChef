package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

class JOHNNY1 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			String[] t = br.readLine().trim().split(" ");
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < n; j++) {
				list.add(Integer.parseInt(t[j]));
			}
			int value = list.get(Integer.parseInt(br.readLine().trim()) - 1);
			Collections.sort(list);
			int pos = list.indexOf(value);
			out.println(pos + 1);
		}
		out.close();
	}

}
