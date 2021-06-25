package mx.urieban.logialTest.geeksForGeeks.easy;

/**
 * 
 * @author <a href="https://www.linkedin.com/in/urieban/" target="_blank">Uriel
 *         Esteban</a>
 *
 */
public class RotateArray {

	private int[] rotate(int[] arr, int n, int d) {
		int[] rotateArr = new int[d];
		int rotate = n;
		for (int i = 0; i < d; i++) {
			if (rotate == d) {
				rotate = 0;
				rotateArr[i] = arr[rotate];
				System.out.println(rotateArr[i]);
				rotate++;
			} else {
				rotateArr[i] = arr[rotate];
				System.out.println(rotateArr[i]);
				rotate++;
			}
		}
		System.out.println();
		return rotateArr;
	}

	public static void main(String[] args) {
		RotateArray rotate = new RotateArray();
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
		rotate.rotate(arr, 5, 7);
	}

}
