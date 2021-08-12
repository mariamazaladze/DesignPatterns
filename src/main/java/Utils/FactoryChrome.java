package Utils;

import Steps.FactoryMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class FactoryChrome {



    private WebDriver driver;
    //Constructor
    public FactoryChrome(WebDriver driver) {

        this.driver = driver;
        driver.get("https://demoqa.com/");
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

}


