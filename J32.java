import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class J32 {
	public static void main(String[] args) {
		System.out.println("������һ���ַ�����");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String str ="";
		try {
			str = buffer.readLine();
		} catch (IOException e) {
			System.out.println("�����ʽ���󣡣�");
			return;
		}
		StringBuffer sb =new StringBuffer("");
		for(int i=0;i<str.length();i++){
			if((str.charAt(i)>='A'&&str.charAt(i)<='Z')||str.charAt(i)==' '){
				sb.append(str.charAt(i));
			}
		}
		System.out.println(sb);
	}
}
