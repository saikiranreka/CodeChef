package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CIELTOMY {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			String[] tt = br.readLine().trim().split("\\s+");
			long N = Long.parseLong(tt[0]);
			long M = Long.parseLong(tt[1]);
			long[][] map = new long[(int) N][(int) N];
			for(int j=0;j<M;j++){
				tt = br.readLine().trim().split("\\s+");
				long a = Long.parseLong(tt[0]);
				long b = Long.parseLong(tt[1]);
				long c = Long.parseLong(tt[2]);
			}
		}

	}

}
