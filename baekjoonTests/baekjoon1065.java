import java.util.Scanner;

public class baekjoon1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(numbering(num));
		sc.close();
	}

	public static int numbering(int num) {
		int cnt = 0; // 한수 카운팅
		if (num < 100) {
			return num;
		} else {
			cnt = 99;
			if (num == 1000)
				num = 999; // 예외처리

			for (int i = 100; i <= num; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;

				if ((hun - ten) == (ten - one))
					cnt++;
			}
		}
		return cnt;
	}
}
