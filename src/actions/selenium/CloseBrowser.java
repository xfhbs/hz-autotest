package actions.selenium;
import actions.selenium.Browser;

import java.util.*;

class CloseBrowser{
    public void run(HashMap<String, Object> params){
        if(Browser.Driver != null) {
            Browser.Driver.quit();
        }
    }
}