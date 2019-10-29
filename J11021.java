import java.util.Scanner;
//Scanner sc = new Scanner(System.in);

public class J11021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		for(int i = 0; i < first; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("Case " + "#" + (i + 1) + ": " + a + " + " + b + " = " + (a + b));
		}
		sc.close();
	}

}
