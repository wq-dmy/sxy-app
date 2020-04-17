package com.sxy.ibf.common;

import java.text.SimpleDateFormat;

/**
 * Application constants.
 */
public final class IbfConstants {

    private IbfConstants() {
    }

    //Regex for acceptable logins
    public static final String LOGIN_REGEX = "^[_'.@A-Za-z0-9-]*$";

    public static final String SYSTEM_ACCOUNT = "system";
    public static final String DEFAULT_LANGUAGE = "en";

    public static final String ANONYMOUS_USER = "anonymoususer";

    public static final Integer STATUS = 1;
    public static final String REQUES__TSOURCE = "airLineShopping";
    public static final Integer ADULT_NUMBER = 1;
    public static final SimpleDateFormat YYYYMMDD = new SimpleDateFormat("yyyyMMdd");
    public static final SimpleDateFormat YYYY_MM_DD = new SimpleDateFormat("yyyy-MM-dd");



}
