import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class J16 {
	public static void main(String[] args) {
		System.out.println("��ʽ��8(����ƻ������0~10����0��10) 3(�������Ӹ���1~10����1��10)");
		System.out.println("�밴�ո�ʽ���룺");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String str="";
		try {
			str=buffer.readLine();
		} catch (IOException e) {
			System.out.println("�����ʽ����");
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
			System.out.println("��������");
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
	//�����ٵ����ӷ���һ��������ÿ����������һ����n���������ȷ���n����ʣ�µ�m-n����������  
	//�����ٵ�����û�зţ�����ʣ�µ�n-1�����ӻ�������m��
}
