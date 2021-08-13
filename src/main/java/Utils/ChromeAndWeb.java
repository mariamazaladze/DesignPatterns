package Utils;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Selenide.open;

public class ChromeAndWeb {

    @Step("open Chrome and link")
    public void openchrome() {
        startMaximized = true;
        open("https://demoqa.com/");


    }


}
