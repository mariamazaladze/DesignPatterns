package Steps;

import PageObject.LeftPannelElements;
import io.qameta.allure.Step;


public class LeftPannelMethods extends LeftPannelElements {

    LeftPannelElements leftMeniu = new LeftPannelElements();

    @Step("Left panel : click practiceform button")
    public void LeftPannelClick() {
        leftMeniu.practiceForm.click();
    }

}
