package actions.selenium;

import actions.selenium.Browser;
    
import java.util.*;

class NavigateToURL{
    public void run(HashMap<String, Object> params){
        Browser.Driver.navigate().to((String) params.get("URL"));
    }
}