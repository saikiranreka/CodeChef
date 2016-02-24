package easy;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.PrintWriter;
	
	class ATTIC {
	
		public static void main(String[] args) throws NumberFormatException,
				IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(System.out);
			int n = Integer.parseInt(br.readLine().trim());
			for (int k = 0; k < n; k++) {
				char[] t = br.readLine().trim().toCharArray();
				int count = 0;
				int maxlen = -1;
				int len = 0;
				for (int i = 0; i < t.length; i++) {
					if (t[i] == '.') {
						len++;
					} else if (i > 0 && t[i] == '#' && t[i - 1] == '.') {
						if (len > maxlen) {
							count++;
							maxlen = len;
							len = 0;
						}else{
							len=0;
						}
					}
				}
				out.println(count);
			}
			out.close();	
		}
	
	}
