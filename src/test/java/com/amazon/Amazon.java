package com.amazon;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amazon {


@Test
    public static void bring() throws InterruptedException {

    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.com");

    Thread.sleep(2000);

    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shoes", Keys.ENTER);


}



@DataProvider
   public Object[][] getData(){
    ExelUtil exelUtil = new ExelUtil("src/main/resources/Movies.xlsx","movies");
    return ((Object[][]) exelUtil.getDataArray());
}

}
