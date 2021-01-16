<<<<<<< HEAD
import java.util.Scanner;

public class baekjoon1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();  //처음에 주어진 숫자
		int sum = 0; int x = A;            // x를 새로운 수로 가정
		
		while(true) {
			if (x<10) {
				x=10*x+x;                     //원래는 A로 식을 세웠었지만 실제로 반복문 안에서는 계속 A값을 새로운 값으로 바꿔줘야하므로 x라고 쓴다 
				sum++;
			} else {                          //x(즉 A)>10
				x=10*(x%10)+((x%10+x/10)%10);
				sum++;
			}
			if(x==A) break;
		}
		sc.close();
		System.out.println(sum);

	}

}
=======
import java.util.Scanner;

public class baekjoon1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();  //처음에 주어진 숫자
		int sum = 0; 
		int x = A;            // x를 새로운 수로 가정
		
		while(true) {
			if (x<10) {
				x=10*x+x;                     //원래는 A로 식을 세웠었지만 실제로 반복문 안에서는 계속 A값을 새로운 값으로 바꿔줘야하므로 x라고 쓴다 
				sum++;
			} else {                          //x(즉 A)>10
				x=10*(x%10)+((x%10+x/10)%10);
				sum++;
			}
			if(x==A) break;
		}
		sc.close();
		System.out.println(sum);

	}

}
>>>>>>> 49e15ecae2552c9f9426f19d236d15efd9fc1c7e
