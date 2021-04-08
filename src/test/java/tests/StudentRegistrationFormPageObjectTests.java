package tests;

import Pages.StudentRegistrationPage;
import org.junit.jupiter.api.Test;

public class StudentRegistrationFormPageObjectTests extends TestBase {
    StudentRegistrationPage studentRegistrationPage;

    @Test
    void successfulFillFormTest() {
        studentRegistrationPage = new StudentRegistrationPage();

        studentRegistrationPage.openPage();
        studentRegistrationPage.fillForm();
        studentRegistrationPage.checkData();
    }
}
