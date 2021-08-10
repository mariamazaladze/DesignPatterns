package Steps;
import PageObject.SubmitElements;
import org.testng.Assert;

public class SubmitMethods {
    SubmitElements submit=new SubmitElements();

    public void checkTitile(){

        submit.boxTitle.getText();
        System.out.println( submit.boxTitle.getText());

        Assert.assertEquals(submit.boxTitle.getText(),"Thanks for submitting the form");


    }

}
