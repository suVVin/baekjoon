import java.util.Scanner;
public class baekjoon10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String S = sc.next();//�ܾ� S�� �־�����
		
		for(char n='a'; n<='z'; n++) 
			System.out.print(S.indexOf(n)+" ");
	}
}