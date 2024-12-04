package conftest;



import java.util.concurrent.TimeUnit;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import locators.LoginPOM;
import locators.MCQLocators;

public class confi {

    public WebDriver driver;
    public WebDriverWait wait;
    public LoginPOM logtest; // Declare logtest as a field
    public MCQLocators response; //Declare response as a field
    
    public void openBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vgqa.glint.cloud.dev.microsoft/session/auth");
        //Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        logtest = new LoginPOM(driver); // Initialize logtest here
        response = new MCQLocators(driver); //Initialize response here
        
    }

    public void LoginCredentials() throws InterruptedException {
        logtest.enterEmailId("qatester@glintinc.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        logtest.clickContinueButton();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        logtest.enterClientId("qa20190329");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        logtest.clicksubmitButton();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        logtest.enterPassword("Dem0@pass2");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        logtest.clickpasssubmitButton();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        logtest.clickreportsbutton();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    
        //driver.quit();
    }

    

    public void changingprogram_operation() throws  InterruptedException
    {
    
        response.Click_Program_Change();

    }


    public void MCQ_Operation() throws  InterruptedException
     {
        response.Click_MCQbutton();
        
    }

    public void settingsbutton_Operation() throws InterruptedException
    {
        response.Click_settingsbutton();
    }

    public void More_dropdown_Operation() throws InterruptedException
    {
        response.More_dropdown();
    }

    public void Add_Section_Operation() throws InterruptedException
    {
        response.Add_Section();
    }

    public void search_comments_Operation() throws InterruptedException
    {
        response.search_comments();
    }

    public void Manger_hierarchy_dropdown_Operation() throws InterruptedException
    {
        response.Manger_hierarchy_dropdown();
    }

    public void Select_attribute22_Operation() throws InterruptedException
    {
        response.Select_attribute22();
    }
    

}

