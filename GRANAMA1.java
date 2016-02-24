package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class GRANAMA1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			String[] t = br.readLine().split(" ");
			char[] ch1 = t[0].trim().toCharArray();
			char[] ch2 = t[1].trim().toCharArray();
			int[] count1 = new int[26];
			int[] count2 = new int[26];
			int al = ch1.length, bl = ch2.length;
			for (int j = 0, k = 0; j < al || k < bl; j++, k++) {
				if (j < al && k < bl) {
					count1[ch1[j] - 97]++;
					count2[ch2[k] - 97]++;
				} else if (j < al)
					count1[ch1[j] - 97]++;
				else
					count2[ch2[k] - 97]++;
			}
			boolean flag1 = true, flag2 = true;
			for (int j = 0; j < 26; j++) {
				if (count1[j] != count2[j]) {
					flag1 = false;
				}
				if ((count1[j] == 0 && count2[j] > 0)
						|| (count1[j] > 0 && count2[j] == 0))
					flag2 = false;
			}
			if (flag1 || !flag2) {
				out.println("YES");
			} else {
				out.println("NO");
			}
		}
		out.close();
	}

}
