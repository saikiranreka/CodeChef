package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class FGFS {
	static class Customer implements Comparable<Customer>{
		int start;
		int end;

		@Override
		public int compareTo(Customer arg0) {
			
			return 0;
		}
		
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int tests = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < tests; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			long N = Long.parseLong(t[0]);
			long K = Long.parseLong(t[1]);
			for (int j = 0; j < N; j++) {

		 	}
		}

	}

}
