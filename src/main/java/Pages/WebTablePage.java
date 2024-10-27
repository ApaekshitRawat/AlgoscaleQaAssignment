package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebTablePage extends AbstractMethods {
	
	WebDriver driver;
	
	public WebTablePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//tbody/tr/td[2]/a[text()=\"English\"]/parent::td/following-sibling::td[3]")
	WebElement articlWebElement;
	

	public void goToArticles() {
		driver.get("https://meta.wikimedia.org/wiki/List_of_Wikipedias/Table#1_000_000+_articles");
		
	}






	public int totalArticlesByLang(String[] lang) {
		int sumOfArticles = 0;
		for(String str : lang) {
			
			String xpath = String.format("//tbody/tr/td[2]/a[text()='%s']/parent::td/following-sibling::td[3]", str);
			WebElement articles = driver.findElement(By.xpath(xpath));
			System.out.println(str + Integer.parseInt(articles.getText().replace(",","")));
			sumOfArticles = sumOfArticles + Integer.parseInt(articles.getText().replace(",",""));
		}
		return sumOfArticles;
		
	}

}
