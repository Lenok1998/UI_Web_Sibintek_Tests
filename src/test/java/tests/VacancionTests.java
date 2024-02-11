package tests;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class VacancionTests extends TestBase {

    @Test
    void vacancionHeaderTest() {

        Configuration.timeout = 12000;

        open("/company/vacancies/");

        ElementsCollection collection = $$("[class='hh-vacancy-9fwtxr0q3t']").shouldBe(CollectionCondition.sizeGreaterThan(10));

        collection
                .asFixedIterable()
                .stream()
                .filter(e -> e.text().contains("стажер"))
                .findFirst()
                .orElseThrow()
                .click();

        $("data-qa.title").shouldBe(Condition.visible);

        System.out.println($("data-qa.title").text());

    }
}

