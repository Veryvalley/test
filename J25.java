import java.util.Scanner;


public class J25 {
	public static void main(String[] args) {
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®£º");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		StringBuffer sb = new StringBuffer(str);
		for(int i=1;i<sb.length()-2;i++){
			if(sb.charAt(i)=='*'){
				sb.replace(i, i+1,"");
			}
		}
		System.out.println(sb);
	}
}
