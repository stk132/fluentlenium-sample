package com.stk132;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by stk132 on 14/08/19.
 */
public class SeleniumTest {

    @Test
    public void 価格comで検索する () {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://kakaku.com/");
        WebElement searchTextArea = driver.findElement(By.name("query"));
        searchTextArea.sendKeys("ipad");
        driver.findElement(By.name("search")).click();
        assertThat(driver.getTitle()).isEqualTo("ipadの通販・ネットショッピング - 価格.com");
        driver.quit();
    }
}
