package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;

class BEX {

	static class Book {
		int exer;
		int dep;
		String name;

		public Book(int exer, int dep, String name) {
			super();
			this.exer = exer;
			this.name = name;
			this.dep = dep;
		}
	}

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		Stack<Book> list = new Stack<Book>();
		for (int i = 0; i < n; i++) {
			String[] t = br.readLine().trim().split("\\s+");
			int num = Integer.parseInt(t[0].trim());
			if (t.length > 1) {
				if (num == 0) {
					continue;
				}
				if (list.isEmpty()) {
					list.push(new Book(num, 0, t[1]));
				} else {
					Book temp = list.peek();
					if (temp.exer < num) {
						temp.dep++;
					} else {
						list.add(new Book(num, 0, t[1]));
					}
				}
			} else {
				Book tem = list.pop();
				out.println(tem.dep + " " + tem.name);
			}
		}
		out.close();
	}
}
