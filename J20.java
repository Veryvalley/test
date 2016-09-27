import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class J20 {
	public static void main(String[] args) {
		System.out.println("格式：33 5");
		System.out.println("请按照格式输入两个整数：");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String str="";
		try {
			str=buffer.readLine();
		} catch (IOException e) {
			System.out.println("输入有误！");
			return;
		}
		String[] nstr = str.split(" ");
		int[] nums = new int[nstr.length];
		int j=0;
		for(int i=0;i<nstr.length;i++){
			if(!nstr[i].isEmpty()){
				nums[j]=Integer.parseInt(nstr[i]);
				j++;
			}
		}
		if(nums.length<2){
			System.out.println("输入有误！");
			return;
		}
		int bs = func(nums[0],nums[1]);
		System.out.println("最小公倍数为："+bs);
	}
	public static int func(int a,int b){
		int max;
		if(a>b){
			max=a;
		}else{
			max=b;
		}
		while(true){
			if(max%a==0&&max%b==0){
				break;
			}
			max++;
		}
		return max;
	}
}
