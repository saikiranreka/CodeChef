package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;

class J7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			double p = Double.parseDouble(t[0]);
			double s = Double.parseDouble(t[1]);
			double l = (p - Math.sqrt(p * p - 24 * s)) / 12;
			double h = (p / 4) - 2 * l;
			double volume = l * l * h;
			DecimalFormat df = new DecimalFormat("#.00");
			out.println(df.format(volume));
		}
		out.close();
	}

}
