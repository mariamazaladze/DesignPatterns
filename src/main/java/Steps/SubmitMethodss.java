package Steps;

import PageObject.PopUp;
import Variables.Variabless;
import io.qameta.allure.Step;
import org.testng.Assert;

public class SubmitMethodss {
    PopUp popup = new PopUp();
    Variabless cvladi = new Variabless();

    @Step("After registration check title")
    public SubmitMethodss checkTitile() {
        popup.boxTitle.getText();
        System.out.println(popup.boxTitle.getText());
        Assert.assertEquals(popup.boxTitle.getText(), "Thanks for submitting the form");
        return this;
    }

    @Step("After resistration check name and lastname")
    public SubmitMethodss checkValues() {
        popup.studentName.getText();
        System.out.println(popup.studentName.getText());
        Assert.assertEquals(popup.studentName.getText(), cvladi.getName() + " " + cvladi.getLastname());
        return this;
    }
}
