package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

class TSORT {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		PrintWriter out = new PrintWriter(System.out);
		int[] list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = Integer.parseInt(br.readLine().trim());
		}
		Arrays.sort(list);
		for (int i = 0; i < n; i++) {
			out.println(list[i]);
		}
		out.close();
	}

}
