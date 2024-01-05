package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;

import static com.codeborne.selenide.Selenide.*;
public class CareerPage {
    private SelenideElement cTitle = $("[class='dop_h2']"),
            vacancy = $("a[href*='https://hh.ru/vacancy/89475451?utm_medium=widgetemployer&utm_campaign=hh.ru_vacancy&utm_source=sibintek.ru&utm_term=%2Fcompany%2Fvacancies%2F']");


    public CareerPage openPage() {
        open("https://sibintek.ru/company/vacancies/");
    return this;
    }


        public CareerPage searchTitle() {
        cTitle.shouldHave(text("Карьера"));
        return this;
    }
    public CareerPage  headVacancy() {
        vacancy.shouldHave((text("Бизнес-аналитик (стажер)")));
        return  this;
    }

}