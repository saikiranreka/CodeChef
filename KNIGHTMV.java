package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

class KNIGHTMV {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		for (int i = 0; i < n; i++) {
			String[] t = br.readLine().trim().split("-");
			if (t.length != 2) {
				out.println("Error");
				continue;
			}
			if (t[0].trim().length() != 2 || t[1].trim().length() != 2) {
				out.println("Error");
				continue;
			}
			char[] a1 = t[0].trim().toCharArray();
			char[] a2 = t[1].trim().toCharArray();
			if (a1[0] < 'a' || a1[0] > 'h' || a1[1] > '8' || a1[1] < '1'
					|| a2[0] < 'a' || a2[0] > 'h' || a2[1] > '8' || a2[1] < '1') {
				out.println("Error");
				continue;
			}
			ArrayList<String> validMoves = getValidMoves(a1);
			if (validMoves.contains(t[1].trim())) {
				out.println("Yes");
			} else {
				out.println("No");
			}

		}
		out.close();
	}

	private static ArrayList<String> getValidMoves(char[] a1) {
		ArrayList<String> res = new ArrayList<String>();
		StringBuilder sb = new StringBuilder();
		if (a1[0] + 2 <= 'h' && a1[1] + 2 <= '8') {
			sb = new StringBuilder();
			sb.append((char) (a1[0] + 1));
			sb.append((char) (a1[1] + 2));
			res.add(sb.toString());
			sb = new StringBuilder();
			sb.append((char) (a1[0] + 2));
			sb.append((char) (a1[1] + 1));
			res.add(sb.toString());
		}
		if (a1[0] + 2 <= 'h' && a1[1] - 2 >= '1') {
			sb = new StringBuilder();
			sb.append((char) (a1[0] + 1));
			sb.append((char) (a1[1] - 2));
			res.add(sb.toString());
			sb = new StringBuilder();
			sb.append((char) (a1[0] + 2));
			sb.append((char) (a1[1] - 1));
			res.add(sb.toString());
		}
		if (a1[0] - 2 >= 'a' && a1[1] + 2 <= '8') {
			sb = new StringBuilder();
			sb.append((char) (a1[0] - 1));
			sb.append((char) (a1[1] + 2));
			res.add(sb.toString());
			sb = new StringBuilder();
			sb.append((char) (a1[0] - 2));
			sb.append((char) (a1[1] + 1));
			res.add(sb.toString());
		}
		if (a1[0] - 2 >= 'a' && a1[1] - 2 >= '1') {
			sb = new StringBuilder();
			sb.append((char) (a1[0] - 1));
			sb.append((char) (a1[1] - 2));
			res.add(sb.toString());
			sb = new StringBuilder();
			sb.append((char) (a1[0] - 2));
			sb.append((char) (a1[1] - 1));
			res.add(sb.toString());
		}
		return res;
	}
}
