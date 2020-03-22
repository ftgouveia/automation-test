package selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class buyProduct {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @Before
    public void before() {
        System.setProperty("webdriver.chrome.driver", "./chromeDriver/chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.get("https://www.ze.delivery/");
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("age-gate-button-yes")));
        driver.findElement(By.id("age-gate-button-yes")).click();
    }

    @After
    public void after() {
        driver.quit();
    }

    @Test
    public void loginUser() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("welcome-button-sign-in")));
        clickById("welcome-button-sign-in");
        clickById("login-home-email-button-sign-in");
        driver.findElement(By.id("login-mail-input-email")).sendKeys("email@valido.com.br");
        driver.findElement(By.id("login-mail-input-password")).sendKeys("senhavalida");
        clickById("login-mail-button-sign-in");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("bag-pre-checkout"))).isDisplayed();

    }

    @Test
    public void buyProduct() {
        loginUser();
        driver.get("https://www.ze.delivery/product/8502/skol-269ml");
        clickById("add-amount-10");
        clickById("add-product");
        clickById("finish-order");
        clickById("checkout-card-payment-edit");
        clickById("checkout-card-payment-option-CREDIT_CARD");
        clickById("finish-order");

        // NAO FINALIZEI A COMPRA MAS AQUI ERA COLOCAR UM ASSERT COM UMA MENSAGEM DE CONFIRMACAO DO PEDIDO.

    }

    public void clickById(String id){
        driver.findElement(By.id(id)).isDisplayed();
        driver.findElement(By.id(id)).click();
    }

}
