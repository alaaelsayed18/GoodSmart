//import com.github.dockerjava.api.model.Device;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//import org.openqa.selenium.chrome.ChromeDriver;
import java.net.MalformedURLException;
import java.net.URL;

public class signup {
    AppiumDriver driver;

    @BeforeTest
    public void before() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 7 Pro API 27");
        caps.setCapability("platformName", "Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability("ignoreHiddenApiPolicyError", true);
        AndroidDriver driver = new AndroidDriver(new URL(" https://127.0.0.1:4723/wd/hub"), caps);
        caps.setCapability("app", System.getProperty("user.dir") + "/Apps/goodsmart(3).apk");
    }

    @Test
    public void valid_signup() {

        driver.findElement(By.id("hussein.apps.talabaty:id/container")).click();
        driver.findElement(By.id("hussein.apps.talabaty:id/compoundEditText")).click();
        driver.findElement(By.id("hussein.apps.talabaty:id/firstNameEditText")).sendKeys("test");
        driver.findElement(By.id("hussein.apps.talabaty:id/lastNameEditText")).sendKeys("demo");
        driver.findElement(By.id("hussein.apps.talabaty:id/phoneEditText")).sendKeys("01208864948");
        driver.findElement(By.id("hussein.apps.talabaty:id/emailEditText")).sendKeys("test@test20.com");
        driver.findElement(By.id("hussein.apps.talabaty:id/passwordEditText")).sendKeys("test1234");
        driver.findElement(By.id("hussein.apps.talabaty:id/areaEditText")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.TextView[1]")).click();
        driver.findElement(By.id("hussein.apps.talabaty:id/textinput_placeholder")).sendKeys("compound1");
        driver.findElement(By.id("hussein.apps.talabaty:id/edPromoReferralCode")).sendKeys("202023");
        driver.findElement(By.id("hussein.apps.talabaty:id/registerButton")).click();
    }

    @Test
    public void invalid_signup() {
        driver.findElement(By.id("hussein.apps.talabaty:id/container")).click();
        driver.findElement(By.id("hussein.apps.talabaty:id/compoundEditText")).click();
        driver.findElement(By.id("hussein.apps.talabaty:id/firstNameEditText")).sendKeys("test2");
        driver.findElement(By.id("hussein.apps.talabaty:id/lastNameEditText")).sendKeys("demo2");
        driver.findElement(By.id("hussein.apps.talabaty:id/phoneEditText")).sendKeys("01286464948555552225");
        driver.findElement(By.id("hussein.apps.talabaty:id/emailEditText")).sendKeys("a@gmail.com");
        driver.findElement(By.id("hussein.apps.talabaty:id/passwordEditText")).sendKeys("test1234");
        driver.findElement(By.id("hussein.apps.talabaty:id/areaEditText")).click();
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.TextView[1]")).click();
        driver.findElement(By.id("hussein.apps.talabaty:id/textinput_placeholder")).sendKeys("compound1");
        driver.findElement(By.id("hussein.apps.talabaty:id/edPromoReferralCode")).sendKeys("202023");
        driver.findElement(By.id("hussein.apps.talabaty:id/registerButton")).click();

    }
@AfterTest
    public void TearDown() {

        if (driver != null) {
            driver.quit();
        }}
}
