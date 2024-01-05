package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement title = $("[class= 'label label__large__center underline__gray__1px']");
    private final SelenideElement number = $("[a[href*='tel:+7-495-755-52-73']");
    private final SelenideElement email = $("[a[href*='mailto:info@sibintek.ru']");

    public MainPage openPage() {
        open("https://sibintek.ru/");
        return this;
    }
    public MainPage searchTitle() {
        title.shouldHave(text("Бизнес-направления деятельности"));
        return this;
    }
    public MainPage searchNumber() {
        number.shouldHave(text("+7-495-755-52-73"));
        return this;
    }

    public MainPage searchEmail() {
        email.shouldHave(text("info@sibintek.ru"));
        return this;
    }
}

