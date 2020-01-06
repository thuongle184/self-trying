package tests;

import org.openqa.selenium.support.PageFactory;
import pages.CommonPage;
import pages.LoginOptionPage;
import runner.TestRunner;

public class PageProvider {

    private static LoginOptionPage loginOptionPage;
    private static CommonPage commonPage;


    public static LoginOptionPage getLoginOptionPage() {
        if (loginOptionPage == null) {
            loginOptionPage = PageFactory.initElements(TestRunner.driver, LoginOptionPage.class);
        }
        return loginOptionPage;
    }

    public static CommonPage getCommonPage() {
        if (commonPage == null) {
            commonPage = PageFactory.initElements(TestRunner.driver, CommonPage.class);
        }
        return commonPage;
    }

}
