package org.integrallis.drools.upsell.domain;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static Date getDate(String dateString) {
        Date result = null;
		try {
			result = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
		} catch (ParseException e) {
			result = new Date();
		}
		return result;
	}
}
