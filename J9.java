import java.util.Scanner;


public class J9 {
	static int sum;
	public static int func(int num){
		sum+=num%10;
		num=num/10;
		if(num>0){
			func(num);
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("������һ��0~255��������");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num>255||num<0){
			System.out.println("�������");
			return;
		}
		int tnum=func(num);
		System.out.println(tnum);
	}
}
