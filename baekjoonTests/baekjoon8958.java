import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class baekjoon8958 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int[] size = new int[Integer.parseInt(br.readLine())];
		String[] str = new String[size.length];
		int count= 0;//몇번째 인지
		int sum= 0;//합계
		char ch;
		
		for (int i=0; i<size.length; ++i) {
			str[i]= br.readLine();
		}
		for (int i=0; i<size.length; ++i) {
			for (int j=0; j<str[i].length(); ++j) {
				ch = str[i].charAt(j);
				if (ch =='O') {
					sum = sum + (++count);
				}else{
					count = 0;
				}
			}
			bw.write(sum+"\n");
			sum=0;
			count=0;
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
