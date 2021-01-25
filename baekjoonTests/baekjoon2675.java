import java.util.Scanner;

public class baekjoon2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스의 개수 입력

		for (int i = 0; i < T; i++) {
			int R = sc.nextInt(); // 반복횟수
			String S = sc.next(); // 문자열
			for (int j = 0; j < S.length(); j++) { // 문자열의 길이만큼 한글자한글자
				for (int k = 0; k < R; k++)
					System.out.print(S.charAt(j)); // 한글자를 R만큼 반복해준다
				// 이때 문자열에서 k번째가 아니라 j번째 글자!!
			}
			System.out.println(); // 개행해준다
		}
	}

}
