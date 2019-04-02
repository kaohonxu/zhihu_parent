package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/***
 * ʱ���ʽ��������
 * @author Ontheway
 *
 */
public class TimeFormatUtils {

	private TimeFormatUtils () {}
	
	private static TimeFormatUtils  instance;
	
	public static TimeFormatUtils  getInstance() {
		if(instance == null) {
			instance = new TimeFormatUtils ();
		}
		return instance;
	}
	public String format(Date date, String pattern) {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(date);
	}
	
	/***
	 * ʹ�� yyyy-MM-dd hh:mm:ss ��ʽ������
	 * @param date
	 * @return
	 */
	public String format(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		return format.format(date);
	}
}
