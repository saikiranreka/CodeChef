package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class COMM3 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine().trim());
		PrintWriter out = new PrintWriter(System.out);
		for (int i = 0; i < test; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			String[] t = br.readLine().trim().split("\\s+");
			int x1 = Integer.parseInt(t[0].trim());
			int y1 = Integer.parseInt(t[1].trim());
			t = br.readLine().trim().split("\\s+");
			int x2 = Integer.parseInt(t[0].trim());
			int y2 = Integer.parseInt(t[1].trim());
			t = br.readLine().trim().split("\\s+");
			int x3 = Integer.parseInt(t[0].trim());
			int y3 = Integer.parseInt(t[1].trim());
			int count = 0;
			double d1 = Math
					.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
			double d2 = Math
					.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));
			double d3 = Math
					.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
			if (d1 > n) {
				count++;
			}
			if (d2 > n) {
				count++;
			}
			if (d3 > n) {
				count++;
			}
			if (count > 1) {
				out.println("no");
			} else {
				out.println("yes");
			}
		}
		out.close();
	}
}
