import java.util.Scanner;
public class baekjoon10818 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int [] array = new int[N];
		
		int max = -1000000;//�ִ밪
		int min = 1000000;//�ּҰ�
		
		for (int i=0; i<N;++i) { //array.length�� ������ N�̹Ƿ�
			array[i] = sc.nextInt(); //�迭 ���� ��
			
			if (max<array[i]) {
				max=array[i];
			}
			if (min>array[i]) {
				min=array[i];
			}
		}
		System.out.println(min+" "+max);
		sc.close();
	}

}
