package Steps;

import PageObject.LeftPannelElementss;
import io.qameta.allure.Step;


public class LeftPannelMethods extends LeftPannelElementss {

    LeftPannelElementss leftMeniu = new LeftPannelElementss();

    @Step("Left panel : click practiceform button")
    public void LeftPannelClick() {
        leftMeniu.practiceForm.click();
    }

}
