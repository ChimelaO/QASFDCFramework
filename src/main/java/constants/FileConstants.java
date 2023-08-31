package constants;

import utils.CommonUtils;

public class FileConstants {
	public static final String LOGIN_TESTDATA_FILE_PATH = System.getProperty("user.dir") + "/src/main/resources/testdata/loginTestData.xlsx";
	public static final String LOGIN_TESTDATA_FILE_PATH2 = System.getProperty("user.dir") + "/src/main/resources/testdata/loginTestData.properties";
	public static final String USER_MENU_TESTDATA_FILE_PATH = System.getProperty("user.dir") + "/src/main/resources/testdata/userMenuTestData.properties";
	public static final String PROFILE_PHOTO_FILE_PATH =  System.getProperty("user.dir") + "/src/main/resources/testdata/Photo.png";
	public static final String REPORT_PATH =  System.getProperty("user.dir") + "/src/main/resources/reports/" +CommonUtils.getStringDateAntTimeStamp()+ "SFDC.html";
	public static final String SCREENSHOTS_PATH =  System.getProperty("user.dir") + "/src/main/resources/reports/" +CommonUtils.getStringDateAntTimeStamp()+ "SFDC.PNG";

}


