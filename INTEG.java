package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

class INTEG {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		String[] t = br.readLine().trim().split("\\s+");
		ArrayList<Integer> list = new ArrayList<Integer>();
		int X = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			int temp = Integer.parseInt(t[i]);
			if (temp < 0) {
				list.add(temp * -1);
			}
		}
		if (list.size() <= X) {
			long res = 0;
			for (int te : list) {
				res += te;
			}
			out.println(res);
		} else {
			Collections.sort(list);
			long res = 0;
			for (int j = 0; j < X; j++) {
				res += list.get(list.size() - 1 - j);
			}
			out.println(res);
		}
		out.close();
	}
}
