package stepDefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.Register;
import utilities.ConfigReader;
import utilities.Driver;

public class RegisterStepDefinition {
    Register register = new Register();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    Faker faker = new Faker();
    Actions actions =new Actions(Driver.getDriver());
    @Given("kullanici {string} adresine gider")
    public void kullaniciAdresineGider(String arg0) {
        Driver.getDriver().get(ConfigReader.getProperty("strongUrl"));
    }

    @And("kullanici login e tiklar")
    public void kullaniciLoginETiklar() {
        register.login.click();

    }

    @And("kullanici registere tiklar")
    public void kullaniciRegistereTiklar() {
        register.regis.click();
    }

    @And("kullanici bilgileri doldurur")
    public void kullaniciBilgileriDoldurur() {
        register.firsName.sendKeys(faker.name().firstName(), Keys.TAB);
        actions.sendKeys(faker.name().lastName(), Keys.TAB,
                faker.phoneNumber().phoneNumber(), Keys.TAB,
                faker.address().streetAddress(), Keys.TAB,
                faker.address().zipCode(), Keys.TAB,
                faker.internet().emailAddress(), Keys.TAB).perform();

        register.password.sendKeys("RealEstate123*", Keys.TAB);
        actions.sendKeys("RealEstate123*").perform();

        register.registerButton.click();



                /*
                faker.name().lastName(), Keys.TAB,
                faker.phoneNumber().phoneNumber(), Keys.TAB,
                faker.address().streetAddress(), Keys.TAB,
                faker.address().zipCode(), Keys.TAB,
                faker.internet().emailAddress(), Keys.TAB);

                 */

    }

    @Then("kullanici register butonuna tiklar")
    public void kullaniciRegisterButonunaTiklar() {
    }

    @And("kullanici kayıt oludugunu dugrular")
    public void kullaniciKayıtOludugunuDugrular() {
    }

    @And("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int istenilenSure) {
        try {
            Thread.sleep(istenilenSure*1000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
