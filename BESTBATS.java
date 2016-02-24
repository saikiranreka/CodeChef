package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;

class BESTBATS {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		long[] fact = new long[12];
		fact[0] = 1;
		for (int i = 1; i <= 11; i++) {
			fact[i] = i * fact[i - 1];
		}
		for (int i = 0; i < tests; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			int[] scores = new int[11];
			int k = Integer.parseInt(br.readLine().trim());
			HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
			for (int j = 0; j < 11; j++) {
				scores[j] = Integer.parseInt(t[j].trim());
				if (list.containsKey(scores[j])) {
					list.put(scores[j], list.get(scores[j]) + 1);
				} else {
					list.put(scores[j], 1);
				}
			}
			Arrays.sort(scores);
			int num = scores[11-k];
			int count = 0;
			for (int j = 0; j <k ; j++) {
				if (scores[10-j] == num) {
					count++;
				}
			}
			out.println(fact[list.get(num)]
					/ (fact[count] * fact[list.get(num) - count]));
		}
		out.close();
	}

}
