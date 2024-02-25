package tests;
import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import com.codeborne.pdftest.PDF;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

@DisplayName("Загрузка и проверка PDF-файла")
@Owner("Малышева Елена")
@Story("Дипломный проект")
@Severity(SeverityLevel.NORMAL)
public class PoliticTest extends TestBase {

    @Test
    @DisplayName("Загрузка и проверка PDF-файла")
    @Step ("Скачиваем и проверяем PDF-файл")
    void downloadFileTest() throws Exception {
        open("/company/");
        File downloaded =
                $("p a[href*='/upload/']")
                        .download();
        try (InputStream is = new FileInputStream(downloaded)) {
            PDF pdf = new PDF(downloaded);
            String pdfAuthor = pdf.author;
            Assertions.assertEquals("mvkorshunova2", pdfAuthor);
        }
    }
}
