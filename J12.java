import java.util.Scanner;


public class J12 {
	public static void main(String[] args) {
		System.out.println("格式：2,3,4,5,6,......(不得超过五十个)");
		System.out.println("请按格式输入一个整数数组的元素：");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String[] sarr=str.split(",");
		short[] iarr= new short[sarr.length];
		int count=0;
		for(int i=0;i<sarr.length;i++){
			iarr[i]=(short)Integer.parseInt(sarr[i]);
			if(iarr[i]%3==0) count++;
		}
		System.out.println(count);
	}
}
