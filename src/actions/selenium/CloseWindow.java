package actions.selenium;
import actions.selenium.Browser;

import java.util.*;

class CloseWindow{
    public void run(HashMap<String, Object> params){
        Browser.Driver.close();
    }
}