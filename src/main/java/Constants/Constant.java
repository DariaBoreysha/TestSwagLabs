package Constants;

import java.time.Duration;

public class Constant {
    public static class TimeoutVariables{
        public static final int IMPLICIT_WAIT = 5;
        public static final int EXPLICIT_WAIT = 5;

        public static class URL{
            public static final String APP_URL = "https://www.saucedemo.com/";
            public static final String PRODUCT_PAGE_URL = "https://www.saucedemo.com/inventory.html";
        }

        public static class LoginsAndPasswords{
            public static final String USERNAME_VALID_STANDARD = "standard_user";
            public static final String USERNAME_LOCKED_OUT = "locked_out_user";
            public static final String USERNAME_PROBLEM = "problem_user";
            public static final String USERNAME_GLITCH = "performance_glitch_user";
            public static final String USERNAME_INVALID = "user";
            public static final String PASSWORD_VALID = "secret_sauce";
            public static final String PASSWORD_INVALID = "password";
        }
        public static class CheckoutCredentials{
            public static final String FIRST_NAME = "John";
            public static final String LAST_NAME = "Doe";
            public static final String POSTAL_CODE = "123";
        }
    }
}
