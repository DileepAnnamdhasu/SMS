package org.StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.pageObjectRep.basePage;
import org.pageObjectRep.loginPage;
import org.pageObjectRep.studentAdmissionPage;


public class StepDef extends basePage {
    public static WebDriver driver = null;

    public static loginPage login;
    public static studentAdmissionPage sap;

    @Given("user is navigating to SMS login page")
    public void user_is_navigating_to_sms_login_page() throws InterruptedException {
        getChromeDriver();
        maximizeWindow();
        login = new loginPage(driver);
        sap=new studentAdmissionPage(driver);
    }

    @When("user is on login page")
    public void user_is_on_login_page() throws InterruptedException {
        login.verify_UI_User_on_loginPage();
    }

    @Then("user is able to see sms image on the top")
    public void user_is_able_to_see_sms_image_on_the_top() {
        login.verifyImage();
    }

    @And("user is able to see userName textBox")
    public void user_is_able_to_see_user_name_text_box() {
        login.verify_UI_userNameTxtB();
    }

    @And("user is able to see password textBox")
    public void user_is_able_to_see_password_text_box() {
        login.verify_UI_passwordTxtB();
    }

    @And("user is able to see blocked eye symbol")
    public void user_is_able_to_see_blocked_eye_symbol() {
        login.verify_UI_blockedEyeBtn();
    }

    @And("user is able to see sign in button")
    public void user_is_able_to_see_sign_in_button() {
        login.verify_UI_signInBtn();
    }

    @And("user is able to see Reset Password link")
    public void user_is_able_to_see_reset_password_link() {
        login.verify_UI_resetPassword();
    }

    @And("user is able to see Forgot UserID")
    public void user_is_able_to_see_forgot_user_id() {
        login.verify_UI_forgotUserId();
    }

    @And("user is able to see Forgot password")
    public void user_is_able_to_see_forgot_password() {
        login.verify_UI_forgotPassword();
    }


    // invalid userName and valid password
    @When("user is on login page1")
    public void user_is_on_login_page1() throws InterruptedException {
        login.verify_UI_User_on_loginPage();
    }

    @Then("user is able to enter userName")
    public void user_is_able_to_enter_user_name1() throws InterruptedException {
        login.enterInvlidUserName();

    }

    @And("user is able to enter password")
    public void user_is_able_to_enter_password1() throws InterruptedException {
        login.enterValidPassword();
    }

    @And("user is able to click on signIn button")
    public void user_is_able_to_click_on_sign_in_button1() throws InterruptedException {
        login.captcha_Ans_TxtB();
        login.signIn_click();
    }

    @Then("user will get validation message1")
    public void user_will_get_validation_message1() throws InterruptedException {
        login.alert_invalid_cred();
        Thread.sleep(3000);
        // driver.switchTo().alert().accept();
    }

    // valid userName and invlid password
    @When("user is on login page2")
    public void user_is_on_login_page2() throws InterruptedException {
        login.verify_UI_User_on_loginPage();
    }

    @Then("user is able to enter userName2")
    public void user_is_able_to_enter_user_name2() throws InterruptedException {
        login.enterVlidUserName();
    }

    @And("user is able to enter password2")
    public void user_is_able_to_enter_password2() throws InterruptedException {
        login.enterInValidPassword();
    }

    @And("user is able to click on signIn button2")
    public void user_is_able_to_click_on_sign_in_button2() throws InterruptedException {
        login.captcha_Ans_TxtB();
        login.signIn_click();
    }

    @Then("user will get validation message2")
    public void user_will_get_validation_message2() throws InterruptedException {
        login.alert_invalid_cred_pwd();
        Thread.sleep(3000);
    }

    //invalid userName and invalid password
    @When("user is on login page3")
    public void user_is_on_login_page3() throws InterruptedException {
        login.verify_UI_User_on_loginPage();
    }

    @Then("user is able to enter userName3")
    public void user_is_able_to_enter_user_name3() throws InterruptedException {
        login.enterInvlidUserName();
    }

    @Then("user is able to enter password3")
    public void user_is_able_to_enter_password3() throws InterruptedException {
        login.enterInValidPassword();
    }

    @Then("user is able to click on signIn button3")
    public void user_is_able_to_click_on_sign_in_button3() throws InterruptedException {
        login.captcha_Ans_TxtB();
        login.signIn_click();
    }
    @Then("user will get validation message3")
    public void user_will_get_validation_message3() throws InterruptedException {
        login.alert_invalid_cred();

    }

    //valid userName and valid password
    @When("user is on login page4")
    public void user_is_on_login_page4() throws InterruptedException {
        login.verify_UI_User_on_loginPage();
    }

    @Then("user is able to enter userName4")
    public void user_is_able_to_enter_user_name4() throws InterruptedException {
        login.enterVlidUserName();
    }

    @Then("user is able to enter password4")
    public void user_is_able_to_enter_password4() throws InterruptedException {
        login.enterValidPassword();
    }

    @Then("user is able to click on signIn button4")
    public void user_is_able_to_click_on_sign_in_button4() throws InterruptedException {
        login.captcha_Ans_TxtB();
        login.signIn_click();
    }
    @Then("user will get validation message4")
    public void user_will_get_validation_message4() throws InterruptedException {
        login.verify_navigate_stdprofile();

    }

    // student admission page

    @Given("user is navigating to student admission page")
    public void user_is_navigating_to_student_admission_page() {
        System.out.println("user is in student admission page");
    }
    @When("user is on student admission page")
    public void user_is_on_student_admission_page() throws InterruptedException {
     sap.verifyStudentProfilePage();
     Thread.sleep(8000);
     System.out.println(driver.getCurrentUrl());
    }
    @Then("user enters the text in  firstName")
    public void user_enters_the_text_in_first_name() throws InterruptedException {
     sap.enter_firstName("dileep");
    }
    @And("user enters the text in lastName")
    public void user_enters_the_text_in_last_name() throws InterruptedException {
     sap.enter_lastName("annamdhasu");
    }
    @And("user enters the text in phone")
    public void user_enters_the_text_in_phone() throws InterruptedException {
    sap.enter_Phone_srch_tb3("9000584025");
    }
    @And("user select the program from program drop down")
    public void user_select_the_program_from_program_drop_down() throws InterruptedException {
    sap.selectProgram();
    }
    @And("user select the class from class drop down")
    public void user_select_the_class_from_class_drop_down() throws InterruptedException {
     sap.selectClassGrade();
    }
    @And("user select the acodemyYear from acodemy drop down")
    public void user_select_the_acodemy_year_from_acodemy_drop_down() throws InterruptedException {
    sap.selectAcodemy();
    }
    @And("user click on search button")
    public void user_click_on_search_button() throws InterruptedException {
     sap.search_sp();
    }
    @Then("user can find the search results")
    public void user_can_find_the_search_results() {
     sap.verifySearchResult();
    }


}















