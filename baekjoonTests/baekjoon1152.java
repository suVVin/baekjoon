import java.util.Scanner;

public class baekjoon1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine().trim();

		if (S.isEmpty())
			System.out.println(0);
		else
			System.out.println(S.split(" ").length);
	}
}
