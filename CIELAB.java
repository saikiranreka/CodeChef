package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class CIELAB {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String[] t = br.readLine().trim().split(" ");
		int a = Integer.parseInt(t[0].trim());
		int b = Integer.parseInt(t[1].trim());
		int x = a - b;
		if (x % 10 == 9) {
			out.println(x - 1);
		} else if (x == 1) {
			out.println(2);
		} else {
			out.println(x + 1);
		}
		out.close();
	}

}
