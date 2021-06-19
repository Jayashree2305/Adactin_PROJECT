package com.AdactinPro;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.AdactinProj.com.Logout;

public class BaseAdctn {
public static WebDriver driver;
	
	//web element methods 
	//click
	public static void clickOnElement(WebElement element) {
		element.click();
}
	//send keys
	public static void sendvalues(WebElement element,String values) {
		element.sendKeys(values);
		}
	public static void Actionsac(WebElement element, WebDriver driver) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
}
	public static void Actionsac1(WebElement element, WebDriver driver) {
		Actions ac=new Actions(driver);
		ac.click(element).build().perform();

	}
	
	public static void DropDown(WebElement element, String values) {
		Select s = new Select(element);
		s.selectByValue(values);
	}
	public static void close() {
		//WebDriver driver = new ChromeDriver();
		driver.close();
	}
	public static void getUrl(String URL) {
		//WebDriver driver = new ChromeDriver();
		driver.get(URL);
}
	
	  //------->null
	
	public static WebDriver browserLaunch(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_Task\\Driver\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		
		//else if (browser.equalsIgnoreCase("firefox")) {
			//System.setProperty("web","path");
			//WebDriver driver = new FirefoxDriver();
		//}
		else {
			System.out.println("INVALID BROWSER");
			}
		driver.manage().window().maximize();
		
		return driver;
	}
	public static void quitpage(WebDriver driver) {
		driver.quit();
	}
	public static void navigateto(String URL) {
		driver.navigate().to(URL);
	}
	public static void navigateback() {
		driver.navigate().back();
	}
	public static void navigateforward() {
		driver.navigate().forward();
		}
	public static void pagereferesh() {
		driver.navigate().refresh();
		}
	
	public static void gettitle(WebElement element) {
		String title = driver.getTitle();
		System.out.println("title" +title);
		}
	public static void getcurrentURL(WebElement element) {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl" +currentUrl);
		}
	public static void getattrivalue(WebElement element,String values) {
		String attribute = element.getAttribute("values");
		System.out.println("ATTRIBUTE VALUE:" +attribute);
		}
	public static void getattriname(WebElement element,String name) {
		String attribute = element.getAttribute("name");
		System.out.println("ATTRIBUTE NAME :" +attribute);
		}
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);

	}
	public static void isdisplay(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
		}
	public static void isenabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);
		}
	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}
	
		
	public static void getFirstselected(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
}
	
		
	
	public static void ismultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		}
	public static void scrollup(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);

	}
	public static void scrollDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
		}
	public static void singleframe(WebElement element) {
		driver.switchTo().frame(element);
		}
	public static void singleframe(int index) {
		driver.switchTo().frame(index);
	}
	public static void singleframe(String values) {
		driver.switchTo().frame(values);
		}
		
	public static void robot(WebElement element) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	public static void screenshot(String name) throws IOException {
		TakesScreenshot ts =(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\rsrga\\eclipse-workspace\\Selenium\\Screenshot\\"+name+".png");
		FileUtils.copyFile(source, destination);
		}
	public static void alert() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public static void checkbox(WebElement element) {
		element.click();
	}
	public static void windowhandles(){
		 driver.getWindowHandles();
		}
	// wait---implicitwait

		public static void implicit() {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}

		// wait---explicittwait

		public static void explicit(WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		}








