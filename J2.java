import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J2 {
	public static void main(String[] args) {
		System.out.println("�����ʽ���ַ���+�ո�+�ַ�");
		System.out.println("�밴ָ����ʽ���룺");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String str;
		try {
			str=buffer.readLine();	
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		if(str==null||str.length()<1){
			System.out.println("�������");
			return;
		}
		String[] str1 = str.split(" ");
		String str2 = str1[0];
		String str3 = str1[1];
		if(str2.length()>256/2){
			System.out.println("�ַ�����������");
			return;
		}
		char cc = str3.charAt(0);
		int count=0;
		for(int i=0;i<str2.length();i++){
			if(str2.charAt(i)==cc)
				count++;
		}
		System.out.println(count);
	}
}
