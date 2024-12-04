package testcases;

 
//import java.util.concurrent.TimeUnit;
 
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
 
import conftest.confi;
 
public class MCQ_Reports extends confi{
   
   
 
@BeforeMethod
 
public void launchBrowser() throws InterruptedException
{
    openBrowser();
    LoginCredentials();
}

@Test(description="Changing survey")
//Test Case to Click Executive Summary Report and Heatmap Report
public void TC_01() throws InterruptedException
{
	
	changingprogram_operation();
	Thread.sleep(5000);
	driver.quit();
	
} 

 
@Test
public void TC_02() throws  InterruptedException
{
    
    changingprogram_operation();
}
 
@Test
public void TC_03() throws InterruptedException
{
    
    changingprogram_operation();
    MCQ_Operation();
}
 
@Test
public void TC_04() throws InterruptedException
{
    
    changingprogram_operation();
    MCQ_Operation();
    settingsbutton_Operation();
}
 
@Test
public void TC_05() throws InterruptedException
{
    changingprogram_operation();
    MCQ_Operation();
    //settingsbutton_Operation();
    More_dropdown_Operation();
}

 
@Test
public void TC_06() throws InterruptedException
{
    changingprogram_operation();
    Thread.sleep(5000);
    MCQ_Operation();
    //settingsbutton_Operation();
    More_dropdown_Operation();
    Add_Section_Operation();
}
 
@Test
public void TC_07() throws InterruptedException
{
    changingprogram_operation();
    MCQ_Operation();
    settingsbutton_Operation();
    More_dropdown_Operation();
    Add_Section_Operation();
    search_comments_Operation();
}
 
@Test
public void TC_08() throws InterruptedException
{
    changingprogram_operation();
    MCQ_Operation();
    Manger_hierarchy_dropdown_Operation();  
}
 
 
@Test
public void TC_09() throws InterruptedException
{
    changingprogram_operation();
    MCQ_Operation();
    Manger_hierarchy_dropdown_Operation();
    Select_attribute22_Operation();
}



}
