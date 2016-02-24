package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

class NOLOGIC {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			String t = br.readLine().trim();
			char[] ques = t.toLowerCase().toCharArray();
			boolean[] dic = new boolean[26];
			Arrays.fill(dic, true);
			for (int j = 0; j < ques.length; j++) {
				if (ques[j] >= 97 && ques[j] <= 122) {
					dic[ques[j] - 97] = false;
				}
			}
			boolean flag = false;
			for (int j = 0; j < 26; j++) {
				if (dic[j]) {
					out.println((char) (97 + j));
					flag = true;
					break;
				}
			}
			if (!flag) {
				out.println("~");
			}
		}
		out.close();
	}

}
