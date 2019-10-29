import java.util.*;
//Scanner sc = new Scanner(System.in);
public class J10817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int temp = 0;
		if(arr[0] > arr[1]) {
			 temp = arr[1];
			 arr[1] = arr[0];
			 arr[0] = temp;
		}
		if(arr[1] > arr[2]) {
			temp = arr[2];
			 arr[2] = arr[1];
			 arr[1] = temp;
		}
		if(arr[0] > arr[1]) {
			 temp = arr[1];
			 arr[1] = arr[0];
			 arr[0] = temp;
		}
		System.out.println(arr[1]);
	}

}
