package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class DECSTR {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		String s = "abcdefghijklmnopqrstuvwxyz";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int iterations = Integer.parseInt(br.readLine());

		while (iterations-- > 0) {
			int number = Integer.parseInt(br.readLine());
			int rem = number % 25;
			if (rem != 0)
				rem++;
			StringBuffer output = new StringBuffer(s.substring(0, rem))
					.reverse();
			for (int i = 0; i < number / 25; i++) {
				output.append(new StringBuffer(s).reverse());
			}
			out.println(output);
		}
		out.close();
	}
}