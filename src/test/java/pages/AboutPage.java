package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
public class AboutPage {

    private SelenideElement aTitle = $("[class='dop_h2']");
    public AboutPage openPage() {
        open("/company/");
        return this;
    }

    public AboutPage searchTitle() {
      aTitle.shouldHave(text("О компании"));
       return this;
    }
}
