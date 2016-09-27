import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class J16 {
	public static void main(String[] args) {
		System.out.println("格式：8(代表苹果个数0~10包括0和10) 3(代表篮子个数1~10包括1和10)");
		System.out.println("请按照格式输入：");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String str="";
		try {
			str=buffer.readLine();
		} catch (IOException e) {
			System.out.println("输入格式不对");
			return;
		}
		String[] cstr =str.split(" ");
		int[] nums = new int[cstr.length];
		for(int i =0;i<cstr.length;i++){
			if(!cstr[i].isEmpty()){
				nums[i]=Integer.parseInt(cstr[i]);
			}
		}
		if(nums.length!=2||nums[0]<0||nums[0]>10||nums[1]<1||nums[1]>10){
			System.out.println("数据有误！");
			return;
		}
		int count =allot(nums[0],nums[1]);
		System.out.println(count);
	}
	public static int allot(int apples, int baskets){
		if (apples < 0)  
            return 0;  
        if (apples == 0 || baskets == 1)  
            return 1;  
        return allot(apples - baskets, baskets) + allot(apples, baskets - 1);  
	}
	//①最少的蓝子放了一个，这样每个蓝子至少一个，n个篮子子先放上n个，剩下的m-n个可以随便放  
	//②最少的蓝子没有放，这样剩下的n-1个盘子还是随便放m个
}
