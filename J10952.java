import java.util.*;
//Scanner sc = new Scanner(System.in);
public class J10952 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    int a = 0;
		while(a == 0) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			if (A == 0 && B == 0) {
				a = 1;
			}
			else {
				System.out.println(A + B);
			}
			
		}
	}

}
