package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class PCYCLE {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		PrintWriter out = new PrintWriter(System.out);
		String[] t = br.readLine().trim().split("\\s+");
		int[] arr = new int[n + 1];
		boolean[] visited = new boolean[n + 1];
		for (int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(t[i - 1].trim());
		}
		int i = 1;
		int count = 0;
		StringBuilder sb = new StringBuilder();
		for (; i <= n; i++) {
			if (!visited[i])
				count++;
			int start = i;
			boolean loop = false;
			while (!visited[start]) {
				sb.append(start + " ");
				visited[start] = true;
				start = arr[start];
				loop = true;
			}
			if (loop) {
				sb.append(i + "\n");
				loop = false;
			}

		}
		out.println(count);
		out.print(sb.toString().trim());
		out.close();
	}
}
