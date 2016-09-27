import java.util.Scanner;
public class J4 {
	public static String hextoBinary(String hexstr){
		int num =Integer.parseInt(hexstr, 16);
		String str ="0000"+Integer.toBinaryString(num);
		String binary =str.substring(str.length()-16);
		return binary;
	}
	public static String reverse(String binary){
		StringBuffer str = new StringBuffer(binary);
		return  str.reverse().toString();
	}
	public static String binarytoHexstr(String fanbinary){
		int num =Integer.parseInt(fanbinary, 2);
		String fanHexstr = Integer.toHexString(num);
		return fanHexstr.toUpperCase();
	}
	public static void main(String[] args) {
		System.out.println("��ȷ��ʽ��ABCD(��Сд����)");
		System.out.println("�밴��ʾ������ȷ��ʽ��ʮ�������ִ�����");
		Scanner scan = new Scanner(System.in);
		String hexstr = scan.next();
		
		String binary = hextoBinary(hexstr);
		String fanBinary=reverse(binary);
		String fanHexstr = binarytoHexstr(fanBinary);
		System.out.println(fanHexstr);
	}
}
