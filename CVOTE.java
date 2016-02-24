package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.TreeMap;

public class CVOTE {
	static class Item {
		String name;
		int votes;

		public Item(String name, int votes) {
			super();
			this.name = name;
			this.votes = votes;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		String[] t = br.readLine().split("\\s+");
		int chefs = Integer.parseInt(t[0]);
		int votes = Integer.parseInt(t[1]);
		HashMap<String, String> chefCountry = new HashMap<String, String>();
		Item[] chefsList = new Item[chefs];
		for (int i = 0; i < chefs; i++) {
			t = br.readLine().trim().split("\\s+");
			chefCountry.put(t[0].trim(), t[1].trim());
			chefsList[i] = new Item(t[0], 0);
		}
		TreeMap<String, Integer> chefVotes = new TreeMap<String, Integer>();
		TreeMap<String, Integer> countryVotes = new TreeMap<String, Integer>();
		for (int i = 0; i < votes; i++) {
			String key = br.readLine().trim();
			if (chefVotes.containsKey(key)) {
				chefVotes.put(key, chefVotes.get(key) + 1);
				countryVotes.put(chefCountry.get(key),
						countryVotes.get(chefCountry.get(key)) + 1);
			} else {
				chefVotes.put(key, 1);
				countryVotes.put(chefCountry.get(key), 1);
			}
		}
	}

}
