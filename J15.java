import java.util.Scanner;


public class J15 {
	public static void main(String[] args) {
		System.out.println("������һ���ַ�����");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		/*StringBuffer sb =new StringBuffer(str);
		sb.reverse();
		System.out.println(sb);����һ*/
		char[] cc= str.toCharArray();
		char[] sc = new char[cc.length];
		for(int i=0;i<cc.length;i++){
			sc[sc.length-1-i]=cc[i];
		}
		String sstr= new String(sc);
		System.out.println(sstr);
	}
}
