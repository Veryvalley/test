import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class J14 {
	public static void main(String[] args) {
		System.out.println("格式：888 3(第二个数字在（0~31）)");
		System.out.println("请按指定格式输入：");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String str="";
		try {
			str=buffer.readLine();
		} catch (IOException e) {
			System.out.println("输入格式有误");
		}
		String[] sstr = str.split(" ");
		int[] nums = new int[sstr.length];
		for(int i=0;i<sstr.length;i++){
			if(!sstr[i].isEmpty()){
				nums[i]=Integer.parseInt(sstr[i]);
			}
		}
		if(nums.length!=2){
			System.out.println("输入有误！");
			return;
		}else if(nums[1]<0||nums[1]>31){
			System.out.println("输入有误！");
			return;
		}
		String binary = Integer.toBinaryString(nums[0]);
		StringBuffer sbinary= new StringBuffer(binary);
		sbinary.replace(sbinary.length()-nums[1]-1, sbinary.length()-nums[1], "0");
		System.out.println(binary);
		System.out.println(sbinary);
	}
}
