import java.util.Scanner;
public class baekjoon11720_ {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();    //������ ���� N �Է�
		String st = sc.next();
		sc.close();
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			int number = st.charAt(i)-48; 		
			// �ƽ�Ű�ڵ�� 0(48)���� 9(57)�� ���� ������. 
			//���ڸ� �ƽ�Ű�ڵ�� ���� �ϳ��ϳ��� (���ڿ���)���ڷ� ��ȯ��Ų��
			sum = sum + number;
		}
		System.out.println(sum);
	}

}
