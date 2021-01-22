
public class baekjoon15596 {

	long sum(int[] a) {
		long ans = 0; // ans가 리턴값
		for (int i=0; i<a.length; i++) {
			ans = ans+ a[i];
		}
		return ans;
	}
}