import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class J19 {
	public static void main(String[] args) {
		System.out.println("格式：1,23,4,5,6,7...");
		System.out.println("请按格式输入一个整数数组：");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String[] sarr = str.split(",");
		System.out.println("请输入指定整数：");
		String snum =scan.next();
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<sarr.length;i++){
			if(sarr[i].contains(snum)){
				int num =Integer.parseInt(sarr[i]);
				list.add(num);
			}
		}
		Collections.sort(list);
		String str1 = list.toString();
		String out = str1.substring(1,str1.length()-1);
		System.out.println(out);
	}
}
