import java.util.Scanner;


public class J6 {
	public static void main(String[] args) {
		System.out.println("请输入两个两位数整数：");
		Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		if(a>99||a<10){ 
			System.out.println("别乱来！！");
			return;
		}
		int b=scan.nextInt();
		if(b>99||b<10){ 
			System.out.println("别乱来！！");
			return;
		}
		int c;
		c=a/10+a%10*100+b/10*10+b%10*1000;
		System.out.println(c);
	}
}
