package college;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class CalendarTest {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		
		end.set(2023, 2, 3);
		
		long nowmil = now.getTimeInMillis();
		long endmil = end.getTimeInMillis();
		
//		(Math.abs(endmil - nowmil) / 1000);
//		(Math.abs(endmil - nowmil) / 1000 / (60*60*24));
		
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		Date da = new Date();
		
		double d = 3.14 * 10;
		d = 1234.5678;
		System.out.println(d);
		DecimalFormat ds = new DecimalFormat("###.00+; -###.00");
		DecimalFormat df = new DecimalFormat("#,###,###.00");
		String dsr = df.format(d);
		String dfr = ds.format(d);
		System.out.println(dsr);
		System.out.println(dfr);
		
		SimpleDateFormat sdf = new SimpleDateFormat(
				"yyyy년 MM월 dd일 올해로 DDD일째 HH시 mm분 ss초 E요일"
				);
		String datestr = sdf.format(cal.getTime());
		System.out.println(datestr);
		
		if(args.length < 6) return;
		int[] argsInt = new int[args.length];
		for(int i = 0; i < args.length; i++) {
			argsInt[i] = Integer.parseInt(args[i]);
		}
		
		cal.set(argsInt[0], argsInt[1], argsInt[2], argsInt[3], argsInt[4], argsInt[5]);
		System.out.println(sdf.format(cal.getTime()));
	}

}
