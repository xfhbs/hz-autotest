package actions.selenium;

import actions.selenium.Browser;

import java.util.*;

class VerifyPageTitle{
    public void run(HashMap<String, Object> params){
        assert params.get("Title").equals(Browser.Driver.getTitle()):"Error: page title ${Browser.Driver.getTitle()} does not match expected title of: "+params.get("Title");
    }
}