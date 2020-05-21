package app.core.util;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

public class DateFormatter implements Formatter<Date>{
	//日期类型模板：如：yyyy-MM-dd
	private String datePattern;
	//日期格式化对象
	private SimpleDateFormat sdf;
	//构造器，通过依赖注入的日期类型创建日期格式化对象
	public DateFormatter(String datePattern){
		this.datePattern=datePattern;
		this.sdf=new SimpleDateFormat(datePattern);
	}
	//显示Formatter<T>的T类型对象
	@Override
	public String print(Date date, Locale locale) {
		return sdf.format(date);
	}	
	//解析文本字符串,返回Formatter<T>的T类型对象
	@Override
	public Date parse(String source, Locale locale) throws ParseException {
		try {
			return sdf.parse(source);
		} catch (Exception e) {
			throw new IllegalArgumentException();
		}
	}
	
}
