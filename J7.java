import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class J7 {
	public static int getNumWeek(String week){
		String[] weeks={" ","星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		int weekNum=0;
		for(int i=0;i<weeks.length;i++){
			if(week.equals(weeks[i]))
				weekNum=i;
		}
		return weekNum;
	}
	public static void main(String[] args) {
		System.out.println("例如2000年1月1日：2000 1 1");
		System.out.println("请按照指定格式输入您所查询的日期：");
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String str;
		try {
			str=buffer.readLine();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		String[] strs = str.split(" ");
		if (strs.length!=3) {
			System.out.println("输入日期格式有误！！");
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
			System.out.println("日期格式有误！");
		}
		
	}
}
