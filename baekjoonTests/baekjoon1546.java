import java.util.Scanner;

public class baekjoon1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double array [] = new double [N]; //array�� ����
		double M = 0; //M=max
		double sum = 0;
		
		for(int i=0; i<N; ++i) {
			array[i] = sc.nextDouble(); //array�� ���ο� ���ڵ��� ����
			if(array[i]>M) {
				M=array[i];
			}
		}
		for (int i=0; i<N; ++i) {
			array[i] =array [i]/M*100;
			sum += array[i];
		}
		sc.close();
		System.out.println(sum/N);
	}

}
