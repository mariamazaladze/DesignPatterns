package Steps;

import PageObject.MainPageElements;
import io.qameta.allure.Step;

public class MainPageMethods {
    MainPageElements form = new MainPageElements();


  @Step("In main page : click forms button")
    public void formClick() {
        form.formsElement.click();

    }

}
