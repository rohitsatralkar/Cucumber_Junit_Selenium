package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalInfo {
	
	
	@FindBy(xpath="//span/input[@value='male']/../span")
	WebElement salutation;
	
	@FindBy(xpath="//input[@name='firstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@name='birthdate']")
	WebElement birthdate;
	
	@FindBy(xpath="//input[@name='street']")
	WebElement street;
	
	@FindBy(xpath="//input[@name='houseNumber']")
	WebElement houseNumber;
	
	@FindBy(xpath="//input[@name='zipcode']")
	WebElement zipcode;
	
	@FindBy(xpath="//input[@name='city']")
	WebElement city;
	
	@FindBy(xpath="//input[@name='phoneNumber']")
	WebElement phoneNumber;
	
	@FindBy(xpath="//*[@type='submit']")
	WebElement submit;
	
	@FindBy(xpath="//*[contains(@class,'iban') and @type='text']")
	WebElement bankAcc;
	
	
	@FindBy(xpath="//div[contains(@class,'custom-checkbox')]/label")
	WebElement ibanCheck;
	
	
	@FindBy(xpath="//button[contains(@class,'btn btn-primary')]")
	WebElement orderTariff;
	
	@FindBy(xpath="//label[contains(@class,'custom-checkbox')]")
	WebElement checkBoxOnConfirmPage;

	@FindBy(xpath="//*[@id='ember268']/section/div/dl[1]/dd/a")
	WebElement overViewPage;
	
	@FindBy(xpath="//div[contains(@class,'custom-radio iban')]")
	WebElement scroll;
	
	public PersonalInfo(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public WebElement onPersonalInfoPage()
	{
		return firstName;
	}
	
	public void fillInDetails(String firstname, String lastname, String DOB, String road, String houseNr, String PLZ, String place, String num)
	{
		salutation.click();
		firstName.sendKeys(firstname);
		lastName.sendKeys(lastname);
		birthdate.sendKeys(DOB);
		street.sendKeys(road);
		houseNumber.sendKeys(houseNr);
		zipcode.sendKeys(PLZ);
		city.sendKeys(place);
		phoneNumber.sendKeys(num);
		submit.click();
	}
	
	
	public void fillBankDetails(String details)
	{
		
		bankAcc.sendKeys(details);
		ibanCheck.click();
		orderTariff.click();
	}

	public void confirmAll()
	{
		checkBoxOnConfirmPage.click();
		orderTariff.click();
	}
	
	public WebElement rdoBtn()
	{
		return scroll;
	}
	
	public WebElement overviewPage()
	{
		return overViewPage;
	}
	
	public WebElement accField()
	{
		return bankAcc;
	}
	
	
	public WebElement overviewScroll()
	{
		return checkBoxOnConfirmPage;
	}
	
}
