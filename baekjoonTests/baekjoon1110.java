<<<<<<< HEAD
import java.util.Scanner;

public class baekjoon1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();  //ó���� �־��� ����
		int sum = 0; int x = A;            // x�� ���ο� ���� ����
		
		while(true) {
			if (x<10) {
				x=10*x+x;                     //������ A�� ���� ���������� ������ �ݺ��� �ȿ����� ��� A���� ���ο� ������ �ٲ�����ϹǷ� x��� ���� 
				sum++;
			} else {                          //x(�� A)>10
				x=10*(x%10)+((x%10+x/10)%10);
				sum++;
			}
			if(x==A) break;
		}
		sc.close();
		System.out.println(sum);

	}

}
=======
import java.util.Scanner;

public class baekjoon1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();  //ó���� �־��� ����
		int sum = 0; 
		int x = A;            // x�� ���ο� ���� ����
		
		while(true) {
			if (x<10) {
				x=10*x+x;                     //������ A�� ���� ���������� ������ �ݺ��� �ȿ����� ��� A���� ���ο� ������ �ٲ�����ϹǷ� x��� ���� 
				sum++;
			} else {                          //x(�� A)>10
				x=10*(x%10)+((x%10+x/10)%10);
				sum++;
			}
			if(x==A) break;
		}
		sc.close();
		System.out.println(sum);

	}

}
>>>>>>> 49e15ecae2552c9f9426f19d236d15efd9fc1c7e
