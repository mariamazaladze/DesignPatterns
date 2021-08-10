package PageObject;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StudentRegistrationElements {

    public SelenideElement
    nameElement= $("#firstName"),
    lastNameElement=$("#lastName"),
    mobElement=$("#userNumber"),
    genderElement=$(".custom-control-label",1),

    submit=$("#submit");

}
