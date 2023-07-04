package common;

import com.codeborne.selenide.Configuration;

public class Config {

    /**
     * SPECIFY THE BROWSER FOR TEST:
     * firefox
     * ie
     * opera
     * edge
     * chrome
     **/

    public static final String BROWSER_NAME = "chrome";

    /**
     * CLean browser cookies after each iteration;
     **/
    public static final Boolean CLEAR_COOKIES = true;

    /**
     * To keep browser open after whole scenario;
     **/
    public static final Boolean HOLD_BROWSER_OPEN = true;

    /**
     * To delete old screenshots before each new test run;
     **/
    public static final Boolean CLEAR_SCREENSHOTS_DIR = false;

    static {
        Configuration.holdBrowserOpen = HOLD_BROWSER_OPEN;
        Configuration.reportsFolder = "build/reports/tests";
        Configuration.browser = BROWSER_NAME;
        Configuration.browserSize = "1920x1080";
    }
}
