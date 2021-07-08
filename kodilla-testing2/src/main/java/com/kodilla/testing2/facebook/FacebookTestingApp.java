package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_WAITFOR = "//select[1]";
    public static final String XPATH_ACCEPT_COOKIES = "//button[text()='Akceptuj wszystkie']";
    public static final String XPATH_CREATE_NEW_ACCOUNT = "//button[text()='Utwórz nowe konto']";
    public static final String XPATH_SELECT_DAY = "//div[@class=\"_5k_5\"]/span/span/birthday_day";
    public static final String XPATH_SELECT_MONTH = "//div[@class=\"_5k_5\"]/span/span/birthday_month";
    public static final String XPATH_SELECT_YEAR = "//div[@class=\"_5k_5\"]/span/span/birthday_year";

    public static void main(String[] args) {

        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_WAITFOR)).isDisplayed()) ;

        WebElement acceptCookies = driver.findElement(By.xpath(XPATH_ACCEPT_COOKIES));
        acceptCookies.click();

        WebElement createNewAccount = driver.findElement(By.xpath(XPATH_CREATE_NEW_ACCOUNT));
        createNewAccount.click();

        WebElement selectComboDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectBoardDay = new Select(selectComboDay);
        selectBoardDay.selectByIndex(27);

        WebElement selectComboMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectBoardMonth = new Select(selectComboMonth);
        selectBoardMonth.selectByIndex(1);

        WebElement selectComboYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectBoardYear = new Select(selectComboYear);
        selectBoardYear.selectByIndex(27);

    }

}
