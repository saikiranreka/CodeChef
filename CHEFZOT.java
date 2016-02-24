package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class CHEFZOT {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		String[] t = br.readLine().trim().split("\\s+");
		int arr[] = new int[n];
		int count = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(t[i].trim());
			if (arr[i] != 0) {
				count++;
			} else {
				count = 0;
			}
			if (count > max) {
				max = count;
			}
		}
		out.println(max);
		out.close();

	}

}
