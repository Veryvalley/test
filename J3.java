
import java.util.Scanner;


public class J3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入两个非负数：");
		String str1 = scan.next();
		String str2 = scan.next();
		StringBuffer str11=new StringBuffer(str1);
		str11.reverse();
		StringBuffer str22 = new StringBuffer(str2);
		str22.reverse();
		int num1 =Integer.parseInt(str11.toString());
		int num2 =Integer.parseInt(str22.toString());
		System.out.println(num1+num2);
	}
}
