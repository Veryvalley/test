import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class J7 {
	public static int getNumWeek(String week){
		String[] weeks={" ","����һ","���ڶ�","������","������","������","������","������"};
		int weekNum=0;
		for(int i=0;i<weeks.length;i++){
			if(week.equals(weeks[i]))
				weekNum=i;
		}
		return weekNum;
	}
	public static void main(String[] args) {
		System.out.println("����2000��1��1�գ�2000 1 1");
		System.out.println("�밴��ָ����ʽ����������ѯ�����ڣ�");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String str;
		try {
			str=buffer.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		String[] strs = str.split(" ");
		if (strs.length!=3) {
			System.out.println("�������ڸ�ʽ���󣡣�");
			return ;
		}
		int year =Integer.parseInt(strs[0]);
		int month = Integer.parseInt(strs[1]);
		int day = Integer.parseInt(strs[2]);

		String sdate = year+"-"+month+"-"+day;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			Date date=sdf.parse(sdate);
			sdf =new SimpleDateFormat("EEEE");
			String week =sdf.format(date);
			int weekNum=getNumWeek(week);
			System.out.println(weekNum);
		} catch (ParseException e) {
			System.out.println("���ڸ�ʽ����");
		}
		
	}
}
