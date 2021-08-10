package Utils;

import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Selenide.open;

public class ChromeAndWeb {

    public void openchrome() {
        startMaximized = true;
        open("https://demoqa.com/");

    }


}
