import java.util.Scanner;


public class J18 {
	public static final String END ="end";
	public static final String IN ="in";
	public static final String OUT ="out";
	public static void main(String[] args) {
		int capacity =20;
		System.out.println("车辆入库：in 表明有一辆车进入车库；" +
		"车辆出库：out 表明有一辆车离开车库；输入结束：end 表明本次输入结束。");
		System.out.println("请输入指令:");
		String command="";
		while(true){
			Scanner scan = new Scanner(System.in);
			command= scan.next();
			if(command.equals(IN)&&capacity>0){
					capacity--;
				
			}else if(command.equals(OUT)){
				if(capacity<20){
					capacity++;
				}else{
					System.out.println("车库已空！");
				}
			}else if(command.equals(END)){
				if(capacity>0){
					System.out.println("allow");
				}
				if(capacity<1){
					System.out.println("reject");
				}
				break;
			}else{
				System.out.println("输入错误！");
			}
		}
	}
}
