package tests;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import pages.AboutPage;
import pages.BusinessPage;
import pages.CareerPage;
import pages.MainPage;
import data.TestData;

@Owner("Малышева Елена")
public class SibintekTest extends TestBase {

        MainPage mainPage = new MainPage();
        BusinessPage businessPage = new BusinessPage();
        CareerPage careerPage = new CareerPage();
        AboutPage aboutPage = new AboutPage();
        TestData data = new TestData();
        @Test
    @DisplayName("Проверка открытия сайта")
        @Tag("positive")

        void testSiteOpen() {

        step("Открываем главную страницу", () -> {
           mainPage.openPage();
        });
            step("Проверяем, что на странице содержится заголовок 'Бизнес-направления деятельности'", () -> {
                mainPage.searchTitle();
            });
        }

    @Test
    @DisplayName("Проверка наличия заголовка 'Карьера'")
    @Tag("positive")
    void testTextVacantion() {

        step("Открываем страницу поиска вакансий", () -> {
            careerPage.openPage();
        });

        step("Проверяем, что на странице содержится заголовок 'Карьера'", () -> {
           careerPage.searchTitle();
        });
    }

    @Test
    @Tag("positive")

    @DisplayName("Проверка страницы 'О компании'")
    void testTextForAbout() {

        step("Открываем страницу О комании", () -> {
            aboutPage.openPage();
        });

        step("Проверяем, что на странице содержится заголовок 'О компании'", () -> {
          aboutPage.searchTitle();
        });
    }

    @Test
    @Tag("positive")

    @DisplayName("Проверка контактов в шапке сайта")
    void CheckContacs() {

        step("Открываем Главную страницу", () -> {
           mainPage.openPage();
        });

        step("Проверяем, что в шапке сайта есть контакты'", () -> {
            mainPage.searchContacts();
        });


    }

    @Test
    @Tag("positive")
    @DisplayName("Проверка перехода на главную страницу")
    void CheckBisnes() {

        step("Открываем страницу бизнес-направлений", () -> {
          businessPage.openPage();
        });

        step("Проверяем, что на странице есть нужный заголовок'", () -> {
           businessPage.searchTitle();
        });
        step("Кликаем на него", () -> {
            businessPage.titleClick();
        });
        step("Проверим переход на главную", () -> {
            mainPage.searchTitle();
        });
    }

    @Test
    @Tag("negative")
    @DisplayName("Проверка яч")
    void testVacantion() {

        step("Открываем страницу поиска вакансий", () -> {
            careerPage.openPage();
        });

        step("П≈роверяем наличие нужной вакансии'", () -> {
          careerPage.headVacancy();
        });
    }
}
