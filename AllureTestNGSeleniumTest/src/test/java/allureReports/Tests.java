package allureReports;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({AllureListener.class})
public class Tests extends BaseClass{

    WebDriver driver;

    @BeforeClass
    public void setup() {
        BaseClass bs = new BaseClass();
        driver = bs.initialize_driver();
        driver.get("https://demo.nopcommerce.com/");
    }

    @Test(priority = 1, description = "Verify Logo presence on Home Page")
    @Description("Verify Logo presence on Home Page")
    @Epic("EP001")
    @Feature("Feature1: Logo")
    @Story("Story: Logo Presence")
    @Step("Verify Logo presence")
    @Severity(SeverityLevel.MINOR)
    public void logoResenceTest() {
        boolean disstatus = driver.findElement(By.xpath("//div[@class='header-logo']//a//img")).isDisplayed();
        Assert.assertEquals(disstatus, true);
    }

    @Test(priority = 2)
    @Description("Verify Logo presence on Home Page")
    @Epic("EP001")
    @Feature("Feature2: Login")
    @Story("Story: Valid login")
    @Step("Verify login")
    @Severity(SeverityLevel.BLOCKER)
    public void loginTest() {
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.id("Email")).sendKeys("pavanoltraining@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Test@123");
        driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
        //Thread.sleep(3000);
        Assert.assertEquals(driver.getTitle(), "nopCommerce demo store. Login");
    }

    @Test(priority = 3)
    @Description("Verify user registration")
    @Epic("EP001")
    @Feature("Feature2: Registration")
    @Story("Story: User registration")
    @Step("User registration")
    @Severity(SeverityLevel.NORMAL)
    public void registrationTest() {
        throw new SkipException("Skipping this Test");
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}

// Allure cmd: allure serve C:\REST_project\AllureTestNGSeleniumTest\allure-results
