package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class StudentRegistrationElementss {
    public SelenideElement
            nameElement = $("#firstName"),
            lastNameElement = $("#lastName"),
            mobElement = $("#userNumber"),
            genderElement = $(".custom-control-label", 1),
            submit = $("#submit");
}
