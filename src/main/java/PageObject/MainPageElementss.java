package PageObject;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class MainPageElementss {
    public WebDriver driver;

    public SelenideElement
            formsElement = $(new ByText("Forms"));

}
