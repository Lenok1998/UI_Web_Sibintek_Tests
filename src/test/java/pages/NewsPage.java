package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;



public class NewsPage {
    private CollectionCondition news = (CollectionCondition) $("[class='news-item']");
    private SelenideElement news1 =$("[id='bx_3218110189_7130']");
    private SelenideElement news2 =$("[id='bx_3218110189_7128']");
    private SelenideElement news3 =$("[id='bx_3218110189_7124']");
    private SelenideElement news4 =$("[id='bx_3218110189_7126']");
    private SelenideElement news5 =$("[id='bx_3218110189_7125']");

    public NewsPage openPage() {
        open("/press-center/news/");
        return this;
    }

    }
