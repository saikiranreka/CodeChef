package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class ONP {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			char[] input = br.readLine().trim().toCharArray();
			int top = 0;
			char[] stack = new char[400];
			for (int j = 0; j < input.length; j++) {
				if (input[j] == '(')
					continue;
				else if (input[j] == ')') {
					out.print(stack[top]);
					top--;
				} else if (input[j] == '+' || input[j] == '-'
						|| input[j] == '*' || input[j] == '/'
						|| input[j] == '^' || input[j] == '%') {
					top++;
					stack[top] = input[j];
				} else
					out.print(input[j]);
			}
			out.println();
		}
		out.close();
	}

}
