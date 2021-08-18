package Steps;

import PageObject.StudentRegistrationElementss;
import io.qameta.allure.Step;

public class StudentRegistrationMethods {
    StudentRegistrationElementss elements = new StudentRegistrationElementss();

    @Step("Registration set {name}")
    public StudentRegistrationMethods setName(String name) {
        elements.nameElement.sendKeys(name);
        return this;
    }

    @Step("Registration set {lastname}")
    public StudentRegistrationMethods setLastname(String lastname) {
        elements.lastNameElement.sendKeys(lastname);
        return this;
    }

    @Step("Registration set {setMob}")
    public StudentRegistrationMethods setMob(String setMob) {

        elements.mobElement.sendKeys(setMob);
        return this;
    }

    @Step("Registration setGender")
    public StudentRegistrationMethods setGender() {

        elements.genderElement.click();
        return this;
    }

    @Step("Registration scroll")
    public StudentRegistrationMethods scroll() {
        elements.submit.scrollTo();
        return this;
    }

    @Step("Registration setSubmit")
    public StudentRegistrationMethods setSubmit() {

        elements.submit.click();
        return this;
    }

}
