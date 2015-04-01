package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;

class CANDLE {
	public static class Cand {
		int value;
		int count;

		Cand(int value, int count) {
			this.value = value;
			this.count = count;
		}

		Cand() {

		}
	}

	public class newComp implements Comparator<Cand> {
		public int compare(Cand o1, Cand o2) {

			return o1.count - o2.count;
		}

	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine().trim());
		PrintWriter out = new PrintWriter(System.out);
		for (int i = 0; i < test; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			ArrayList<Cand> list = new ArrayList<Cand>();
			for (int j = 0; j < 10; j++) {
				list.add(new Cand(j, Integer.parseInt(t[j].trim())));
			}
			list.sort(new CANDLE().new newComp());
			Cand temp = list.remove(0);
			if (temp.value == 0) {
				Cand temp2 = list.remove(0);
				if (temp.count < temp2.count) {
					out.print(1);
					for (int j = 0; j <= temp.count; j++) {
						out.print(0);
					}
				} else {
					for (int j = 0; j <= temp2.count; j++) {
						out.print(temp2.value);
					}
				}
			} else {
				for (int j = 0; j <= temp.count; j++) {
					out.print(temp.value);
				}
			}
			out.println();
		}
		out.close();
	}

}
