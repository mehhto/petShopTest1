package configuration;

public class AppProperties {

    public static String getAllUrls(){
        return ConfigurationProperties.getProperties().getProperty("app.url");
    }
}
