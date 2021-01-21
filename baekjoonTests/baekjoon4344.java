import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon4344 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int C = Integer.parseInt(br.readLine()), N, sum, cnt;
		// C:테스트케이스 수, N:학생수 , sum:점수의 합 , cnt: 평균넘는 학생수
		String[] tmp; // 학생수 + 점수를 한번에 입력받는다
		while (C-- > 0) { // 테스트 케이스 C번을 다 실행할때까지
			sum = cnt = 0;
			tmp = br.readLine().split(" "); // 학생 수와 점수 입력받을 때 공백으로 구분
			N = Integer.parseInt(tmp[0]); // 배열의 첫번째는 학생수

			for (int i = 1; i < tmp.length; i++)
				sum += Integer.parseInt(tmp[i]);
			for (int i = 1; i < tmp.length; i++) {
				if (Integer.parseInt(tmp[i]) > sum / N)
					cnt++;// 점수가 평균보다크면 평균넘는 학생수 센다
			}
			bw.write(String.format("%.3f", cnt / (double) N * 100) + "%" + "\n");
			// (double)형으로 변환시킴
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
