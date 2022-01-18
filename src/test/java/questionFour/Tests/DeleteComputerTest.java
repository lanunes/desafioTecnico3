package questionFour.Tests;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import questionFour.Pages.HomePage;

//Testes web da exclusao de um computador //Web testing of a delete computer
@DisplayName("Web testing of a delete computer")
public class DeleteComputerTest {
    private WebDriver webbrowser;

    @BeforeEach
    public void beforeEach(){
        //Abrir o Navegador/open the browser
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver96\\chromedriver.exe");
        this.webbrowser = new ChromeDriver();

        //Maximizando a tela/Maximizing the screen
        this.webbrowser.manage().window().maximize();

        //Abrir a pagina Computers DataBase/ Open the Computers DataBase page
        this.webbrowser.get("https://computer-database.gatling.io/computers");
    }
    @Test
    public void testDeleteComputer(){

        new HomePage(webbrowser)
                .choosingAComputerToDelete()
                .deleteAComputer()
                .validateThatTheSuccessMessageDeleteWasDisplayed();

    }

}
