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
		int Dlength = (int)(Math.log10(D)+1); 
		//(int)(Math.log10(D)+1)은 숫자의 자리수 구하는 방법
				
		for(int i=0; i<Dlength; ++i) {
			
				
			}
		}
		
	}
}
