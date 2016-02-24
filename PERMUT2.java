package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class PERMUT2 {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String t = null;
		while (!(t = br.readLine().trim()).equals("0")) {
			int x = Integer.parseInt(t.trim());
			if (x == 0)
				break;
			int a[] = new int[x];
			int flag = 0;
			String[] tt = br.readLine().trim().split("\\s+");
			for (int i = 0; i < x; i++)
				a[i] = Integer.parseInt(tt[i].trim());

			for (int i = 0; i < x; i++) {
				if (a[a[i] - 1] != i + 1) {
					flag = 1;
					break;
				}
			}
			if (flag == 1)
				System.out.println("not ambiguous");
			else
				System.out.println("ambiguous\n");

		}

	}

}
