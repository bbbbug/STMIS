package app.core.util.m;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;

public class GenerateNumber {
	public static String converterToSpell(String chinese,String flag){
		String pinyin="";
		char[] chineseArray=chinese.toCharArray();
		HanyuPinyinOutputFormat defaultFormat=new HanyuPinyinOutputFormat();
		defaultFormat.setCaseType(HanyuPinyinCaseType.LOWERCASE);
		defaultFormat.setToneType(HanyuPinyinToneType.WITHOUT_TONE);
		for(int i=0;i<chinese.length();i++){
			String s=String.valueOf(chineseArray[i]);
			if(s.matches("[\\u4e00-\\u9fa5]")){
				try{
					if(flag.equals("1")){
						pinyin+=PinyinHelper.toHanyuPinyinStringArray(chineseArray[i],defaultFormat)[0].charAt(0);
					}else if(flag.equals("0")){
						pinyin+=PinyinHelper.toHanyuPinyinStringArray(chineseArray[i],defaultFormat)[0];
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}else if(s.matches("[a-z]")||s.matches("[A-Z]")||s.matches("[0-9]")){
				pinyin+=s;
			}
		}
		return pinyin.toLowerCase();
	}
	
	public static void main(String[] args) {
		System.out.println(converterToSpell("机械","0"));//首字母
		System.out.println(converterToSpell("计算机","1"));//全英文转换
	}
}
