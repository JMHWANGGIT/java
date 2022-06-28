package ch08;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * Calendar
 * Date
 * DateFormat
 * 달력과 날짜, 시간. 
 */
public class Ch08Ex01 {
	public static void main(String[] args) {
		
		//Calendar cal1 = new Calendar();//error
		Calendar cal1 = new GregorianCalendar();//현재 컴퓨터의 시간
		System.out.println(cal1.get(Calendar.YEAR));
		System.out.println(cal1.get(Calendar.MONTH)+1); //month : 0~11까지 있다.
		System.out.println(cal1.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal1.get(Calendar.DAY_OF_WEEK));//1(일) 2(월) 3(화) 4(수) 5(목) 6(금) 7(토) 
		System.out.println(cal1.get(Calendar.AM_PM)); //0은 오전, 1은 오후
		System.out.println(cal1.get(Calendar.HOUR));
		System.out.println(cal1.get(Calendar.MINUTE));
		System.out.println(cal1.get(Calendar.SECOND));
		System.out.println(cal1);
		
		
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal2); //결과는 GregorianCalendar() 과 같다
		
		Date date = new Date(); //현재 컴퓨터의 시간
		System.out.println(date); //Wed May 04 12:01:38 KST 2022 형식으로 나옴.
//		System.out.println(date.getYear());
//		System.out.println(date.getMonth());
//		System.out.println(date.getDate());
//		System.out.println(date.getDay()); //요일 : 0(일) 1(월) 2(화) 3(수) 4(목) 5(금) 6(토) 
//		System.out.println(date.getTime());//1970년 기준으로 나오는 시간.
//		System.out.println(date.getHours());
//		System.out.println(date.getMinutes());
//		System.out.println(date.getSeconds());
		
		
		DateFormat dateFom = new SimpleDateFormat("YYYY년MM월dd일 E요일 HH:mm:ss");
		System.out.println(dateFom.format(date));
		
		DateFormat dateFom2 = new SimpleDateFormat("YYYY-MM-dd");
		System.out.println(dateFom2.format(date));
		
	}//main
}//class
