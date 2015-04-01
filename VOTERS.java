package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.TreeSet;

class VOTERS {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
		String[] t = br.readLine().trim().split("\\s+");
		int n1 = Integer.parseInt(t[0].trim());
		int n2 = Integer.parseInt(t[1].trim());
		int n3 = Integer.parseInt(t[2].trim());
		TreeSet<Integer> tree = new TreeSet<Integer>();
		for (int i = 0; i < n1; i++) {
			list.put(Integer.parseInt(br.readLine().trim()), 1);
		}
		for (int i = 0; i < n2 + n3; i++) {
			int x = Integer.parseInt(br.readLine().trim());
			if (list.get(x) == null) {
				list.put(x, 1);
			} else if (list.get(x) + 1 == 2) {
				tree.add(x);
			}
		}
		out.println(tree.size());
		for (int i : tree) {
			out.println(i);
		}
		out.close();
	}

}
