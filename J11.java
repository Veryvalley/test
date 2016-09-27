import java.util.Scanner;


public class J11 {
	public static void main(String[] args) {
		System.out.println("请输入一个邮箱地址：");
		Scanner scan = new Scanner(System.in);
		String email = scan.next();
		String reg ="[a-zA-Z0-9_\\.]+@[a-zA-Z0-9]+(\\.com)";
		//"[a-zA-Z0-9_\\.]+@[a-zA-Z0-9]+(\\.com)"
		if(email.matches(reg)){
			System.out.println("1");
		}else{
			System.out.println("0");
		}
	}
}
