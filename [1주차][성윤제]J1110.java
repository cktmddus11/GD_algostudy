import java.util.Scanner;
//Scanner sc = new Scanner(System.in);

public class J1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*int N = sc.nextInt();
		int NN = 0;
		if(N <10) {
			NN = N*10;
		}
		else {
			NN = N;
		}
		
		int a = 1;
		int b = 0;
		int c = 0;
		int d = 0;
		
		while (N != a) {
				if (NN/10 + NN%10 < 10) {
					b = (NN/10 + NN%10);
				}
				else {
					b = ((NN/10 + NN%10)%10);
				}
			c = (NN%10)*10;
			a = b + c;
			NN = a;
			d++;
		}
		System.out.println(d);*/
		
		int N = sc.nextInt();
		int a = N;
		int b = 0;
		if(a < 10) {
			a = a*10;
		}
		while (N != a || b == 0) {
			a = (a % 10)*10 + (a/10 + a%10)%10;
			b++;
		}
		System.out.println(b);
		sc.close();
	}

}
