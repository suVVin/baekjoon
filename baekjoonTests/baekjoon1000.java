import java.util.Scanner;
public class baekjoon1000 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //sc는 객체명, 주로 in나 sc 사용
		int A = sc.nextInt(); // nextInt():Reads a int value from the user
		int B = sc.nextInt();
		sc.close();
		System.out.println(A+B);
	}
}
