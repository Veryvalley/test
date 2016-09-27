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
		System.out.println("请输入一个0~255的整数：");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num>255||num<0){
			System.out.println("输入错误！");
			return;
		}
		int tnum=func(num);
		System.out.println(tnum);
	}
}
