package Variables;

import io.qameta.allure.Step;

public class Variabless {
    private String name = "mariam";
    private String lastname = "azaladze";
    private String mobnumber = "0123456789";

    private String name2 = "nino";
    private String lastname2 = "ninoshvili";
    private String mobnumber2 = "9876543210";

    @Step("getname")
    public String getName() {
        return this.name;
    }

    @Step("lastname")
    public String getLastname() {
        return this.lastname;
    }

    @Step("mobnumber")
    public String getMobnumber() {
        return this.mobnumber;
    }

    @Step("mobnumber2")
    public String getMobnumber2() {
        return mobnumber2;
    }

    @Step("lastname2")
    public String getLastname2() {
        return lastname2;
    }

    @Step("name2")
    public String getName2() {
        return name2;
    }

}
