package tests;


import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.*;


@DisplayName("Фильтрация новостей по ключевым словам")
@Owner("Малышева Елена")
@Story("Дипломный проект")
@Severity(SeverityLevel.NORMAL)


public class NewsFilterTest extends TestBase {

    @Test
    @Step
    void newsFilterTest() {

        Configuration.timeout = 12000;

        open("/press-center/news/");

        ElementsCollection collection = $$("p.news-item a").shouldBe(CollectionCondition.sizeGreaterThan(10));

        collection
                .asFixedIterable()
                .stream()
                .filter(e -> e.text().contains("студентов"))
                .findFirst()
                .orElseThrow()
                .click();

        $("h2.dop_h2").shouldBe(Condition.visible);

        System.out.println($("h2.dop_h2").text());

    }
}
