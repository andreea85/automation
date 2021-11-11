import com.sun.javafx.css.StringStore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests extends Config {
    @Test(priority = 1)
    public void titleVerification() throws InterruptedException {
        WebElement title = driver.findElement(By.xpath("//*[@id=\"header-title\"]"));
        String str=title.getText().toString();
        System.out.println(str);
        Thread.sleep(5000);
        String expectedTitle="Application Test Drive";
         Assert.assertEquals(str,expectedTitle);
        Thread.sleep(3000);

    }
    @Test(priority = 2)
   public void demo() throws InterruptedException {
        driver.findElement(By.xpath("/html/body/header/div/nav/a[1]")).click();
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,"https://phptravels.com/demo" );
        Thread.sleep(5000);



    }
}
