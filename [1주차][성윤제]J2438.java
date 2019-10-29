import java.util.Scanner;
//Scanner sc = new Scanner(System.in);
public class J2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for (int i = 0; i < a; i++) {
			for(int t =a; t > i + 1; t--) {
				System.out.print(" ");
			}
			for(int j = 0; j<= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		sc.close();
	}

}
