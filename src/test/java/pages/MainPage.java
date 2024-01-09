package pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class MainPage {

    private final SelenideElement title = $("[class= 'label label__large__center underline__gray__1px']");
    private final SelenideElement contacts = $("[id= 'top_tel']");


    public MainPage openPage() {
        open("");
        return this;
    }
    public MainPage searchTitle() {
        title.shouldHave(text("Бизнес-направления деятельности"));
        return this;
    }
    public MainPage searchContacts() {
        contacts.shouldHave(text("+7 (495) 755-52-73 info@sibintek.ru"));
        return this;
    }


    }


