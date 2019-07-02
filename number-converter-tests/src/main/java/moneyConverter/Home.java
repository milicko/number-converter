package moneyConverter;

import base.Base;
import base.BaseTest;
import locators.Locators;

/**
 * @author Milic Bogiceivc
 */
public class Home extends Base {

    private String inputEnterValue = "input-field-1";
    private String inputYourResult = "input-field-2";
    private String buttonFormat = "Format into monetary acceptable form";
    private String buttonClear = "Clear fields";

    public Home(BaseTest _driver) {
        super(_driver);
    }


    /**
     * This method sets desiered text into Enter Your Value field
     *
     * @param value - text that you want to enter
     * @return Home class
     */
    public Home setEnterYourValue(String value) {
        typeKeys(Locators.INPUT_BY_ID(inputEnterValue), value);
        return this;
    }


    /**
     * This method verifies header text of home page
     *
     * @return Home class
     */
    public Home verifyHeaderText() {
        waitForVisible(Locators.HEADER_TEXT);
        return this;
    }

    /**
     * This method verifies value from Enter Your Value field
     *
     * @param expectedValue - value that you expect
     * @return Home class
     */
    public Home verifyEnterYourValue(String expectedValue) {
        verifyValue(Locators.INPUT_BY_ID(inputEnterValue), expectedValue);
        return this;
    }

    /**
     * This method verifies that input Enter Your Value is visible
     *
     * @return Home class
     */
    public Home verifyInputStatusEnterYourValueVisible() {
        waitForVisible(Locators.INPUT_BY_ID(inputEnterValue));
        return this;
    }

    /**
     * This method verifies that Your Result field is visible
     *
     * @return Home class
     */
    public Home verifyInputStatusYourResultsVisible() {
        waitForVisible(Locators.INPUT_BY_ID(inputEnterValue));
        return this;
    }

    /**
     * This method clears text from Enter your value field
     *
     * @return Home class
     */
    public Home clearEnterYourValue() {
        clear(Locators.INPUT_BY_ID(inputEnterValue));
        verifyValue(Locators.INPUT_BY_ID(inputEnterValue), "");
        return this;
    }


    /**
     * This method clicks on Format into monetary acceptable form button
     *
     * @return Home class
     */
    public Home formatButton() {
        click(Locators.BUTTON_BY_TEXT(buttonFormat));
        return this;
    }

    /**
     * This method verifies that input Enter Your value is focused
     *
     * @return Home class
     */
    public Home verifyInputStatusEnterYourValueFocused() {
        verifyInputIsFocused(Locators.INPUT_BY_ID(inputEnterValue), true);
        return this;
    }

    /**
     * This method verifies that input Your Result isn't focused
     *
     * @return
     */
    public Home verifyInputStatusYourResultNotFocused() {
        verifyInputIsFocused(Locators.INPUT_BY_ID(inputYourResult), false);
        return this;
    }

    /**
     * This method clicks on Clear fields button
     *
     * @return Allert class
     */
    public Allert clearButton() {
        click(Locators.BUTTON_BY_TEXT(buttonClear));
        return new Allert(this);
    }

    /**
     * This method verifies that Format into monetary acceptable form button is viisble
     *
     * @return Home class
     */
    public Home verifyButtonStatusFormatVisible() {
        waitForVisible(Locators.BUTTON_BY_TEXT(buttonFormat));
        return this;
    }

    /**
     * This method verifies that Clear fields button is visible
     *
     * @return
     */
    public Home verifyButtonStatusClearFieldsVisible() {
        waitForVisible(Locators.BUTTON_BY_TEXT(buttonClear));
        return this;
    }


    /**
     * This method tries to set text into Your Results input
     *
     * @param value - text that you want to enter
     * @return Home class
     */
    public Home setYourResults(String value) {
        typeKeys(Locators.INPUT_BY_ID(inputYourResult), value);
        return this;
    }

    /**
     * This method verifies value from Your Results field
     *
     * @param expectedValue - value that you expect
     * @return Home class
     */
    public Home verifyYourResultsValue(String expectedValue) {
        verifyValue(Locators.INPUT_BY_ID(inputYourResult), expectedValue);
        return this;
    }


}
