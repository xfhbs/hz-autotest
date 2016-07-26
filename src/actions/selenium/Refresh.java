package actions.selenium;

import actions.selenium.Browser;

import java.util.*;

class Refresh{
    public void run(HashMap<String, Object> params){
        Browser.Driver.navigate().refresh();
    }
}