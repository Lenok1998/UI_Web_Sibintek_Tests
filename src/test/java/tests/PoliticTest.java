package tests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import com.codeborne.pdftest.PDF;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PoliticTest extends TestBase {

    @Test
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
