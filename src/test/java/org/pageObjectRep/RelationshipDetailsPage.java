package org.pageObjectRep;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RelationshipDetailsPage extends basePage{

    By primary1_rdb = By.xpath("(//input[@name='contactprimary'])[1]");
    By primary2_rdb=By.xpath("(//input[@name='contactprimary'])[2]");
    By firstName_tb_RD = By.xpath("(//div[@class='col-lg-8']/input[@formcontrolname='firstName'])[2]");
    By lastName_tb_RD = By.xpath("(//div[@class='col-lg-8']/input[@formcontrolname='lastName'])[2]");
    By relationship_Dd_RD = By.xpath("(//div[@class='col-lg-8']/select)[5]");
    By mobile_tb_RD = By.xpath("(//input[@formcontrolname='mobilePhone'])[1]");
    By workphone_tb_RD = By.xpath("(//input[@formcontrolname='workPhone'])[1]");
    By homeNo_tb_RD = By.xpath("(//input[@id='homePhone0'])[1]");
    By emailId_tb_RD = By.xpath("(//input[@type='email'])[1]");
    By language_Dd_RD = By.xpath("(//div[@class='col-lg-8']//select[@formcontrolname='language'])[2]");
    By status_Dd_RD= By.xpath("(//div[@class='col-lg-8']//select[@formcontrolname='status'])[1]");
    By Address1_tb_RD=By.xpath("(//input[@formcontrolname='addressline1'])[1]");
    By Address2_tb_RD= By.xpath("(//input[@formcontrolname='addressline2'])[1]");
    By Counrty_Dd_RD=By.xpath("(//select[@formcontrolname='country'])[1]");
    By state_Dd_RD=By.xpath("(//select[@formcontrolname='state'])[1]");
    By city_Dd_RD=By.xpath("(//select[@formcontrolname='city'])[1]");
    By Zipcode_Dd_Rd= By.xpath("(//div[@class='col-lg-8']//input[@type='text'])[12]");
    By custody_rd_yes_Rd=By.xpath("(//input[@name='conta_1'])[1]");
    By custody_rd_no_Rd=By.xpath("(//input[@name='conta_1'])[2]");
    By contact1_Rd = By.xpath("(//a[@id='sdeee'])[1]");
    By contact2_Rd= By.xpath("(//a[@id='sdeee'])[2]");
    By include_in_FSA_Letter_Cb1_Rd=By.xpath("(//input[@formcontrolname='fsaFlag'])[1]");
    By include_in_FSA_Letter_Cb2_Rd=By.xpath("(//input[@formcontrolname='fsaFlag'])[2]");
    By Address_Same_as_Contact_1_Rd=By.xpath("(//input[@type='checkbox'])[2]");
    By firstName_tb_contact2_Rd = By.xpath("(//div[@class='col-lg-8']/input[@formcontrolname='firstName'])[3]");
    By lastName_tb_contact2_Rd = By.xpath("(//div[@class='col-lg-8']/input[@formcontrolname='lastName'])[3]");
    By relationship_Dd_Contact_RD = By.xpath("(//div[@class='col-lg-8']/select)[11]");
    By mobile_tb_contact_RD = By.xpath("(//input[@formcontrolname='mobilePhone'])[2]");
    By workphone_tb_cotact2_RD = By.xpath("(//input[@formcontrolname='workPhone'])[2]");
    By homeNo_tb_contact_RD = By.xpath("(//input[@id='homePhone0'])[2]");
    By emailId_tb_contact_RD = By.xpath("(//input[@type='email'])[2]");
    By language_Dd_contact_RD = By.xpath("(//div[@class='col-lg-8']//select[@formcontrolname='language'])[3]");









}
