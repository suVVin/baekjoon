import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2577_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int D = A * B * C;

		int[] array = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < 10; ++i) {
			int count = 0; // count�� temp�� for�� �ȿ��� �����Ǿ��ϰ�
			int temp = D; // temp�� �� �ٽ� �����ؾ��ϰ�
			
			while(temp !=0) {
				if (temp % 10 == array[i]) {
					count++;
				}
				temp /= 10; // �̰� if�� �ȿ� ���� �ð��ʰ�
			}
			bw.write(count+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
