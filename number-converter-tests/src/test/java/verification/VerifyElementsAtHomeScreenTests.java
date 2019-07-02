package verification;

import base.BaseTest;
import moneyConverter.Home;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests are verifying that all elements are visible at Home scree, elements that should be visible are header
 * "Money converter", inputs "Enter Your value:" and "Your result" and buttons "Format into monetary acceptable form" and "Clear fields"
 * tests are also verifying that first field is in focus
 *
 * @author Milic Bogicevic
 */
public class VerifyElementsAtHomeScreenTests extends BaseTest {

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
    public void verifyEnterValueFocused() {
        homeView.verifyInputStatusEnterYourValueFocused();
    }

    @Test
    public void verifyYourResultNotFocused() {
        homeView.verifyInputStatusYourResultNotFocused();

    }

    @Test
    public void verifyHeaderVisible() {
        homeView.verifyHeaderText();

    }

    @Test
    public void verifyEnterYourValueInputVisible() {
        homeView.verifyInputStatusEnterYourValueVisible();
    }

    @Test
    public void verifyFormatIntoMonetaryAcceptableFormVisible() {
        homeView.verifyButtonStatusFormatVisible();
    }

    @Test
    public void verifyYourResultVisible() {
        homeView.verifyInputStatusYourResultsVisible();
    }

    @Test
    public void verifyClearFields() {
        homeView.verifyButtonStatusClearFieldsVisible();
    }


}
