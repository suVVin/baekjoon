<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon2439 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; ++i) {
			for(int j=1; j<=N-i; ++j) { 
				//" "를 4321순서로 하지만 4개의 띄어쓰기가 있는 곳에서는 한번씩 입력하는 걸 반복해서 하는 것이므로
				bw.write(" ");
			}
			for(int k=1; k<=i; ++k) {
				bw.write("*");
			}
			bw.newLine();
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

public class baekjoon2439 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=N; ++i) {
			for(int j=1; j<=N-i; ++j) { 
				//" "를 4321순서로 하지만 4개의 띄어쓰기가 있는 곳에서는 한번씩 입력하는 걸 반복해서 하는 것이므로
				bw.write(" ");
			}
			for(int k=1; k<=i; ++k) {
				bw.write("*");
			}
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
>>>>>>> 49e15ecae2552c9f9426f19d236d15efd9fc1c7e
