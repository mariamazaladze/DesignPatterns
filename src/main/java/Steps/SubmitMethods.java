package Steps;
import PageObject.SubmitElements;
import org.testng.Assert;

public class SubmitMethods {
    SubmitElements submit=new SubmitElements();

    public SubmitMethods checkTitile(){

        submit.boxTitle.getText();
        System.out.println( submit.boxTitle.getText());
        Assert.assertEquals(submit.boxTitle.getText(),"Thanks for submitting the form");
        return this;
    }
//    public SubmitMethods checkValues( ){
//        submit.boxName.getText();
//        System.out.println(submit.boxName.getText());
//        Assert.assertEquals(submit.boxName.getText(),"mariam azaladze");
//                return this;
//    }
}
