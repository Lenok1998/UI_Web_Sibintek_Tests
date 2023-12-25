package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


public class SibintekTest extends TestBase {
    @Test
    @DisplayName("Проверка открытия сайта")
    void testSiteOpen() {

        step("Открываем страницу поиска вакансий", () -> {
            open("https://sibintek.ru/");
        });
    }

    @Test
    @DisplayName("Проверка страницы 'Вакансии'")
    void testTextVacantion() {

        step("Открываем страницу поиска вакансий", () -> {
            open("https://sibintek.ru/company/vacancies/");
        });

        step("Проверяем, что на странице содержится заголовок 'Карьера'", () -> {
            $(".dop_h2").shouldHave(text("Карьера"));
        });
    }

    @Test
    @Tag("my_test")

    @DisplayName("Проверка страницы 'О компании'")
    void testTextForAbout() {

        step("Открываем страницу О комании", () -> {
            open("https://sibintek.ru/company/");
        });

        step("Проверяем, что на странице содержится заголовок 'О компании'", () -> {
            $(".dop_h2").shouldHave(text("О компании "));
        });
    }

    @Test
    @Tag("my_test")
    @Tag("positive")
    @Owner("Малышева Елена")
    @DisplayName("Проверка контактов в шапке сайта")
    void CheckContacs() {

        step("Открываем Главную страницу", () -> {
            open("https://sibintek.ru/");
        });

        step("Проверяем, что в шапке сайта есть номер телефона'", () -> {
            $("a[href*='tel:+7-495-755-52-73']").shouldHave(text("+7 (495) 755-52-73"));
        });

        step("Проверяем, что в шапке сайта есть email'", () -> {
            $("a[href*='mailto:info@sibintek.ru']").shouldHave(text("info@sibintek.ru"));
        });
    }

    @Test
    @Tag("my_test")
    @Tag("positive")
    @Owner("Малышева Елена")
    @DisplayName("Проверка перехода на главную страницу")
    void CheckBisnes() {

        step("Открываем страницу бизнес-направлений", () -> {
            open("https://sibintek.ru/business-directions/");
        });

        step("Кликаем на ссылку главной страницы'", () -> {
            $(".el").click();
        });

    }

    @Test
    @Tag("negative")
    @Owner("Малышева Елена")
    @DisplayName("Проверка страницы 'Вакансии'")
    void testVacantion() {

        step("Открываем страницу поиска вакансий", () -> {
            open("https://sibintek.ru/company/vacancies/");
        });

        step("Проверяем, что на странице есть нужная вакансия'", () -> {
            $("a[href*='https://hh.ru/vacancy/90991373?utm_medium=widgetemployer&utm_campaign=hh.ru_vacancy&utm_source=sibintek.ru&utm_term=%2Fcompany%2Fvacancies%2F']").shouldHave(text("\n" +
                    "Middle QA Engineer"));
        });
    }
}
