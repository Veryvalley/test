import java.util.Scanner;


public class J10 {
	public static void main(String[] args) {
		System.out.println("请输入一个整数：");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		StringBuffer strb=new StringBuffer(str);
		strb.reverse();
		String sstr="";
		for(int i=0;i<strb.length();i++){
			if(strb.charAt(0)=='0'){
				strb.deleteCharAt(0);
			}
			if(sstr.indexOf(strb.charAt(i))<0){
				sstr=sstr+strb.charAt(i);
			}
		}
		System.out.println(sstr);
	}
}
