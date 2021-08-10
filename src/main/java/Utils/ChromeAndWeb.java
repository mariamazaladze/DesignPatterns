package Utils;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByText;
import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Configuration.startMaximized;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class ChromeAndWeb {
   // @BeforeMethod
//    @Test

    public void openchrome() throws InterruptedException {
        startMaximized = true;
        open("https://demoqa.com/");
//        $(new ByText("Forms")).click();
//        $(new ByText("Practice Form")).click();
//        Thread.sleep(10000);
//
//        $("#gender-radio-2").click();
//        Thread.sleep(15000);


    }


}
