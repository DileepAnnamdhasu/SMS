package org.pageObjectRep;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class studentAdmissionPage {
    public static WebDriver driver;

    //student Addmission
    By firstName_srch_tb1 = By.xpath("(//input[@class='form-control input-xs ng-pristine ng-invalid ng-touched'])[1]");
    By lastName_srch_tb2 = By.xpath("//input[@class='form-control input-xs ng-pristine ng-invalid ng-touched'])[2]");
    By phone_srch_tb3 = By.xpath("//input[@id=\"phone\"]");
    By program_srch_dd1 = By.xpath("//select[@formcontrolname=\"programId\"]");
    By class_srch_dd2 = By.xpath("//select[@formcontrolname='classGrade']");
    By acodomy_Year = By.xpath("//select[@formcontrolname='academicYrId']");
    By search_btn = By.xpath("//button[@class='btn btn-success btn-labeled btn-sm mb-0']");


    //student profile

    By firstName_sp = By.xpath("//input[@class='form-control input-xs ng-pristine ng-invalid ng-touched']");
    By middleName_sp = By.xpath("(//input[@class='form-control input-xs ng-pristine ng-invalid ng-touched'])[2]");
    By lastName_sp = By.xpath("//input[@ formcontrolname='student_LN']");
    By nickName_sp = By.xpath("//input[@ formcontrolname='nickName']");
    By dob_dd_sp = By.xpath("//input[@ formcontrolname='dob']");
    By exact_age_txtb_sp = By.xpath("//input[@id='exact_age']");
    By gender_male_rd1_sp = By.xpath("(//input[@name='gender'])[1]");
    By gender_female_rd2_sp = By.xpath("(//input[@name='gender'])[2]");
    By allergy_yes_rd3_sp = By.xpath("(//input[@name='radio-inline-left1'])[1]");
    By allergy_yes_rd4_sp = By.xpath("(//input[@name='radio-inline-left1'])[2]");
    By language_dd_sp = By.xpath("(//select [@formcontrolname='language'])[1]");
    By chooseFile_upload_sp = By.xpath("//input[@type='file']");
    By saveNext_sp = By.xpath("(//button[contains(text(),'Save & Next')])[1]");
    By cancel_sp = By.xpath("(//button[contains(text(),' Cancel')])[1]");

    public studentAdmissionPage(WebDriver driver) {
         this.driver=driver;
    }

    //search_methods
    public void enter_firstName(String fname) throws InterruptedException {
        driver.findElement(firstName_srch_tb1).sendKeys(fname);
        Thread.sleep(3000);
    }

    public void enter_lastName(String lname) throws InterruptedException {
        driver.findElement(lastName_srch_tb2).sendKeys(lname);
        Thread.sleep(3000);
    }

    public void enter_Phone_srch_tb3(String phone) throws InterruptedException {
        driver.findElement(phone_srch_tb3).sendKeys(phone);
        Thread.sleep(3000);
    }

    public void selectProgram() throws InterruptedException {
        Select prog = new Select(driver.findElement(program_srch_dd1));
        prog.selectByIndex(1);
        Thread.sleep(3000);
    }
   public void verifySearchResult()
   {
      String str2 =driver.findElement(By.xpath("(//h6)[3]")).getText();
      Assert.assertEquals(str2,"Total Active Students");
   }
    public void selectClassGrade() throws InterruptedException {
        Select cls = new Select(driver.findElement(class_srch_dd2));
        cls.selectByIndex(1);
        Thread.sleep(3000);
    }

    public void selectAcodemy() throws InterruptedException {
        Select sa = new Select(driver.findElement(acodomy_Year));
        sa.selectByIndex(1);
        Thread.sleep(3000);
    }

    // student profile methods

    public void enter_firstName_sp(String fnameSp) throws InterruptedException {
        driver.findElement(firstName_sp).sendKeys(fnameSp);
        Thread.sleep(3000);
    }

    public void enter_lastName_sp(String snameSp) throws InterruptedException {
        driver.findElement(lastName_sp).sendKeys(snameSp);
        Thread.sleep(3000);
    }

    public void enter_middleName_sp(String mname) throws InterruptedException {
        driver.findElement(middleName_sp).sendKeys(mname);
        Thread.sleep(3000);
    }

    public void enter_nickName_sp(String nName) throws InterruptedException {
        driver.findElement(nickName_sp).sendKeys(nName);
        Thread.sleep(3000);
    }

    public void select_dob(String dob) throws InterruptedException {
        driver.findElement(dob_dd_sp).sendKeys(dob);
        Thread.sleep(3000);
    }

    public void displayAge() {
        String age = driver.findElement(exact_age_txtb_sp).getText();
    }

    public void selectGender_male() throws InterruptedException {
        driver.findElement(gender_male_rd1_sp).click();
        Thread.sleep(3000);
    }

    public void selectGender_female() throws InterruptedException {
        driver.findElement(gender_female_rd2_sp).click();
        Thread.sleep(3000);
    }

    public void selectGender_yes() throws InterruptedException {
        driver.findElement(gender_male_rd1_sp).click();
        Thread.sleep(3000);
    }

    public void selectallergy_no() throws InterruptedException {
        driver.findElement(gender_female_rd2_sp).click();
        Thread.sleep(3000);
    }

    public void selectLanguage() {
        driver.findElement(language_dd_sp).click();
    }

    public void uploadFile() throws InterruptedException {
        driver.findElement(chooseFile_upload_sp).click();
        Thread.sleep(3000);
    }

    public void saveDetails() throws InterruptedException {
        driver.findElement(saveNext_sp).click();
        Thread.sleep(3000);
    }

    public void cancelDetails() throws InterruptedException {
        driver.findElement(cancel_sp).click();
        Thread.sleep(3000);
    }

    public void verifyStudentProfilePage()
    {
        String str1 =driver.getCurrentUrl();
        Assert.assertEquals(str1,"https://smsqa.chinmayablossomsva.org/SMS/studentprofile");
    }
    public void search_sp() throws InterruptedException {
        driver.findElement(search_btn).click();
        Thread.sleep(3000);
    }
}











