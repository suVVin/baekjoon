import java.util.Scanner;

public class baekjoon5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int cnt = 0;
		sc.close();

		for (int i = 0; i < S.length(); i++) {
			char s = S.charAt(i);
			if (s == 'A' || s == 'B' || s == 'C')
				cnt = cnt + 3;
			if (s == 'D' || s == 'E' || s == 'F')
				cnt = cnt + 4;
			if (s == 'G' || s == 'H' || s == 'I')
				cnt = cnt + 5;
			if (s == 'J' || s == 'K' || s == 'L')
				cnt = cnt + 6;	
			if (s == 'M' || s == 'N' || s == 'O')
				cnt = cnt + 7;
			if (s == 'P' || s == 'Q' || s == 'R' || s == 'S')
				cnt = cnt + 8;
			if (s == 'T' || s == 'U' || s == 'V')
				cnt = cnt + 9;
			if (s == 'W' || s == 'X' || s == 'Y' || s == 'Z')
				cnt = cnt + 10;

		}
		System.out.println(cnt);
	}

}
