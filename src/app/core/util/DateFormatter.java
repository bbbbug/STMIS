package app.core.util;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

public class DateFormatter implements Formatter<Date>{
	//��������ģ�壺�磺yyyy-MM-dd
	private String datePattern;
	//���ڸ�ʽ������
	private SimpleDateFormat sdf;
	//��������ͨ������ע����������ʹ������ڸ�ʽ������
	public DateFormatter(String datePattern){
		this.datePattern=datePattern;
		this.sdf=new SimpleDateFormat(datePattern);
	}
	//��ʾFormatter<T>��T���Ͷ���
	@Override
	public String print(Date date, Locale locale) {
		return sdf.format(date);
	}	
	//�����ı��ַ���,����Formatter<T>��T���Ͷ���
	@Override
	public Date parse(String source, Locale locale) throws ParseException {
		try {
			return sdf.parse(source);
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}
	}
	
}
