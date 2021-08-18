package Utils;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.ScreenShooter;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;

public class ChromeAndWebb {

    @Step("open Chrome and link")
    public void openchrome() {
        Configuration.startMaximized = true;
        Configuration.savePageSource=false;
        Configuration.reportsFolder="src/main/resources/Reports";
        ScreenShooter.captureSuccessfulTests = true;
        Configuration.screenshots=true;
        open("https://demoqa.com/");


    }
}
