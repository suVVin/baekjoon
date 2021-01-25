import java.util.Scanner;
public class baekjoon11720_ {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();    //숫자의 개수 N 입력
		String st = sc.next();
		sc.close();
		
		int sum = 0;
		for(int i=0; i<N; i++) {
			int number = st.charAt(i)-48; 		
			// 아스키코드는 0(48)부터 9(57)의 값을 가진다. 
			//문자를 아스키코드로 보고 하나하나를 (문자에세)숫자로 변환시킨다
			sum = sum + number;
		}
		System.out.println(sum);
	}

}
