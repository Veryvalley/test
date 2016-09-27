import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class J21 {
	public static void main(String[] args) {
		String[] str = new String[10];
		System.out.println("请输入10个数字：");
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<10;i++){
			str[i]=scan.next();
		}
		Set<String> set = new HashSet<String>();
		for(int i=0;i<10;i++){
			set.add(str[i]);
		}
		
		String[] sstr= new String[set.size()];//重点；
		set.toArray(sstr);
	
		int[] count = new int[sstr.length];
		for(int i=0;i<sstr.length;i++){
			for(int j=0;j<10;j++){
				if(sstr[i].equals(str[j])){
					count[i]++;
				}
			}
		}
	
		int[] count1 =new int[count.length];
		for(int i=0;i<count.length;i++){
			count1[i]=count[i];
		}
	
		Arrays.sort(count1);
		int flag=0;
		for(int i=0;i<count.length;i++){
			if(count[i]==count1[count.length-1]){
				if(flag!=0){
					System.out.print(",");
				}
				System.out.print(sstr[i]);
				flag++;
			}
		}
		
	}
}
