package Test1;

import Base.SharedData;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class TestAltex extends SharedData {

    @Test
    public void shopTest(){

        WebElement acceptCookiesElement = getDriver().findElement(By.xpath("//*[@id=\"notice-cookie-block\"]/div/button/span/span"));
        acceptCookiesElement.click();

        WebElement searchElement = getDriver().findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div/div/div[3]/div/form/div/div/input"));
        searchElement.sendKeys("Espressor Jura Ena4");
        searchElement.sendKeys(Keys.ENTER);

        getDriver().switchTo().newWindow(WindowType.TAB);
        getDriver().get("https://emag.ro");

        WebElement searchElement2 = getDriver().findElement(By.id("searchboxTrigger"));
        searchElement2.sendKeys("Espressor Jura Ena4");
        searchElement2.sendKeys(Keys.ENTER);

        getDriver().switchTo().newWindow(WindowType.TAB);
        getDriver().get("https://kfea.ro");

        WebElement searchElement3 = getDriver().findElement(By.xpath("//*[@id=\"search\"]"));
        searchElement3.sendKeys("Espressor Jura Ena4");
        searchElement3.sendKeys(Keys.ENTER);

        getDriver().close();
        List<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));
        getDriver().close();
        getDriver().switchTo().window(tabs.get(0));

        WebElement addToCart = getDriver().findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/main/div[2]/div/div[2]/div/ul[2]/li[1]/a/div[6]/button/span/span"));
        addToCart.click();

        new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Produsul a fost adaugat in cos']")));
        WebElement searchSecondElement = getDriver().findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/div/div/div[3]/div/form/div/div/input"));
        searchSecondElement.sendKeys("cafea boabe julius meinl");
        searchSecondElement.sendKeys(Keys.ENTER);

        WebElement clickOnElement = getDriver().findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/main/div[2]/div/div[2]/div/ul[2]/li[1]/a/div[1]/img"));
        clickOnElement.click();

        WebElement addToCart2 = getDriver().findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/main/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div/button/span/span"));
        addToCart2.click();

        new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/main/ul/li/div[1]/div/div[2]/div[3]/a/span/span")));
        WebElement seeCart = getDriver().findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/main/ul/li/div[1]/div/div[2]/div[3]/a/span/span"));
        seeCart.click();

        WebElement clickContinue = getDriver().findElement(By.xpath("//*[@id=\"checkout\"]/section/div[2]/div[1]/div[4]/a/span/span"));
        clickContinue.click();

        WebElement insertMail = getDriver().findElement(By.xpath("//*[@id=\"checkout\"]/div/div/div/form/input"));
        insertMail.sendKeys("radu.botareanu@ygmail.com");

        WebElement clickNextStep = getDriver().findElement(By.xpath("//*[@id=\"checkout\"]/div/div/div/form/div[2]/button/span/span"));
        clickNextStep.click();

        new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Adresa facturare']")));
        getDriver().navigate().back();

        WebElement insertMail2 = getDriver().findElement(By.xpath("//*[@id=\"checkout\"]/div/div/div/form/input"));
        insertMail2.sendKeys(Keys.CONTROL + "A");
        insertMail2.sendKeys(Keys.DELETE);
        insertMail2.sendKeys("radu.botareanu@yahoo.com");
        insertMail2.sendKeys(Keys.ENTER);

        new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"checkout\"]/div[2]/div[1]/section[1]/div[1]/h2")));
        WebElement insertName = getDriver().findElement(By.xpath("//*[@id=\"address_first_name\"]"));
        insertName.sendKeys("Radu");

        WebElement insertSurname = getDriver().findElement(By.xpath("//*[@id=\"address_last_name\"]"));
        insertSurname.sendKeys("Radu");

        WebElement insertPhoneNumber = getDriver().findElement(By.xpath("//*[@id=\"address_telephone_facturare\"]"));
        insertPhoneNumber.sendKeys("0727561931");

        WebElement insertAddress = getDriver().findElement(By.xpath("//*[@id=\"checkout\"]/div[2]/div[1]/section[1]/div[2]/form/div[6]/textarea"));
        insertAddress.sendKeys("Str. Sub Cetate, nr. 43F, et. 1, ap. 10, Floresti");

        WebElement countyElement = getDriver().findElement(By.xpath("//div[contains(@class,'placeholder')]/div[text()='Alege un judet']"));
        countyElement.click();
        WebElement countyInputElement = getDriver().findElement(By.id("react-select-4-input"));
        countyInputElement.sendKeys("Cluj", Keys.ENTER);

        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class,'placeholder')]/div[text()='Alege un oras']")));
        WebElement cityElement = getDriver().findElement(By.xpath("//div[contains(@class,'placeholder')]/div[text()='Alege un oras']"));
        cityElement.click();
        WebElement cityInputElement = getDriver().findElement(By.id("react-select-5-input"));
        cityInputElement.sendKeys("FLORESTI", Keys.ENTER);

        WebElement myCart = getDriver().findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/div[2]/div/a/span[2]"));
        myCart.click();

        WebElement seeMyCart = getDriver().findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div/div/div/div[2]/div/div/div/div/div[2]/a/span/span"));
        seeMyCart.click();

        WebElement deleteCoffeeMachine = getDriver().findElement(By.xpath("//*[@id=\"checkout\"]/section/div[1]/ul[1]/li/div/div/div[1]/ul/li/div/div[2]/div/button[2]/span[2]"));
        deleteCoffeeMachine.click();

        //getDriver().quit();

    }
}
