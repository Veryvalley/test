import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class J23 {
	public static void main(String[] args) {
		System.out.println("ÊäÈëÒ»¸ö×Ö·û´®£º");
		Scanner scan = new Scanner(System.in);
		String str=scan.next();
		List list = new ArrayList();
		for(int i=0;i<str.length();i++){
			if(Character.isDigit(str.charAt(i))){
				list.add(str.charAt(i));
			}
		}
		Character[] num = new Character[list.size()];
		list.toArray(num);
		Arrays.sort(num);
		for(int i=0;i<num.length;i++){
			System.out.print(num[i]);
		}
	}
}
