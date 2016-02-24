package easy;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
	class ATM {
	
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] t = br.readLine().trim().split("\\s+");
			int wd = Integer.parseInt(t[0].trim());
			double bal = Double.parseDouble(t[1].trim());
			if (wd % 5 != 0) {
				System.out.println(bal);
			} else {
				if (bal - wd - 0.5 < 0) {
					System.out.println(bal);
				} else {
					System.out.println(bal - wd - 0.5);
				}
			}
	
		}
	
	}
