package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;




public class NewsPage {
    private final ElementsCollection newsItems = $$("[class='news-item']");
    private final SelenideElement news1 = $("[id='bx_3218110189_7130']"),
            news2 = $("[id='bx_3218110189_7128']"),
            news3 = $("[id='bx_3218110189_7124']"),
            news4 = $("[id='bx_3218110189_7126']"),
            news5 = $("[id='bx_3218110189_7125']");
    public NewsPage openPage() {
        open("/press-center/news/");
        return this;
    }

    }
