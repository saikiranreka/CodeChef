package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class DIGROT {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine().trim());
			int max = 0;
			for (int j = 0; j < 2; j++) {
				int ror = 0;
				if (j == 0) {
					ror = leftRotation(num);
				} else {
					ror = rightRotation(num);
				}
				max = Math.max(max, ror);
				int value = ror;
				for (int k = 0; k < 8; k++) {
					value = leftRotation(value);
					max = Math.max(value, max);
				}
				value = ror;
				for (int k = 0; k < 8; k++) {
					value = rightRotation(value);
					max = Math.max(value, max);
				}
			}
			out.println(max);
		}
		out.close();
	}

	public static int leftRotation(int value) {
		String temp = Integer.toString(value);
		temp = temp.substring(1) + temp.charAt(0);
		return Integer.parseInt(temp);
	}

	public static int rightRotation(int value) {
		String temp = Integer.toString(value);
		int length = temp.length();
		temp = temp.charAt(length - 1) + temp.substring(0, length - 1);
		return Integer.parseInt(temp);
	}

}
