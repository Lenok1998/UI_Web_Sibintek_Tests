package tests;


import com.codeborne.selenide.*;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;


@DisplayName("Фильтрация вакансии по ключевым словам")
@Owner("Малышева Елена")
@Story("Дипломный проект")
@Severity(SeverityLevel.NORMAL)

public class VacanciesTest extends TestBase {

    @Test
   @Step ("Открываем страницу с ваканмсиями")
    void vacanciesTest() throws Exception {
        open("/company/vacancies/");
        ElementsCollection collection = $$("a[class*='hh-vacancy']").shouldBe(CollectionCondition.sizeGreaterThan(10));

        List<String> testVacancyPositions = Arrays.asList(new String[]{"специалист", "стажер"});

        SelenideElement vacancyLookedFor =
                collection
                        .asFixedIterable()
                        .stream()
                        .filter(vacancyText -> testVacancyPositions.stream().anyMatch(position -> vacancyText.text().toLowerCase().contains(position)))
                        .findFirst()
                        .orElseThrow();

        String tagString = vacancyLookedFor.getTagName();
        String testString = vacancyLookedFor.getAttribute("href");
        String textString = vacancyLookedFor.getText();

        assertTrue(testString.contains("https://hh.ru/vacancy/") && testString.contains("sibintek.ru"));

    }

}
