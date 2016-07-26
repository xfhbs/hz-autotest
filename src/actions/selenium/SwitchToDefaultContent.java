package actions.selenium;

import actions.selenium.Browser;

import java.util.*;

class SwitchToDefaultContent{
    public void run(HashMap<String, Object> params){
        Browser.Driver.switchTo().defaultContent();
    }
}