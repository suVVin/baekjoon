import java.util.Scanner;
public class baekjoon11654_ {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String st = sc.next(); //숫자나 문자로 입력받음
		int result = st.charAt(0); 
		// STring 하나가 주어지니까 0번째라고 가정
		// 아스키코드는 정수로 이루어져있으므로 
		//입력받은 String 값을 int타입으로 변환
		System.out.println(result);
	}

}
