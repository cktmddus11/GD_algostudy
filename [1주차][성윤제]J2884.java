import java.util.*;
//Scanner sc = new Scanner(System.in);
public class J2884 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int HH = sc.nextInt();
		int MM = sc.nextInt();
		//00시 45분 전일때 60 + 43 - 45 = 58
		if(HH == 00) {
			if(MM < 45) {
				HH = 23;
				MM = 60 + MM - 45;
			}
			else {
				MM = MM -45;
			}
		}
		else {
			if(MM < 45) {
				HH = HH - 1;
				MM = 60 + MM - 45;
			}
			else {
				MM = MM -45;
			}
		}
		System.out.println(HH);
		System.out.println(MM);
		sc.close();
	}

}
