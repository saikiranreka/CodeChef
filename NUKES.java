package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class NUKES {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String[] t = br.readLine().trim().split("\\s+");
		int a = Integer.parseInt(t[0].trim());
		int n = Integer.parseInt(t[1].trim());
		int k = Integer.parseInt(t[2].trim());
		for (int i = 0; i < k; i++) {
			out.print(a % (n + 1) + " ");
			a = a / (n + 1);
		}
		out.println();
		out.close();
	}

}
