package tests;

import com.codeborne.selenide.*;
import io.qameta.allure.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static com.codeborne.selenide.Selenide.*;

public class NewsFilterTest extends TestBase {

    @Test
    @Step
    void newsFilterTest() {

        Configuration.timeout = 12000;

        open("press-center/news/");

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
