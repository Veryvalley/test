import java.util.Scanner;

public class J8 {
	public static String change(String binary){
		StringBuffer sbBinary =new StringBuffer(binary);
		sbBinary.reverse();
		return sbBinary.toString();
	}
	public static void main(String[] args) {
		System.out.println("请输入一个0~255之间的整数");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String temp ="00000000"+Integer.toBinaryString(num);
		String binary = temp.substring(temp.length()-8);
		String cbinary=change(binary);
		int cnum=Integer.parseInt(cbinary, 2);
		System.out.println(cnum);
	}
}
