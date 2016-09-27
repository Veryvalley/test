import java.util.Scanner;

public class J24 {
	public static void main(String[] args) {
		System.out.println("ÇëÊäÈëÒ»¸ö×Ö·û´®£º");
		Scanner scan = new Scanner(System.in);
		String str= scan.next();
		boolean flag1=false;
		boolean flag2=true;
		if(str.charAt(0)>='A'&&str.charAt(0)<='Z') flag1=true;
		for(int i=1;i<str.length();i++){
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
				flag2=false;
			}
		}
		System.out.println(flag1&&flag2);
	}
}
