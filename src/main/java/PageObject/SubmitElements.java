package PageObject;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class SubmitElements {
    public WebDriver driver;

    public SelenideElement
            boxTitle = $(new ByText("Thanks for submitting the form"));



    //public WebElement boxName = driver.findElement(By.xpath("//*[@class='modal-content']//tbody/tr[1]/td[2]"));

}

