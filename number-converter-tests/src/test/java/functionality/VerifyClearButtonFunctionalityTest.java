package functionality;

import base.BaseTest;
import moneyConverter.Allert;
import moneyConverter.Home;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests are verifying Clear fields button functionality when user performs action if fields are empty, verify that allert with correct message appear after clicking on clear fields button,
 * verify that fields are cleared after clicking on OK button in Alert popup and that they are not cleared after clicking on Cancel
 *
 * @author Milic Bogiceivc
 */
public class VerifyClearButtonFunctionalityTest extends BaseTest {

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
    public void clearPopulatedFields() {
        Allert allert = homeView.setEnterYourValue("98546").formatButton().verifyYourResultsValue("98 546.00")
                .clearButton();

        allert.confirm();

        homeView.verifyYourResultsValue("").verifyEnterYourValue("");
    }

    @Test
    public void verifyAllertMessage() {
        Allert allert = homeView.setEnterYourValue("98546").formatButton().verifyYourResultsValue("98 546.00")
                .clearButton();

        allert.verifyMessage("Warning all input fields will be cleared!!!");

    }

    @Test
    public void cancelClearingOfFields() {
        Allert allert = homeView.setEnterYourValue("160000.256").formatButton().verifyYourResultsValue("160 000.26").clearButton();

        allert.cancel();

        homeView.verifyEnterYourValue("160000.256").verifyYourResultsValue("160 000.26");

    }

}
