package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class FCTRL {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		PrintWriter out = new PrintWriter(System.out);
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine().trim());
			int num = 1;
			int count = 0;
			while (a / num > 0) {
				count += a / (num = num * 5);
			}

			out.println(count);
		}
		out.close();
	}
}
