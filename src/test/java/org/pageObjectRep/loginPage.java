package org.pageObjectRep;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;


public class loginPage extends basePage{

    By image = By.xpath("//img[@alt='SMS']");
     By userName = By.xpath("//input[@placeholder='Username']");
    By password = By.xpath("//input[@placeholder='Enter Password']");
    By blockedEyeBtn = By.xpath("//button[@class='btn btn-default cptxt btn-xs']");
    By signInBtn = By.xpath("//button[@class='btn btn-primary btn-block btncolor mb-20']");
    By resetPassword = By.xpath("//a[contains(text(),'Reset Password')]");
    By forgotUserId = By.xpath("//a[contains(text(),'Forgot UserID')]");
    By forgotPassword = By.xpath("//a[contains(text(),'Forgot password')]");

    // login_UI_test
    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verify_UI_User_on_loginPage() throws InterruptedException {
        String string1 = driver.getCurrentUrl();
        Assert.assertEquals(string1, "https://smsqa.chinmayablossomsva.org/SMS/login");
        Thread.sleep(3000);
    }

    public void verifyImage() {
        driver.findElement(image).isDisplayed();
    }

    public void verify_UI_userNameTxtB() {
        driver.findElement(userName).isDisplayed();
        driver.findElement(userName).isEnabled();

    }

    public void verify_UI_passwordTxtB() {
        driver.findElement(password).isDisplayed();
        driver.findElement(password).isEnabled();
    }

    public void verify_UI_blockedEyeBtn() {
        driver.findElement(blockedEyeBtn).isDisplayed();
        driver.findElement(blockedEyeBtn).isEnabled();
    }

    public void captcha_Ans_TxtB() throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='Enter Answer']")).click();
        Thread.sleep(3000);
    }
    public void alert_invalid_cred() throws InterruptedException {
//        Alert alert = driver.switchTo().alert();
//        String alert1=driver.switchTo().alert().getText();
       Thread.sleep(5000);
//        Assert.assertEquals(alert1,"User does not exists");
//        alert.accept();

        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            System.out.println(alert.getText());
            alert.accept();
            Assert.assertTrue(alert.getText().contains("User does not exists"));
        } catch (Exception e) {
            //exception handling
        }

    }
    public void alert_invalid_cred_pwd() throws InterruptedException {
//        Alert alert = driver.switchTo().alert();
//        String alert2 =driver.switchTo().alert().getText();
       Thread.sleep(5000);
//        Assert.assertEquals(alert2,"Password is Invalid. Try with correct password");
//        alert.accept();
        try {
            WebDriverWait wait = new WebDriverWait(driver,10);
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            System.out.println(alert.getText());
            alert.accept();
            Assert.assertTrue(alert.getText().contains("Password is Invalid. Try with correct password"));
        } catch (Exception e) {
            //exception handling
        }

    }

    public void verify_UI_signInBtn() {
        driver.findElement(signInBtn).isDisplayed();
        driver.findElement(signInBtn).isEnabled();
    }

    public void verify_UI_resetPassword() {
        driver.findElement(resetPassword).isDisplayed();
        driver.findElement(resetPassword).isEnabled();
    }

    public void verify_UI_forgotUserId() {
        driver.findElement(forgotUserId).isDisplayed();
        driver.findElement(forgotUserId).isEnabled();
    }

    public void verify_UI_forgotPassword() {
        driver.findElement(forgotPassword).isDisplayed();
        driver.findElement(forgotPassword).isEnabled();
    }


// login_functional_test_methods

    public void enterInvlidUserName() throws InterruptedException {
        driver.findElement(userName).clear();
        driver.findElement(userName).sendKeys("srini@ittaugments.com");
        Thread.sleep(3000);
    }

    public void enterVlidUserName() throws InterruptedException {
        driver.findElement(userName).clear();
        driver.findElement(userName).sendKeys("srini@itaugments.com");
        Thread.sleep(3000);
    }
    public void enterValidPassword() throws InterruptedException {
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys("admin123");
        Thread.sleep(5000);
    }
    public void enterInValidPassword() throws InterruptedException {
        driver.findElement(password).clear();
        driver.findElement(password).sendKeys("aadmin123");
        Thread.sleep(5000);
    }
    public void signIn_click() throws InterruptedException {
        driver.findElement(signInBtn).click();
        Thread.sleep(6000);
    }

    public void verify_navigate_stdprofile() throws InterruptedException {
        String str1 =driver.getCurrentUrl();
        Assert.assertEquals(str1,"https://smsqa.chinmayablossomsva.org/SMS/studentprofile");
        Thread.sleep(3000);
    }


}
