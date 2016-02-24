package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class ARRANGE {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			int N = Integer.parseInt(t[0].trim());
			int count = 1 << N;
			char[] arr = new char[count];
			for (int j = 0; j < count; j++) {
				String binaryString = Integer.toBinaryString(j);
				StringBuilder sb = new StringBuilder();
				for (int k = 0; k < N - binaryString.length(); k++) {
					sb.append("0");
				}
				sb.append(binaryString);
				sb=sb.reverse();
				int index = Integer.parseInt(sb.toString(), 2);
				arr[index] = t[1].charAt(j);
			}
			out.println(new String(arr));
		}
		out.close();
	}

}
