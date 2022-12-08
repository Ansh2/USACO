package Other;
import java.util.*;

public class Aname {

	public static void main(String[] args) {
		double[] arr = new double[100000];
		double[] temp = new double[100000];
		arr[0] = 1;

		for (int k = 1; k < arr.length; k++) {
			if (k != 0) {
				if (k * 2 < arr.length) {
					temp[k + 1] = Math.pow((k + 1), 6) % 1049;
					temp[k - 1] = Math.pow((k - 1), 6) % 1049;
				}
			}
			if (arr[k] % 2 == 1) {
				if (2 * k < arr.length) {
					temp[2 * k] = Math.pow(2 * k, 6) % 1049;
				}

			}
			if (arr[k] % 2 == 0) {
				if (k / 2 < arr.length) {
					temp[k / 2] = Math.pow(k / 2, 6) % 1049;
				}
			}

		}

		System.out.println(Arrays.toString(temp));

	}

}
