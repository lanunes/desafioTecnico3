package questionFour.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddPage {
    private WebDriver webbrowser;

    public AddPage(WebDriver webbrowser) {
        this.webbrowser = webbrowser;
    }
    //Preencher e Submeter o formulário de adicão /Complete and Submit the Add Form
    public AddPage enterTheComputerName (String computer){
        webbrowser.findElement(By.id("name")).sendKeys(computer);
        return this;
    }

    public AddPage enterIntroducedDate (String inntroduceddate){
        webbrowser.findElement(By.id("introduced")).sendKeys(inntroduceddate);
        return this;
    }

    public AddPage enterDiscontinuedDate (String discontinueddate){
        webbrowser.findElement(By.id("discontinued")).sendKeys(discontinueddate);
        return this;
    }

    public AddPage chooseACompany(){
        webbrowser.findElement(By.id("company")).click();
        webbrowser.findElement(By.cssSelector("option[value='3']")).click();
        return this;
    }

    public HomePage createNewComputer(){
        webbrowser.findElement(By.cssSelector("input[type='submit']")).click();

        return new HomePage(webbrowser);
    }

}
