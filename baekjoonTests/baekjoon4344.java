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
		// C:�׽�Ʈ���̽� ��, N:�л��� , sum:������ �� , cnt: ��ճѴ� �л���
		String[] tmp; // �л��� + ������ �ѹ��� �Է¹޴´�
		while (C-- > 0) { // �׽�Ʈ ���̽� C���� �� �����Ҷ�����
			sum = cnt = 0;
			tmp = br.readLine().split(" "); // �л� ���� ���� �Է¹��� �� �������� ����
			N = Integer.parseInt(tmp[0]); // �迭�� ù��°�� �л���

			for (int i = 1; i < tmp.length; i++)
				sum += Integer.parseInt(tmp[i]);
			for (int i = 1; i < tmp.length; i++) {
				if (Integer.parseInt(tmp[i]) > sum / N)
					cnt++;// ������ ��պ���ũ�� ��ճѴ� �л��� ����
			}
			bw.write(String.format("%.3f", cnt / (double) N * 100) + "%" + "\n");
			// (double)������ ��ȯ��Ŵ
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
