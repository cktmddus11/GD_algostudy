import java.util.*;
public class J10998 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		System.out.println(A * (B%10));
		System.out.println(A * ((B%100 - B%10)/10));
		System.out.println(A * ((B - (B%10) - (B%100 - B%10))/100));
		System.out.println(A * B);
		sc.close();
	}

}
