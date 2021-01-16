import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon10818_2 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int array[] = new int[N];
		
		StringTokenizer st=new StringTokenizer(br.readLine(), " "); 
		//�̰� 13���ٿ� �������� ��Ÿ�ӿ����� ���� ��������� �ɰ��� �ǵ� �ʿ���� �κб��� �ɰ��� �׷��ǰ�
		int min = 1000000;
		int max = -1000000;
		
		for(int i=0; i<N; ++i) {
			array[i]=Integer.parseInt(st.nextToken()); 
			
			if(min>array[i]) {
				min=array[i];
			}
			if(max<array[i]) {
				max=array[i];
			}
		}
		bw.write(min+" "+max);
		
		br.close();
		bw.flush();
		bw.close();
	}
}
