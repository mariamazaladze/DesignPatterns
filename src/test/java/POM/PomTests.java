package POM;

import Steps.LeftPannelMethods;
import Steps.MainPageMethods;
import Steps.StudentRegistrationMethods;
import Steps.SubmitMethods;
import Utils.ChromeAndWeb;
import Variables.Variables;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.codeborne.selenide.testng.ScreenShooter;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.FileDownloadMode.HTTPGET;

@Epic("fierst Pom test")
@Listeners({ ScreenShooter.class})
public class PomTests {
    ChromeAndWeb open = new ChromeAndWeb();
    MainPageMethods main = new MainPageMethods();
    LeftPannelMethods left = new LeftPannelMethods();
    StudentRegistrationMethods registration = new StudentRegistrationMethods();
    SubmitMethods afterSubmit = new SubmitMethods();
    Variables variables = new Variables();


    public static String reportsFolder;
    public void conf() {
    Configuration.screenshots = true;
    Configuration.fileDownload = HTTPGET;
    reportsFolder = "C:\\Users\\mazaladze\\Desktop\\Mariam Azaladze\\IT ACADEMY\\DesignPatterns\\build\\reports\\tests";
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
}



    @Test(groups = {"groupstest1"}, description = "Student Registration Form name1")
    @Flaky
    @Description("Student Registration Form name1")
    @Severity(SeverityLevel.BLOCKER)
    @Link(name = "allure configuration", type = "https://docs.qameta.io/allure/#_configuration")
    public void testFierst() {
        open.openchrome();
        main.formClick();
        left.LeftPannelClick();
        registration.setName(variables.getName())
                .setLastname(variables.getLastname())
                .setMob(variables.getMobnumber())
                .setGender()
                .scroll()
                .setSubmit();
        afterSubmit.checkTitile()
                .checkValues();
    }

    @Test(groups = {"groupstest2"}, description = "Student Registration Form name2")
    @Flaky
    @Story("Second pom test - it's story")
    @Description("Student Registration Form name2")
    @Severity(SeverityLevel.CRITICAL)
    @Link(name = "allure annotation", type = "https://www.seleniumeasy.com/selenium-tutorials/allure-report-example-with-annotations")
    public void testSecond() {
        open.openchrome();
        main.formClick();
        left.LeftPannelClick();
        registration.setName(variables.getName2())
                .setLastname(variables.getLastname2())
                .setMob(variables.getMobnumber2())
                .setGender()
                .scroll()
                .setSubmit();

    }

    @Test(groups = {"groupstest1"}, description = "second test in this group", priority = 100)
    @Flaky
    @Feature("Feature test")
    @Description("test for test ")
    public void testThird()  {
        System.out.println("I love test Automation");


    }
}
