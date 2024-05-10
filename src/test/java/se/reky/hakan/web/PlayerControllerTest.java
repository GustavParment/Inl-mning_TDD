package se.reky.hakan.web;


import org.junit.jupiter.api.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@Disabled
class PlayerControllerTest {
    private WebDriver driver;
    private WebDriverWait wait;


    @BeforeEach
    void setUpBeforeClass() throws Exception {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    }
    @AfterEach
    void tearDownAfterClass() throws Exception {
        if (driver != null){
            driver.quit();
        }

    }

    @DisplayName("Testing if right amount of players in the list")
    @Test
    void test_Right_Amount_Of_Players_In_List() {
        driver.get("http://localhost:8080/players");
        List<WebElement> playerElements = driver.findElements(By.tagName("li"));
        int expectedNumberOfPlayers = 3;
        assertEquals(expectedNumberOfPlayers, playerElements.size());
    }

    @DisplayName("Testing if the first player name is displayed")
    @Test
    void test_First_Player_Name_Is_Displayed(){
        driver.get("http://localhost:8080/players");

        WebElement firstPlayerNameElement  = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.className("player-name")));
        assertTrue(firstPlayerNameElement.isDisplayed());
    }

    @DisplayName("Testing if title is matching")
    @Test
    void test_Page_Title () {
        driver.get("http://localhost:8080/players");
        assertEquals("Players List", driver.getTitle());
    }

    @DisplayName("Testing text on login button")
    @Test
    void test_Login_Button_Text () {
        driver.get("http://localhost:8080/players");
        WebElement loginButton = driver.findElement(By.tagName("button"));
        assertEquals("Logga in" , loginButton.getText());

    }

    @DisplayName("Testing finding player by ID")
    @Test
    void test_Finding_Player_By_ID () {
        driver.get("http://localhost:8080/players");
        WebElement firstPlayer = driver.findElement(By.cssSelector("ul li a"));
        firstPlayer.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("player-name")));

        WebElement playerNameElement = driver.findElement(By.className("player-name"));
        assertTrue(playerNameElement.isDisplayed());


    }



}