import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class J29 {
	public static void main(String[] args) {
		System.out.println("«Î ‰»Î£∫");
		BufferedReader buffer =new BufferedReader(new InputStreamReader(System.in));
		String str="";
		try {
			str =buffer.readLine();
		} catch (IOException e) {
			System.out.println(" ‰»Î¥ÌŒÛ£°");
			return;
		}
		String str1=str.trim();
		boolean flag=false;
		if(str1.charAt(0)!='(') {
			System.out.println(flag);
			return;
		}
		int count1=0;
		int count2=0;
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)=='('){
				count1++;
			}
			if(str1.charAt(i)==')'){
				count2++;
			}
		}
		System.out.println(count1==count2);
	}
}
