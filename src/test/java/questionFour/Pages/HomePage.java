package questionFour.Pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver webbrowser;

    public HomePage(WebDriver webbrowser){
        this.webbrowser = webbrowser;
    }

    public AddPage clickButtonAdd(){
        //Clicar no botão Add a new Computer/ Click on the Add a new Computer button
        webbrowser.findElement(By.id("add")).click();

        return new AddPage(webbrowser);
    }

    //Validar que a mensagem de sucesso foi apresentada / Validate that the success message was displayed
    public HomePage validateThatTheSuccessMessageWasDisplayed(){
        String messageAlert = webbrowser.findElement(By.cssSelector(".alert-message")).getText();
        Assertions.assertEquals("Done ! Computer Libretto has been created", messageAlert);

        return this;
    }

    //Escolhendo um computador para deletar/ Choosing a computer to delete
    public EditPage choosingAComputerToDelete(){
        webbrowser.findElement(By.linkText("ASCI Thors Hammer")).click();

        return new EditPage(webbrowser);
    }

    //Validar que a mensagem de sucesso na delecao foi apresentada / Validate that the message of success in the delectation was presented
    public HomePage validateThatTheSuccessMessageDeleteWasDisplayed() {
        String messageAlert = webbrowser.findElement(By.cssSelector(".alert-message")).getText();
        Assertions.assertEquals("Done ! Computer ASCI Thors Hammer has been deleted", messageAlert);

        return this;
    }

}
