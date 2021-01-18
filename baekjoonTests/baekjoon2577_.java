import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2577_ {
	public static void main(String args[])throws IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = A*B*C;
		
		int [] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		for(int i=0; i<array.length; ++i) {
			int count=0; //��ġ�ϴ� ���ڸ� ���� ������ ����
			int temp = D; //�Է� ���ڸ� ����
			
			while(temp !=0) {
				if (temp%10==array[i]) { //���ڸ� ������ ��
					count++;
				}
				temp /=10;
			}
			bw.write(count);
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
