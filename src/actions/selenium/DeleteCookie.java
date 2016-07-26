package actions.selenium;

import actions.selenium.Browser;

import java.util.*;

class DeleteCookie{
    public void run(HashMap<String, Object> params){
        if(params.get("Cookie Name").equals("ALL")){
        	Browser.Driver.manage().deleteAllCookies();
        }
        else{
        	Browser.Driver.manage().deleteCookieNamed((String) params.get("Cookie Name"));
        }
    }
}