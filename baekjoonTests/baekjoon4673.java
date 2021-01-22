public class baekjoon4673 {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001]; // 1~10000까지의 숫자

		for (int i = 1; i < 10001; i++) {
			// 1부터 숫자가 하나씩 증가하면서 셀프넘버 찾기위한 함수에 대입
			int n = d(i); // d 함수 설정
			if (n < 10001) {
				check[n] = true;
				// d(n)이 되는 수 i는 셀프넘버가 아니라고(true) 체크
			}
		}
		// 여기까지는 d 가 되냐안되냐 이거 확인해서 ture 분류

		for (int i = 1; i < check.length; i++) {
			if (!check[i]) {
				System.out.println(i);
			}
		}
		// d함수 안되는 것만 고르기
	}

	public static int d(int number) {
		int sum = number; // 합의 초기값이 number
		while (number != 0) {
			sum = sum + (number % 10); // 일의자리 더해주고
			number = number / 10; // 자릿수를 하나 줄인다
		}
		return sum;
	}
}
