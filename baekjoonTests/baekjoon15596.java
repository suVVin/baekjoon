
public class baekjoon15596 {

	long sum(int[] a) {
		long ans = 0; // ans�� ���ϰ�
		for (int i=0; i<a.length; i++) {
			ans = ans+ a[i];
		}
		return ans;
	}
}