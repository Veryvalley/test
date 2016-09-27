import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class J28 {
	public static void main(String[] args) {
		System.out.println("请输入一个字符串：");
		BufferedReader buffer =new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		try {
			str = buffer.readLine();
		} catch (IOException e) {
			System.out.println("输入有误");
			return;
		}
		StringBuffer sb = new StringBuffer(str);
		StringBuffer sbb=new StringBuffer("");
		System.out.println(sb);
		for(int i=0;i<sb.length();i++){
			if((sb.charAt(i)>='a'&&sb.charAt(i)<='z')||
					(sb.charAt(i)>='A'&&sb.charAt(i)<='Z')){
				sbb.append(sb.charAt(i));
			}
		}
		System.out.println(sbb);
	}
}
