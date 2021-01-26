import java.util.Scanner;

public class baekjoon2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		a = (a % 10) * 100 + ((a / 10) % 10) * 10 + a / 100;
		b = (b % 10) * 100 + ((b / 10) % 10) * 10 + b / 100;

		int result = 0;

		if (a > b)
			result = a;
		if (a < b)
			result = b;

		System.out.println(result);
	}
}
