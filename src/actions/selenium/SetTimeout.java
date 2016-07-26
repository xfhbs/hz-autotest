package actions.selenium;

import actions.selenium.Browser;

import java.util.*;

class SetTimeout{
    public void run(HashMap<String, Object> params){
        Browser.Driver.manage().timeouts().implicitlyWait(Integer.parseInt((String) params.get("Seconds")), java.util.concurrent.TimeUnit.SECONDS);
    }
}