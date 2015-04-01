package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

class TOTR {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//PrintWriter out = new PrintWriter(System.out);
		String[] t = br.readLine().trim().split(" ");
		HashMap<Character, Character> dictionary = new HashMap<Character, Character>();
		dictionary.put('_', ' ');
		int tests = Integer.parseInt(t[0].trim());
		for (int i = 0; i < t[1].trim().length(); i++) {
			dictionary.put((char) (((int) 'a') + i), t[1].charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < tests; i++) {
			String tt = br.readLine().trim();
			for (int j = 0; j < tt.length(); j++) {
				char temp = tt.charAt(j);
				if (dictionary.containsKey(temp)) {
					sb.append(dictionary.get(temp));
				} else {
					char tLower = Character.toLowerCase(temp);
					if (dictionary.containsKey(tLower)) {
						sb.append(Character.toUpperCase(dictionary.get(tLower)));
					} else {
						sb.append(temp);
					}
				}
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}

}
