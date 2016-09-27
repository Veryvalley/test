import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class J33 {
	public static void main(String[] args) {
		System.out.println("格式：I love you");
		System.out.println("请按格式输入：");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String str ="";
		try {
			str = buffer.readLine();
		} catch (IOException e) {
			System.out.println("输入有误");
			return;
		}
		/*String[] sstr = str.split(" ");
		StringBuffer sb = new StringBuffer("");
		for(int i=sstr.length-1;i>=0;i--){
			for(int j=sstr[i].length()-1;j>=0;j--){
				if(sstr[i].charAt(j)>='a'&&sstr[i].charAt(j)<='z'){
					sb.append((char)(sstr[i].charAt(j)-32));
				}
				if(sstr[i].charAt(j)>='A'&&sstr[i].charAt(j)<='Z'){
					sb.append((char)(sstr[i].charAt(j)+32));
				}
			}
		}
		System.out.println(sb);*/
		//方法二
		StringBuffer sb = new StringBuffer("");
		for(int i=str.length()-1;i>=0;i--){
			if(str.charAt(i)!=' '){
				if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
					sb.append((char)(str.charAt(i)-32));
				}
				if(str.charAt(i)>='A'&&str.charAt(i)<='Z'){
					sb.append((char)(str.charAt(i)+32));
				}
			}
		}
		System.out.println(sb);
	}
}
