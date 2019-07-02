package moneyConverter;

import base.Base;
import base.BaseTest;

import static org.junit.Assert.assertEquals;


/**
 * @author Milic Bogiceivc
 */
public class Allert extends Base {


    public Allert(BaseTest _driver) {
        super(_driver);
    }

    /**
     * This method clicks on cancel button on Alert popup
     *
     * @return Home class
     */
    public Home cancel() {
        getDriver().switchTo().alert().dismiss();
        return new Home(this);
    }

    /**
     * This method clicks on OK button in Alert popup
     *
     * @return Home class
     */
    public Home confirm() {
        getDriver().switchTo().alert().accept();
        return new Home(this);
    }

    /**This method gets text from alert popup and it asserts that expected message is equald to actual message
     * @param expectedMessage - message that you expect
     * @return Allert class
     */
    public Allert verifyMessage(String expectedMessage) {
        String allertText = getDriver().switchTo().alert().getText();
        assertEquals("Allert message isn't as expected!", allertText, expectedMessage);
        return this;
    }

}
