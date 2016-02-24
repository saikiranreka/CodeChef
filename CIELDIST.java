package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class CIELDIST {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			long ds = Long.parseLong(t[0].trim());
			long dt = Long.parseLong(t[1].trim());
			long d = Long.parseLong(t[2].trim());
			long diff = d - ds - dt;
			if (diff > 0) {
				out.println(diff);
			} else {
				if (dt - d - ds > 0) {
					out.println(dt - d - ds);
				} else if (ds - d - dt > 0) {
					out.println(ds - d - dt);
				} else {
					out.println(0);
				}
			}

		}
		out.close();
	}

}
