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
			int count = 0; // count와 temp이 for문 안에서 지정되야하고
			int temp = D; // temp을 꼭 다시 지정해야하고
			
			while(temp !=0) {
				if (temp % 10 == array[i]) {
					count++;
				}
				temp /= 10; // 이게 if문 안에 들어가면 시간초과
			}
			bw.write(count+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
