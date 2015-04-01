package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class CIELRCPT {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			int b = Integer.parseInt(br.readLine().trim());
			int count = 0;
			while (b > 0) {
				if (b == 0) {
					break;
				}
				int num = findNearestPower2(b);
				b -= num;
				count++;
			}
			out.println(count);
		}
		out.close();
	}

	public static int findNearestPower2(int b) {
		int j;
		for (j = 0; j <= 11; j++) {
			if (b < 1 << j) {
				break;
			}
		}
		return 1 << j - 1;
	}
}
