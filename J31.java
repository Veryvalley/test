import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class J31 {
	public static void main(String[] args) {
		System.out.println("��ʽ��4������Ԫ�ظ����� 1 2 3 4������Ԫ�أ�");
		System.out.println("�밴ָ����ʽ���룺");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String str="";
		try {
			str=buffer.readLine();
		} catch (IOException e) {
			System.out.println("��������");
			return;
		}
		String[] nums =str.split(" ");
		String[] snum = new String[Integer.parseInt(nums[0])];
		for(int i=1;i<nums.length;i++){
			snum[i-1] =Integer.toHexString(Integer.parseInt(nums[i]));
		}
		StringBuffer sb = new StringBuffer("const unsigned char buf[] = {");
		boolean flag=false;
		for(int i=0;i<snum.length;i++){
			if(flag){
				sb.append(",");
			}
			sb.append("0x");
			String str1 ="00"+snum[i];
			sb.append(str1.substring(str1.length()-2));
			flag=true;
		}
		sb.append("}");
		System.out.println(sb);
	}
}
