import java.util.Scanner;

public class baekjoon2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next().toLowerCase();
		int cnt = 0;
		sc.close();

		if (S.charAt(i) == 'č' || S.charAt(i) == 'ć') 
			'č'='c'; 'ć'='c';
			if (S.charAt(i) == 'dž')
				char dž = 'd';
			if (S.charAt(i) =='đ')
				'đ'= 'd';
			if (S.charAt(i) == 'š')
				'š' = 's';
			if (S.charAt(i) =='ž')
				'ž' = 'z';
			if (S.charAt(i) =='lj')
				'lj' = 'l'
			if (S.charAt(i) =='nj')
				'nj'= 'n'
			for (int i = 0; i < S.length(); i++) {
				for(char j = a; j<=z; j++) {
					if (S.charAt(i) = j)
						cnt ++;
				}

			}
			System.out.println(cnt);
	}
}