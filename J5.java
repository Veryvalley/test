import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class J5 {
	public static boolean contains7(int num){
		boolean flag = false;
		if(num%7==0){
			flag =true;
		}
		while(num>0){
			int seven=num%10;
			if(seven==7){
				flag=true;
				break;
			}
			num=num/10;
		}
		return flag;
	}
	public static void remove7(List<Integer> list){
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			if(contains7(it.next())){
				it.remove();
			};
		}
	}
	public static String toString(List list){
		String str = list.toString();
		String str1=str.substring(1, str.length()-1);
		return str1;
	}
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>(); 
		System.out.println("���磺1,2,3,4,5......(Ԫ�ش���0��С��10000���Ҳ��ö���100��Ԫ��)");
		System.out.println("�밴��ʽ����һ���������У�");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String[] slist =str.split(",");
		for(int i=0;i<slist.length;i++){
			list.add(Integer.parseInt(slist[i]));
		}
		remove7(list);
		String flist=toString(list);
		System.out.println(flist);
	}
}
