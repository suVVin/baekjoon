<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2742 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=N; i<0; --i) { //i==1�ߴ��� �۵��� �ȵ�
		
			bw.write(i+"\n");//�ٹٲ��ؾ��ؼ� �� \n
		}
		bw.close();
		br.close();
		bw.flush();
	}

}
=======
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2742 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i=N; i<0; --i) { //i==1�ߴ��� �۵��� �ȵ�
		
			bw.write(i+"\n");//�ٹٲ��ؾ��ؼ� �� \n
		}
		bw.close();
		br.close();
		bw.flush();
	}

}
>>>>>>> 49e15ecae2552c9f9426f19d236d15efd9fc1c7e
