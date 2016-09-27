import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;


public class J22 {
	public static void main(String[] args) {
		System.out.println("格式：6（表示字符串长度） aabcde(具体字符串)");
		System.out.println("请按指定格式输入：");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String str ="";
		try {
			str=buffer.readLine();
		} catch (IOException e) {
			System.out.println("输入格式错误");
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
