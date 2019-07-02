package functionality;

import base.BaseTest;
import moneyConverter.Home;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Test here is checking how app is behaving if you use several times button format after clearing fields
 *
 * @author Milic Bogiceivc
 */
public class CheckCombinationFoClearAndFormatButtonsTests extends BaseTest {

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
    public void continueWorkingAfterClearingFields() {
        homeView.setEnterYourValue("333225511.156847").formatButton().verifyYourResultsValue("333 225 511.16")
                .clearButton().confirm().verifyEnterYourValue("").setEnterYourValue("25").formatButton().verifyYourResultsValue("25.00")
                .clearButton().confirm().setEnterYourValue("-2546878.165").formatButton().verifyYourResultsValue("-2 546 878.17").clearButton().confirm()
                .verifyEnterYourValue("").verifyYourResultsValue("");
    }

}
