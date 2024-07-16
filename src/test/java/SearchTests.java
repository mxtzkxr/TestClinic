import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        Configuration.browserSize = "1920x1080";
        //open("https://www.google.com/");
        //$("[name=q]").setValue("selenide").pressEnter();
        //$("[id=search]").shouldHave(text("https://selenide.org"));
        //Configuration.timeout = 15000;
        open("https://med.kpfu.ru");
        $(byText("Дополнительное образование")).parent().sibling(1).click();
        $(byText("Все курсы")).click();
        $(byText("Эхокардиография")).click();
        $(byText("Записаться")).click();
        $("[name=lastname]").setValue("Тестов");
        $("[name=lastname]").parent().sibling(0).$("[name=name]").setValue("Тест");
        $("[name=patronymic]").setValue("Тестович");
        $("[name=patronymic]").parent().sibling(0).$("[name=email]").setValue("a@aa.aa");
        $("[name=patronymic]").parent().parent().sibling(0).$("[name=phone]").setValue("0000000000");
        $("[name=passportSeries]").setValue("000");
        $("[name=passportNumber]").setValue("123");
        $("[name=issuedBy]").setValue("МВД");
        $("[name=dateOfIssue]").click();
        $(".dayContainer").$(byText("17")).click();
        //$(".modal-ask__form-footer").$(".checkbox checkbox__small").click();
        $("[name=dateOfBirth]").click();
        $(".dayContainer").$(byText("17")).parent().parent().parent().parent().parent().sibling(0).$(".dayContainer").$(byText("12")).click();
        //$(".flatpickr-day").$(byText("17")).click();
       // $(".dayContainer").sibling(0).$(byText("1"));
       // $(byAttribute("style","top: 674.703px; left: 346.641px; right: auto;")).$(byText("17")).click();
       // $("[name=dateOfIssue]").parent().parent().parent().sibling(0).$(byText("обработку персональных")).click();

        $("[name=dateOfIssue]").parent().parent().parent().sibling(0).$(byText("Оставить заявку")).parent().$(".checkbox__content").click();
        $("[name=dateOfIssue]").parent().parent().parent().sibling(0).$(byText("Оставить заявку")).click();

        sleep(5000);
        //$("[id=firstName]").setValue("Testin");
    }
}
