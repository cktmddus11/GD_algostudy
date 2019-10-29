import java.util.*;
//Scanner sc = new Scanner(System.in);
public class J2753 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Y = sc.nextInt();
		if (Y%4 == 0 && (Y%100 != 0 || Y%400 == 0)) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
		sc.close();
	}

}
