package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class SUMTRIAN {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine().trim());
		PrintWriter out = new PrintWriter(System.out);

		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(br.readLine().trim());
			ArrayList<Integer> list=new ArrayList<Integer>();
			int b = Integer.parseInt(br.readLine().trim());
			for (int j = 0; j < b - 1; j++) {
				String[] t = br.readLine().trim().split("\\s+");
				
			}
		}

	}
}
