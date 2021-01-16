<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class baekjoon11021 {

	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T =Integer.parseInt(br.readLine());
		
				
		for (int i=1; i<=T; ++i) {
			StringTokenizer st= new StringTokenizer(br.readLine()," ");	//for문 안에 위치시키기
			int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
			bw.write("Case #"+i+": "); //문제에서 띄어씌기 잘보기
			bw.write((A+B)+"\n");
		//또는 bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
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

public class baekjoon11021 {

	public static void main(String[] args) throws IOException{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T =Integer.parseInt(br.readLine());
		
				
		for (int i=1; i<=T; ++i) {
			StringTokenizer st= new StringTokenizer(br.readLine()," ");	//for문 안에 위치시키기
			int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
			bw.write("Case #"+i+": "); //문제에서 띄어씌기 잘보기
			bw.write((A+B)+"\n");
		//또는 bw.write(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken())+"\n");
		}
		br.close();
		bw.flush();
		bw.close();

	}

}
>>>>>>> 49e15ecae2552c9f9426f19d236d15efd9fc1c7e
