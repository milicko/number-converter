package functionality;

import base.BaseTest;
import moneyConverter.Home;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests are verifying basic functionality of Format button. The are checking results after entering valid numbers, not valid numbers, numbers with text,
 * numbers with + and with -, decimal numbers, click on button when fields are empty
 *
 * @author Milic Bogiceivc
 */
public class VerifyFormatButtonFunctionalityTest extends BaseTest {

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
    public void checkResultsWithValidNumber() {
        homeView.setEnterYourValue("22222222").formatButton().verifyYourResultsValue("22 222 222.00");
    }

    @Test
    public void checkResultsWithDecimalNumber() {
        homeView.setEnterYourValue("12345.235468865").formatButton().verifyYourResultsValue("12 345.24");
    }


    @Test
    public void checkResultsWithNotValidNumbers() {
        homeView.setEnterYourValue("2222.222.222.22").formatButton().verifyYourResultsValue(notValidNumber);

    }

    @Test
    public void formatWhenFieldsAreEmpty() {
        homeView.formatButton().verifyYourResultsValue(notValidNumber);
    }


    @Test
    public void checkResultsWithNumbersAndPlusCombination() {
        homeView.setEnterYourValue("2222+222+222").formatButton().verifyYourResultsValue(notValidNumber).clearEnterYourValue()
                .setEnterYourValue("+22222").formatButton().verifyYourResultsValue("22 222.00").clearEnterYourValue()
                .setEnterYourValue("+2353.15652").formatButton().verifyYourResultsValue("2 353.16");

    }

    @Test
    public void checkResultsWithNumbersAndMinusCombination() {
        homeView.setEnterYourValue("2222-222-222").formatButton().verifyYourResultsValue(notValidNumber).clearEnterYourValue()
                .setEnterYourValue("-22222").formatButton().verifyYourResultsValue("-22 222.00").clearEnterYourValue()
                .setEnterYourValue("-2353.15652").formatButton().verifyYourResultsValue("-2 353.16");

    }

    @Test
    public void formatNumberTwiceWithoutClearButton(){
        homeView.setEnterYourValue("5642695.223").formatButton().verifyYourResultsValue("5 642 695.22").clearEnterYourValue()
                .setEnterYourValue("458792").formatButton().verifyYourResultsValue("458 792.00");

    }


}
