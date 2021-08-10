package PageObject;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SubmitElements {


    public SelenideElement
            boxTitle = $(new ByText("Thanks for submitting the form")),


    boxName= $(".table-responsive")

}
