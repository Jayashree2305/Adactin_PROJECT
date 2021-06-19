package com.adactinsite.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	
	 public Configuration_Reader() throws Throwable {
		
	
		File f=new File("C:\\Users\\Admin\\eclipse-workspace\\AdactinPro\\src\\test\\java\\com\\adactin\\helper\\Configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
		
	}
	public String get_Browser()  {
		
        String browser = p.getProperty("browser");
        return browser;
	}
	public String get_Url() {
	    String url = p.getProperty("url");
	    return url;

	}
	
	
	public String get_cvvno() {
	    String cvvno = p.getProperty("cvvno");
		return cvvno;

	}

}
