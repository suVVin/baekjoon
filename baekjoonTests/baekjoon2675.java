import java.util.Scanner;

public class baekjoon2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // �׽�Ʈ ���̽��� ���� �Է�

		for (int i = 0; i < T; i++) {
			int R = sc.nextInt(); // �ݺ�Ƚ��
			String S = sc.next(); // ���ڿ�
			for (int j = 0; j < S.length(); j++) { // ���ڿ��� ���̸�ŭ �ѱ����ѱ���
				for (int k = 0; k < R; k++)
					System.out.print(S.charAt(j)); // �ѱ��ڸ� R��ŭ �ݺ����ش�
				// �̶� ���ڿ����� k��°�� �ƴ϶� j��° ����!!
			}
			System.out.println(); // �������ش�
		}
	}

}
