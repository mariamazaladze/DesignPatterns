package PageObject;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;

import static com.codeborne.selenide.Selenide.$;

public class LeftPannelElementss {
    public SelenideElement
            practiceForm = $(new ByText("Practice Form"));
}
