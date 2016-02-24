package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class GERALD04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			String t[] = (br.readLine()).split(":");
			double time1 = Double.parseDouble(t[0].trim()) * 60
					+ Double.parseDouble(t[1].trim());
			t = br.readLine().split(":");
			double time2 = Double.parseDouble(t[0].trim()) * 60
					+ Double.parseDouble(t[1].trim());
			double dist = Double.parseDouble(br.readLine().trim());
			double temp = 0;

			double t1 = (time1 - time2) + dist;
			String res1 = String.format("%.1f", t1);
			double time = (time2 + 2 * dist);
			if (time <= time1)
				temp = (time1 - time2);
			else {
				double diff = time - time1;
				temp = (time1 - time2) + (diff / 2);
			}
			String res2 = String.format("%.1f", temp);
			out.println(res1 + " " + res2);
		}
		out.close();
	}

}
