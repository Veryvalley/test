import java.util.Scanner;


public class J1 {
	public static void test(int group, int[] rownums){
		for(int i=0;i<group;i++){
			for(int m=0;m<12;m++){
				for(int n=0;n<12;n++){
					if(n==0||n==11){
						if((m==0&&n==0)||(m==0&&n==11)||
							(m==11&&n==0)||(m==11&&n==11)){
							System.out.print("+");
						}else{
							System.out.print("|");
						}
					}else{
						if((m>10-rownums[i]/10)&&(n!=0&&n!=11&&m!=11)){
							System.out.print("+");
						}else{
							System.out.print("-");
						}
					}
				}
				System.out.println();
			}
			System.out.println("===============");
		}
	}
	public static void main(String[] args) {
		Scanner  sc= new Scanner(System.in);
		System.out.println("请输入电池个数：");
		int group = sc.nextInt();
		System.out.println("请输入每个电池的电量：");
		int[] rownums = new int[group];
		for(int i=0;i<group;i++){
			rownums[i]=sc.nextInt();
		}
		test(group,rownums);
	}
}
