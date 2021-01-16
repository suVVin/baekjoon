import java.util.Scanner;
public class baekjoon10818 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int [] array = new int[N];
		
		int max = -1000000;//최대값
		int min = 1000000;//최소값
		
		for (int i=0; i<N;++i) { //array.length가 어차피 N이므로
			array[i] = sc.nextInt(); //배열 속의 수
			
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
