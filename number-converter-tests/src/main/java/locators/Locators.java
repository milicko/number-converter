package locators;

public class Locators {

    public static final String HEADER_TEXT = "//h2[text()='Money converter']";

    public static final String BUTTON_BY_TEXT(String text) {
        return String.format("//button[text()='" + text + "']");
    }

    public static final String INPUT_BY_ID(String text) {
        return String.format("//input[@id='" + text + "']");
    }


}
