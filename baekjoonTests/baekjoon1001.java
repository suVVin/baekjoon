import java.util.Scanner;
public class baekjoon1001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close(); //resource leak ������ 
		
		System.out.println(A-B);
	}
}
