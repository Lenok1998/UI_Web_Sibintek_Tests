package pages;


import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class BusinessPage {
    private SelenideElement bTitle = $("[class='el']");
    public BusinessPage openPage() {
        open("/business-directions/");
        return this;
    }
        public BusinessPage searchTitle() {
           bTitle.shouldHave(text("Главная"));
            return this;
    }
    public BusinessPage titleClick() {
        bTitle.click();
        return this;

    }
    }
