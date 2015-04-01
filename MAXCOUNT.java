package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

class MAXCOUNT {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		PrintWriter out = new PrintWriter(System.out);

		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine().trim());
			String[] t = br.readLine().trim().split(" ");
			HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
			for (int j = 0; j < num; j++) {
				int a = Integer.parseInt(t[j].trim());
				if (list.get(a) != null) {
					list.put(a, list.get(a) + 1);
				} else {
					list.put(a, 1);
				}
			}
			int max = Integer.MIN_VALUE;
			int key = -1;
			for (int temp : list.keySet()) {
				int k = list.get(temp);
				if (k >= max) {
					if (k == max) {
						if (temp < key) {
							key = temp;
						}
					} else {
						key = temp;
						max = k;
					}
				}
			}
			out.println(key + " " + max);
		}
		out.close();
	}
}
