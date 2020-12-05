package driver.listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class DriverEventListenerRegistrar {

    public synchronized static WebDriver registerDriverEventListener(WebDriver driver){
        EventFiringWebDriver eventFiringWebDriver = new EventFiringWebDriver(driver);
        DriverEventListener driverEventListener =  new DriverEventListener();
        return eventFiringWebDriver.register(driverEventListener);
    }

}
