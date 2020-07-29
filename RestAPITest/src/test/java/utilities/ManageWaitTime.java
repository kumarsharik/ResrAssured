package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageWaitTime {
	
	public  static WebDriver idriver;
	public ManageWaitTime(WebDriver rdriver) {
		idriver=rdriver;
	}
	public static void setImplicitWait(int TimeInSeconds) {
		idriver.manage().timeouts().implicitlyWait(TimeInSeconds, TimeUnit.SECONDS);
	
	}
	private static WebDriverWait setExplicitWait(int TimeOutInSeconds, int pollingTimeInMilliSeconds) {
		WebDriverWait wait = new WebDriverWait(idriver, TimeOutInSeconds);
		wait.pollingEvery(pollingTimeInMilliSeconds, TimeUnit.MILLISECONDS);
		wait.ignoring(NoSuchElementException.class);
		wait.ignoring(ElementNotVisibleException.class);
		wait.ignoring(NoSuchFrameException.class);
		wait.ignoring(StaleElementReferenceException.class);
		return wait;
	
	}
	public static void waitForElementToBeVisible(WebElement element, int timeOutInSeconds, int pollingTimeInMilliSeconds) {
	WebDriverWait wait=setExplicitWait(timeOutInSeconds, pollingTimeInMilliSeconds);
	wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitForElementToBeClickable(WebElement element, int timeOutInSeconds, int pollingTimeInMilliSeconds) {
	WebDriverWait wait=setExplicitWait(timeOutInSeconds, pollingTimeInMilliSeconds);
	wait.until(ExpectedConditions.elementToBeClickable(element));
	
	}
	/*
	 * Many more condition check can be impleted as part of explicit wait but as
	 * part of this task i am taking care of two scenario only
	 */
	}
