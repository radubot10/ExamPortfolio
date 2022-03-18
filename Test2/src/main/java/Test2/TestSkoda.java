package Test2;

import Base.SharedData;
import org.junit.Test;
import org.openqa.selenium.*;

import java.util.ArrayList;
import java.util.List;

public class TestSkoda extends SharedData {

    @Test
    public void carShopTest() {

        WebElement acceptCookiesElement = getDriver().findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]"));
        acceptCookiesElement.click();

        WebElement configuratorElement = getDriver().findElement(By.xpath("/html/body/div[3]/header/div[2]/div[2]/div/div[4]/div/div/div[1]/div[2]/span/a/span"));
        configuratorElement.click();

        List<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(1));

        WebElement modelElement = getDriver().findElement(By.xpath("//*[@id=\"nwi-root\"]/cc-cc-configurator/div/div/cc-model-overview/div[2]/div/cc-model-group-item[3]/a/cc-car-image/div/div/cc-image/img"));
        modelElement.click();

        WebElement startConfigurationElement = getDriver().findElement(By.xpath("//*[@id=\"nwi-root\"]/cc-cc-configurator/div/div/cc-reference-models/div[2]/div/div[1]/div[1]/div[4]/a/nwi-button/div[2]"));
        startConfigurationElement.click();

        WebElement selectTrim = getDriver().findElement(By.xpath("//*[@id=\"nwi-root\"]/cc-cc-configurator/div/div/cc-variant/cc-variant-select/div[2]/nwi-carousel/div/div[2]/div/div/cc-variant-card[3]/div[5]/nwi-button/div[2]"));
        selectTrim.click();

        WebElement nextStepElement = getDriver().findElement(By.xpath("//*[@id=\"nwi-root\"]/cc-cc-configurator/div/div/cc-variant/cc-variant-select/div[3]/div/nwi-button[2]/div[2]/span"));
        nextStepElement.click();

        WebElement selectEngineElement = getDriver().findElement(By.xpath("//*[@id=\"nwi-root\"]/cc-cc-configurator/div/div/cc-model-selection/cc-two-column-layout/div[2]/div[1]/div/div[2]/div[4]/cc-model-info/div[4]/nwi-button/div[2]"));
        selectEngineElement.click();

        WebElement nextStepElement2 = getDriver().findElement(By.xpath("//*[@id=\"nwi-root\"]/cc-cc-configurator/div/div/cc-model-selection/cc-two-column-layout/div[1]/div/div/div[3]/cc-short-configuration-information/div/div[2]/div[3]/nwi-button/div[2]"));
        nextStepElement2.click();

        WebElement selectColorElement = getDriver().findElement(By.xpath("//*[@id=\"nwi-root\"]/cc-cc-configurator/div/div/cc-design/cc-two-column-layout/div[2]/div[1]/div/cc-design-select/div[1]/cc-exterior-select/div[2]/div[2]/cc-exterior-select-item[1]/nwi-tooltip/div/div[1]/div/cc-design-image/cc-image/img"));
        selectColorElement.click();

        WebElement selectRimsElement = getDriver().findElement(By.xpath("//*[@id=\"nwi-root\"]/cc-cc-configurator/div/div/cc-design/cc-two-column-layout/div[2]/div[1]/div/cc-design-select/div[2]/cc-wheel-select/div[3]/div[2]/div[1]/nwi-tooltip/div/div[1]/div/cc-design-image/cc-image/img"));
        selectRimsElement.click();

        WebElement nextStepElement3 = getDriver().findElement(By.xpath("//*[@id=\"nwi-root\"]/cc-cc-configurator/div/div/cc-design/cc-two-column-layout/div[1]/div/div/div/cc-short-configuration-information/div/div[2]/div[3]/nwi-button/div[2]"));
        nextStepElement3.click();

        WebElement nextStepElement4 = getDriver().findElement(By.xpath("//*[@id=\"nwi-root\"]/cc-cc-configurator/div/div/cc-design/cc-two-column-layout/div[1]/div/div/div/cc-short-configuration-information/div/div[2]/div[3]/nwi-button/div[2]"));
        nextStepElement4.click();

        WebElement nextStepElement5 = getDriver().findElement(By.xpath("//*[@id=\"nwi-root\"]/cc-cc-configurator/div/div/cc-equipment/div/cc-two-column-layout/div[1]/div/div/nwi-button/div[2]"));
        nextStepElement5.click();

        WebElement saveConfigurationElement = getDriver().findElement(By.xpath("//*[@id=\"nwi-root\"]/cc-cc-configurator/div/div/cc-detail/div[2]/div[1]/cc-detail-highlights/div[2]/div[1]/div[2]/div/div[1]/span"));
        saveConfigurationElement.click();

        WebElement selectLongVersionElement = getDriver().findElement(By.xpath("//*[@id=\"nwi-root\"]/cc-overlay/div/div/cc-print-pdf-selection-modal/div[2]/div[2]/div[2]/div[2]"));
        selectLongVersionElement.click();


        //getDriver().close();

        //getDriver().quit();












    }

}
