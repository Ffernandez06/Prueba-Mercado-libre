package prueba;

import org.junit.Before;
import java.io.IOException;
import java.util.concurrent.TimeUnit
import net.jodah.failsafe.internal.util.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class prueba {
        private WebDriver Driver;

        @Before
        public void InitDriver() throws IOException
        {
                System.out.println("Inicializando Driver");
                Driver = Capabilities();
                Driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                if(Driver != null){
                        System.out.println("Driver Creado");
                }

        public void setup (){
                System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe")
                Driver = new ChromeDriver ();
                Driver.get("https://www.mercadolibre.com.ar/");
                WebElement  buscar = Driver.findElement(By.id("cb1-edit"));
                buscar.sendKeys("Rompecabezas");
                buscar.sendKeys(Keys.ENTER);

                WebElement orden = Driver.findElement(By.xpath("//select[@class='andes-dropdown__trigger']"));
                Select selectororden = new Select(orden);
                selectororden.selectByVisibleText("Menor precio");

                String valor1 = h.getPrimerPrecio();
                double valor3 = u.getAmount(valor1);

                String valor2 = h.getSegundoPrecio();
                double valor4 = u.getAmount(valor2);

                System.out.println("1er resultado:" + valor3 "2do resultado:" + valor4);

                Assert.assertEquals(valor3, valor4)

        }
    @Test
    public void main()(

            setup();
            )


}
