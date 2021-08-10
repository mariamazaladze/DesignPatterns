package POM;

import Steps.LeftPannelMethods;
import Steps.MainPageMethods;
import Steps.StudentRegistrationMethods;
import Steps.SubmitMethods;
import Utils.ChromeAndWeb;


import org.testng.annotations.Test;

public class Run extends ChromeAndWeb {

    ChromeAndWeb open = new ChromeAndWeb();
    MainPageMethods main = new MainPageMethods();
    LeftPannelMethods left = new LeftPannelMethods();
    StudentRegistrationMethods registration = new StudentRegistrationMethods();
    SubmitMethods afterSubmit= new SubmitMethods();

    @Test
    public void m() throws InterruptedException {
        open.openchrome();

        main.formClick();
        left.LeftPannelClick();

        registration.setName("mariam")
                .setLastname("azaladze")
                .setMob("0123456789")
                .setGender()
                .scroll()
                .setSubmit();
        afterSubmit.checkTitile();
        Thread.sleep(5000);



    }


}
