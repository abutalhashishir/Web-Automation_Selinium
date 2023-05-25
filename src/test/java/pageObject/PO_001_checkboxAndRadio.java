package pageObject;

import org.bouncycastle.LICENSE;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PO_001_checkboxAndRadio {
	
	WebDriver driver=null;
	
	public PO_001_checkboxAndRadio(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	By londonRadioButton=By.xpath("//body/div[1]/fieldset[1]/label[1]");
	
	By fiveStarCheckbox=By.xpath("//body[1]/div[1]/fieldset[2]/label[4]/span[1]");
	
	public void clickRadioButton() {
		
		driver.findElement(londonRadioButton).click();
		
	}
	
	public void clickFiveStar() {
		
		driver.findElement(fiveStarCheckbox).click();
		
	}

}
