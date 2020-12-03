package driver;

import configuration.AppProperties;

public class ApplicationURLs {
    public static final String APPLICATION_URL = AppProperties.getAllUrls();
    public static final String LOGIN_URL = APPLICATION_URL + "actions/Account.actions?signonForm=";
}
