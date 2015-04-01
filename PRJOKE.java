package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class PRJOKE {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			int n = Integer.parseInt(br.readLine().trim());
			int c = 1;
			br.readLine();
			for (int j = 2; j <= n; j++) {
				br.readLine();
				c = c ^ j;
			}
			out.println(c);
		}
		out.close();
	}

}
