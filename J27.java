import java.util.Scanner;


public class J27 {
	public static void main(String[] args) {
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		StringBuffer sb = new StringBuffer(str);
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)>='a'&&sb.charAt(i)<='z'){
				sb.replace(i, i+1, ((char)(sb.charAt(i)-32))+"");
			}else if(sb.charAt(i)>='A'&&sb.charAt(i)<='Z'){
				sb.replace(i, i+1, ((char)(sb.charAt(i)+32))+"");
			}
		}
		System.out.println(sb);
		
	}
}
