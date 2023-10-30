package com.spacex.tracker.utils;

import static com.spacex.tracker.utils.Constants.FORMAT_ISO8601_STANDARD;
import static com.spacex.tracker.utils.Constants.FORMAT_OUTPUT_DATE;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateHelper {

    public static String getDateTime(String time) throws ParseException {
        Date date = convertTime(time);
        SimpleDateFormat dateFormat = new SimpleDateFormat(FORMAT_OUTPUT_DATE, Locale.getDefault());
        return dateFormat.format(date);
    }

    public static Date convertTime(String time) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(FORMAT_ISO8601_STANDARD, Locale.getDefault());
        dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return dateFormat.parse(time);
    }
}
