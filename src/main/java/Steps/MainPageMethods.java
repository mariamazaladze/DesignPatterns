package Steps;

import PageObject.MainPageElementss;
import io.qameta.allure.Step;

public class MainPageMethods {
    MainPageElementss form = new MainPageElementss();


  @Step("In main page : click forms button")
    public void formClick() {
        form.formsElement.click();

    }

}
