package Test3;

import Base.SharedData;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class TestFeedbackAzimut extends SharedData {

    @Test
    public void feedbackAzimutTest(){

        WebElement acceptCookiesElement = getDriver().findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        acceptCookiesElement.click();

        WebElement searchElement = getDriver().findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        searchElement.sendKeys("diacritice");
        searchElement.sendKeys(Keys.ENTER);

        new WebDriverWait(getDriver(), Duration.ofSeconds(60)).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"rso\"]/div[2]/div/div[1]/div/a/div")));
        WebElement goToDiacriticeRo = getDriver().findElement(By.xpath("//*[@id=\"rso\"]/div[2]/div/div[1]/div/a/div/cite"));
        goToDiacriticeRo.click();

        WebElement textBoxElement = getDriver().findElement(By.xpath("/html/body/div/div[1]/div[1]"));
        textBoxElement.sendKeys("Buna ziua, \n" +
                "\n" +
                "Numele meu este Radu Botareanu si am participat la cursul de Automation Testing, sustinut de Alex Dorha, in cadrul Azimut Vision. As dori sa va multumesc pentru oportunitate si sper ca acest curs sa imi aduca schimbarea mult dorita in cariera.\n" +
                "\n" +
                "Cu siguranta voi recomanda cursurile si altor prieteni.\n" +
                "\n" +
                "Toate cele bune,\n" +
                "Radu Botareanu\n");
        textBoxElement.sendKeys(Keys.ENTER);

        WebElement convertToDiacriticsElement = getDriver().findElement(By.xpath("/html/body/div/div[2]/div[1]/div[1]"));
        convertToDiacriticsElement.click();

        WebElement bunaElement = getDriver().findElement(By.xpath("/html/body/div/div[1]/div[1]/span[1]"));
        bunaElement.click();

        WebElement buna2Element = getDriver().findElement(By.xpath("/html/body/div/ul/li[2]"));
        buna2Element.click();

        WebElement ziuaElement = getDriver().findElement(By.xpath("/html/body/div/div[1]/div[1]/span[2]"));
        ziuaElement.click();

        WebElement ziua1Element = getDriver().findElement(By.xpath("/html/body/div/ul/li[1]"));
        ziua1Element.click();

        WebElement caElement = getDriver().findElement(By.xpath("/html/body/div/div[1]/div[1]/span[12]"));
        caElement.click();

        WebElement ca1Element = getDriver().findElement(By.xpath("/html/body/div/ul/li[2]"));
        ca1Element.click();

        WebElement doritaElement = getDriver().findElement(By.xpath("/html/body/div/div[1]/div[1]/span[16]"));
        doritaElement.click();

        WebElement dorita1Element = getDriver().findElement(By.xpath("/html/body/div/ul/li[1]"));
        dorita1Element.click();

        WebElement carieraElement = getDriver().findElement(By.xpath("/html/body/div/div[1]/div[1]/span[18]"));
        carieraElement.click();

        WebElement cariera1Element = getDriver().findElement(By.xpath("/html/body/div/ul/li[1]"));
        cariera1Element.click();

        WebElement removeHighlightsElement = getDriver().findElement(By.xpath("/html/body/div/div[2]/div[1]/div[2]"));
        removeHighlightsElement.click();

        WebElement copyTextElement = getDriver().findElement(By.xpath("/html/body/div/div[2]/div[1]/div[3]/strong"));
        copyTextElement.click();

        getDriver().switchTo().newWindow(WindowType.TAB);
        getDriver().get("https://gmail.com");

        WebElement insertMailElement = getDriver().findElement(By.xpath("//*[@id=\"identifierId\"]"));
        insertMailElement.sendKeys("radu.botareanu");
        insertMailElement.sendKeys(Keys.ENTER);

        WebElement retryInsertMailElement = getDriver().findElement(By.xpath("//*[@id=\"next\"]/div/button/span"));
        retryInsertMailElement.click();

        WebElement logInElement = getDriver().findElement(By.xpath("/html/body/header/div/div/div/a[2]"));
        logInElement.click();

        WebElement insertMailElement2 = getDriver().findElement(By.xpath("//*[@id=\"identifierId\"]"));
        insertMailElement2.sendKeys("radu.botareanu");
        insertMailElement2.sendKeys(Keys.ENTER);

        getDriver().close();
        List<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(0));

        getDriver().switchTo().newWindow(WindowType.TAB);
        getDriver().get("https://google.com");

        WebElement acceptCookiesElement2 = getDriver().findElement(By.xpath("//*[@id=\"L2AGLb\"]/div"));
        acceptCookiesElement2.click();

        WebElement searchElement2 = getDriver().findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        searchElement2.sendKeys("Azimut Vision");
        searchElement2.sendKeys(Keys.ENTER);

        WebElement writeReviewElement = getDriver().findElement(By.xpath("//*[@id=\"wrkpb\"]/span/span"));
        writeReviewElement.click();

//        int initialSize = new ArrayList<>(getDriver().getWindowHandles()).size();
//        while (initialSize !=3){
//            initialSize = new ArrayList<>(getDriver().getWindowHandles()).size();
//        }
        new WebDriverWait(getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.numberOfWindowsToBe(3));
        List<String> newWindowTabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(newWindowTabs.get(2));
        getDriver().close();

        getDriver().quit();


    }
}
