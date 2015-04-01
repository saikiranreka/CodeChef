package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class RIGHTRI {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		int count = 0;
		for (int i = 0; i < n; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			int x1 = Integer.parseInt(t[0]);
			int y1 = Integer.parseInt(t[1]);
			int x2 = Integer.parseInt(t[2]);
			int y2 = Integer.parseInt(t[3]);
			int x3 = Integer.parseInt(t[4]);
			int y3 = Integer.parseInt(t[5]);
			int d1 = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);
			int d2 = (x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3);
			int d3 = (x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3);
			if (d1 == d2 + d3 || d2 == d1 + d3 || d3 == d1 + d2) {
				count++;
			}
		}
		out.println(count);
		out.close();
	}

}
