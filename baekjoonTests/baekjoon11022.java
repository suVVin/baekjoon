<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon11022 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i=1; i<=T; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			//" "를 넣어주어야함, 입력하는 수 사이에 공백이 있으므로
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			bw.write("Case #"+i+": ");
			bw.write(A+" + "+B+" = "+(A+B)+"\n");//"\n"줄바꿈해주기
		}
		br.close();
		bw.flush();
		bw.close();

	}

}
=======
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon11022 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i=1; i<=T; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			//" "를 넣어주어야함, 입력하는 수 사이에 공백이 있으므로
			
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			bw.write("Case #"+i+": ");
			bw.write(A+" + "+B+" = "+(A+B)+"\n");//"\n"줄바꿈해주기
		}
		br.close();
		bw.flush();
		bw.close();

	}

}
>>>>>>> 49e15ecae2552c9f9426f19d236d15efd9fc1c7e
