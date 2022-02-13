package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelMyCampHotelList {


   public HotelMyCampHotelList() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    //              USER STORY 4 VE 5         //
    //              HOTEL LIST               //



    @FindBy(xpath = "(//a[@href='/admin/HotelAdmin'])[1]")
    public WebElement hotelListButtonElementi;


    @FindBy(xpath = "//span[text()='Add Hotel ']")
    public WebElement addHotelButtonElementi;


    @FindBy(xpath = "//input[@id='Code']")
    public WebElement addHotelCodeBoxElementi;


    @FindBy(xpath = "//input[@id='Name']")
    public WebElement addHotelNameBoxElementi;


    @FindBy(xpath = "//input[@id='Address']")
    public WebElement addHotelAdsressBoxElementi;


    @FindBy(xpath = "//input[@id='Phone']")
    public WebElement addHotelPhoneBoxElementi;


    @FindBy(xpath = "//input[@id='Email']")
    public WebElement addHotelEmailBoxElementi;


    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement addHotelIDGroupDropDownElementi;


    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement addHotelSaveButtonElementi;


    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement addHotelAlertMesajiElementi;


    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement addHotelAlertOkButtonElementi;


    @FindBy(xpath = "//button[text()='Search']")
    public WebElement addHotelSearchButtonElementi;


    @FindBy(xpath = "//input[@name='Code']")
    public WebElement addHotelCodeSearchBoxElementi;


    @FindBy(xpath = "//a[normalize-space()='Details']")
    public WebElement addHotelIlkDetailsButtonElementi;






























}