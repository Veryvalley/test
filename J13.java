import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class J13 {
	public static void main(String[] args) {
		System.out.println("��ʽ��80 90 70 88");
		System.out.println("�밴��ָ����ʽ������Ƴɼ���");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String str="";
		try {
			str=buffer.readLine();
		} catch (IOException e) {
			System.out.println("�����ʽ����");
			return;
		}
		String[] sstr = str.split(" ");
		int[] score = new int[sstr.length];
		int scount=0;
		for(int i=0;i<sstr.length;i++){
			if(!sstr[i].isEmpty())
			score[i]=Integer.parseInt(sstr[i].trim());
			if(score[i]>=0&&score[i]<=150)
			scount+=score[i];
		}
		int savg = scount/4;
		System.out.println("�ܷ�Ϊ��"+scount);
		System.out.println("ƽ����Ϊ��"+savg);
	}
}
