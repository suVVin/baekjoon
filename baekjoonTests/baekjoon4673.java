public class baekjoon4673 {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001]; // 1~10000������ ����

		for (int i = 1; i < 10001; i++) {
			// 1���� ���ڰ� �ϳ��� �����ϸ鼭 �����ѹ� ã������ �Լ��� ����
			int n = d(i); // d �Լ� ����
			if (n < 10001) {
				check[n] = true;
				// d(n)�� �Ǵ� �� i�� �����ѹ��� �ƴ϶��(true) üũ
			}
		}
		// ��������� d �� �ǳľȵǳ� �̰� Ȯ���ؼ� ture �з�

		for (int i = 1; i < check.length; i++) {
			if (!check[i]) {
				System.out.println(i);
			}
		}
		// d�Լ� �ȵǴ� �͸� ����
	}

	public static int d(int number) {
		int sum = number; // ���� �ʱⰪ�� number
		while (number != 0) {
			sum = sum + (number % 10); // �����ڸ� �����ְ�
			number = number / 10; // �ڸ����� �ϳ� ���δ�
		}
		return sum;
	}
}
