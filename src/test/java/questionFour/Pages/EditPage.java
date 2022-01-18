package questionFour.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPage {
   private WebDriver webbrowser;

   public EditPage(WebDriver webbrowser) {
            this.webbrowser = webbrowser;
   }

   //Deletando o Computador/ Deleting the computer
   public HomePage deleteAComputer(){
       webbrowser.findElement(By.cssSelector(".btn.danger")).click();

       return new HomePage(webbrowser);
   }
}
