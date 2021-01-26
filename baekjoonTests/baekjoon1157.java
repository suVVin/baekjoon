import java.util.Scanner;
public class baekjoon1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String S = sc.next(); //알파벳 대소문자로 이루어진 단어가 주어짐
		S=S.toUpperCase();
		int [] count = new int [26];
		
		for (int i=0; i<S.length(); i++) { //문자열에서 첫번째 문자
			int num = S.charAt(i)-65; //대문자에서 그 값을 숫자로 찾기
			count[num] ++; // count배열 내의 숫자로 정해진 위치에서 값 더하기
		}
		
		int max =0;
		char answer = '?';
		for (int i=0; i<26; i++) {
			if(count[i] > max) {
				max = count[i]; // count[i]는 알파벳을 의미하는 숫자
				answer = (char)(i+65);
			}else if (count[i]==max) {
				answer = '?';
			}
		}
		System.out.println(answer);
	}

}
