import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class J22 {
	public static void main(String[] args) {
		System.out.println("��ʽ��6����ʾ�ַ������ȣ� aabcde(�����ַ���)");
		System.out.println("�밴ָ����ʽ���룺");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String str ="";
		try {
			str=buffer.readLine();
		} catch (IOException e) {
			System.out.println("�����ʽ����");
			return;
		}
		String[] sarr = str.split(" ");
		String[] sarr1 = new String[2];
		int j=0;
		for(int i=0;i<sarr.length;i++){
			if(!sarr[i].isEmpty()){
				sarr1[j]=sarr[i];
				j++;
			}
		}
		String string =sarr1[1];
		Set set = new HashSet();
		for(int i=0;i<string.length();i++){
			set.add(string.charAt(i));
		}
		System.out.println(set.size());
	}
}
