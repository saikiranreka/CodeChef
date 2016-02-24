package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;

class DRGNBOOL {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			int N = Integer.parseInt(t[0].trim());
			int M = Integer.parseInt(t[1].trim());
			HashMap<Integer, Integer> soint = new HashMap<Integer, Integer>();
			for (int j = 0; j < N; j++) {
				t = br.readLine().split("\\s+");
				int c = Integer.parseInt(t[0].trim());
				int l = Integer.parseInt(t[1].trim());
				if (soint.containsKey(l)) {
					soint.put(l, soint.get(l) + c);
				} else {
					soint.put(l, c);
				}
			}
			for (int j = 0; j < M; j++) {
				t = br.readLine().split("\\s+");
				int c = Integer.parseInt(t[0].trim());
				int l = Integer.parseInt(t[1].trim());
				soint.put(l, soint.get(l) - c);
			}
			int count = 0;
			for (int k : soint.values()) {
				if (k <= 0) {
					count = k + count;
				}
			}
			count = count * (-1);
			out.println(count);

		}
		out.close();
	}

}
