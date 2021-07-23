package webtests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static com.codeborne.selenide.Selenide.*;

public class SelenideBasicTest {

    @Test
    public void openRambler() {
        open("https://www.rambler.ru");
        $x("//*[text()='Вход']").shouldBe(Condition.enabled).click();
        switchTo().frame($x("//div[@data-id-frame]/iframe"));
        $("#login").shouldBe(Condition.visible, Duration.of(1, ChronoUnit.MINUTES));
    }
}
