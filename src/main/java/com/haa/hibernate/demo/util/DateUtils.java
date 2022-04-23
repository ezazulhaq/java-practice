package com.haa.hibernate.demo.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    // The date formatter
    // - dd: day in month (number)
    // - MM: month in year (number)
    // - yyyy: year
    //
    // See this link for details:
    // https://docs.oracle.com/javase/tutorial/i18n/format/simpleDateFormat.html
    //
    //

    // read a date string and parse/convert to a date
    public static Date parseDate(String dateStr) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.parse(dateStr);
    }

    // read a date and format/convert to a string
    public static String formatDate(Date theDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String result = null;

        if (theDate != null) {
            result = formatter.format(theDate);
        }

        return result;
    }
}
