package functionality;

import base.BaseTest;
import moneyConverter.Home;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests are verifying how input fields are behaving when you are entering text instead of numbers, when you are entering not valid numbers,
 * and with entering combination of text with numbers, tests are also verifying that you cannot enter text into Your result field
 *
 * @author Milic Bogiceivc
 */
public class VerifyInputBehavioursTest extends BaseTest {
    String notValidNumber = "Entered value is not a valid number!";
    Home homeView = new Home(this);

    @Before
    public void open() {
        openBrowser();
    }

    @After
    public void close() {
        closeBrowser();
    }

    @Test
    public void tryToEnterTextIntoEnterYourValueField() {
        homeView.setEnterYourValue("test").verifyEnterYourValue("");

    }

    @Test
    public void tryToEnterNumberWithCommaInsteadOfDot() {
        homeView.setEnterYourValue("12345,232123").verifyEnterYourValue("12345232123");

    }

    @Test
    public void tryToEnterNumbersWithTextIntoEnterYourValueField() {
        homeView.setEnterYourValue("22223333ddddsfdsf").verifyEnterYourValue("22223333");

    }

    @Test
    public void tryToEnterTextWithNumbersIntoEnterYourValueField() {
        homeView.setEnterYourValue("ddddd22222").verifyEnterYourValue("22222");

    }

    @Test
    public void tryToEnterNumbersIntoYourResultField() {
        homeView.setYourResults("13213123").verifyYourResultsValue("");
    }

    @Test
    public void tryToEnterTextIntoYourResultField() {
        homeView.setYourResults("asdasd").verifyYourResultsValue("");
    }


}
