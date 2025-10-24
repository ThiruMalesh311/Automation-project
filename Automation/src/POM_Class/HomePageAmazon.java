package POM_Class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageAmazon {

	@FindBy(id="nav-cart")
	private WebElement addToCart;
	
	@FindBy(xpath = "//div[text()='EN']")
	private WebElement language;
	
	@FindBy(id="nav-logo-sprites")
	private WebElement amazonLogo;
	
	@FindBy(id="twotabsearchtextbox")
	private WebElement searchbox;
	
	@FindBy(id="nav-search-submit-button")
	private WebElement searchButton;
	
	@FindBy(id="nav-link-accountList")
	private WebElement accountAndLists;
}
