import java.util.Scanner;


public class J18 {
	public static final String END ="end";
	public static final String IN ="in";
	public static final String OUT ="out";
	public static void main(String[] args) {
		int capacity =20;
		System.out.println("������⣺in ������һ�������복�⣻" +
		"�������⣺out ������һ�����뿪���⣻���������end �����������������");
		System.out.println("������ָ��:");
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
					System.out.println("�����ѿգ�");
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
				System.out.println("�������");
			}
		}
	}
}
