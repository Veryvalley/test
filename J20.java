import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class J20 {
	public static void main(String[] args) {
		System.out.println("��ʽ��33 5");
		System.out.println("�밴�ո�ʽ��������������");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String str="";
		try {
			str=buffer.readLine();
		} catch (IOException e) {
			System.out.println("��������");
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
			System.out.println("��������");
			return;
		}
		int bs = func(nums[0],nums[1]);
		System.out.println("��С������Ϊ��"+bs);
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
