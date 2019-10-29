import java.util.Scanner;

public class J15552 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		for(int i = 0 ; i < size ; i++) {
			System.out.println(sc.nextInt() + sc.nextInt());
		}
		
		sc.close();
	}
}