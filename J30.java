import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class J30 {
	public static void main(String[] args) {
		System.out.println("格式：1,2,3,4,5,6....");
		System.out.println("请按指定格式输入至少一行数据：（输入end结束输入）");
		BufferedReader buffer =new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new ArrayList<String>();
		String str="";
		while(true){
			try {
				str=buffer.readLine();
			} catch (IOException e) {
				System.out.println("输入个数错误");
				return;
			}
			if(!str.equals("end")){
				list.add(str);
			}else{
				break;
			}
		}
		
		for(int i=0;i<list.size();i++){
			Set set = new HashSet();
			String str1 = list.get(i);
			String[] nums=str1.split(",");
			for(int j=0;j<nums.length;j++){
				set.add(Integer.parseInt(nums[j]));
			}
			String str2 =set.toString();
			String str3 =str2.substring(1,str2.length()-1);
			System.out.println(str3);
		}
	}
}
