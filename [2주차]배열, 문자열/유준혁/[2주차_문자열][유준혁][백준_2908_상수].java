import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		StringBuffer sb1 = new StringBuffer(s.split(" ")[0]).reverse();
		StringBuffer sb2 = new StringBuffer(s.split(" ")[1]).reverse();
		System.out.println(Math.max(Integer.parseInt(new String(sb1)),Integer.parseInt(new String(sb2))));
	}
}