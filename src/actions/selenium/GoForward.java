package actions.selenium;

import actions.selenium.Browser;
    
import java.util.*;

class GoForward{
    public void run(HashMap<String, Object> params){
        Browser.Driver.navigate().forward();
    }
}