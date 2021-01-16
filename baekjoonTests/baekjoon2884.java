import java.util.Scanner;
public class baekjoon2884 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(); // Hour
		int M = sc.nextInt(); //Minute
		sc.close();
		
//		if (M-45<0) 
//			if (H-1<0) 
//			System.out.println(23+" "+(60-(M-45)));
//			else 
//				System.out.println(H-1+" "+(60-(M-45)));	
//			
//		if (15<=(M-45)||(M-45)<=0) 
//			System.out.println(H+" "+(M-45));	

		if (M<45) 
			if (H==0) System.out.println(23+" "+(60-(45-M)));
			else System.out.println((H-1)+" "+(60-(45-M)));
		else System.out.println(H+" "+(M-45));
		
	}

}
