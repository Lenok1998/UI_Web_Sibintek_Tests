package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;

import static com.codeborne.selenide.Selenide.*;
public class CareerPage {
    private SelenideElement cTitle = $("[class='dop_h2']");


    public CareerPage openPage() {
        open("/company/vacancies/");
    return this;
    }


        public CareerPage searchTitle() {
        cTitle.shouldHave(text("Карьера"));
        return this;
    }


}