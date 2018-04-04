package com.xa.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareTime {

	public static boolean compare(String time1,String time2) throws ParseException{
	
				SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
				//将字符串形式的时间转化为Date类型的时间
				Date a=sdf.parse(time1);
				Date b=sdf.parse(time2);
				//Date类的一个方法，如果a早于b返回true，否则返回false
				if(a.before(b)){
					return true;
				}else{
					return false;
				}
	}
	
	public static String getDistanceTime(String str1, String str2) {  
		SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");  
        Date one;  
        Date two;  
        long day = 0;  
        long hour = 0;  
        long min = 0;  
        long sec = 0;  
        try {  
            one = df.parse(str1);  
            two = df.parse(str2);  
            long time1 = one.getTime();  
            long time2 = two.getTime();  
            long diff ;  
            if(time1<time2) {  
                diff = time2 - time1;  
            } else {  
                diff = time1 - time2;  
            }  
            day = diff / (24 * 60 * 60 * 1000);  
            hour = (diff / (60 * 60 * 1000) - day * 24);  
            min = ((diff / (60 * 1000)) - day * 24 * 60 - hour * 60);  
            sec = (diff/1000-day*24*60*60-hour*60*60-min*60);  
        } catch (ParseException e) {  
            e.printStackTrace();  
        }  
        return hour + ":" + min + ":" + sec;  
    }
}
