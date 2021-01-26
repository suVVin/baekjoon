import java.util.Scanner;
public class baekjoon1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String S = sc.next(); //���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־���
		S=S.toUpperCase();
		int [] count = new int [26];
		
		for (int i=0; i<S.length(); i++) { //���ڿ����� ù��° ����
			int num = S.charAt(i)-65; //�빮�ڿ��� �� ���� ���ڷ� ã��
			count[num] ++; // count�迭 ���� ���ڷ� ������ ��ġ���� �� ���ϱ�
		}
		
		int max =0;
		char answer = '?';
		for (int i=0; i<26; i++) {
			if(count[i] > max) {
				max = count[i]; // count[i]�� ���ĺ��� �ǹ��ϴ� ����
				answer = (char)(i+65);
			}else if (count[i]==max) {
				answer = '?';
			}
		}
		System.out.println(answer);
	}

}
