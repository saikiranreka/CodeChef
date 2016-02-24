package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class HELPLIRA {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		int maxindex = 0;
		int minindex = 0;
		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			int x1 = Integer.parseInt(t[0].trim());
			int y1 = Integer.parseInt(t[1].trim());
			int x2 = Integer.parseInt(t[2].trim());
			int y2 = Integer.parseInt(t[3].trim());
			int x3 = Integer.parseInt(t[4].trim());
			int y3 = Integer.parseInt(t[5].trim());
			double area = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3
					* (y1 - y2));
			if (area >= max) {
				max = area;
				maxindex = i + 1;
			}
			if (area <= min) {
				min = area;
				minindex = i + 1;
			}
		}
		out.println(minindex + " " + maxindex);
		out.close();
	}

}
