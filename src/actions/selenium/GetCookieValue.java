package actions.selenium;

import actions.selenium.Browser;
import org.openqa.selenium.Cookie;

import java.util.*;

class GetCookieValue{
    public String run(HashMap<String, Object> params){
        Cookie cookie = Browser.Driver.manage().getCookieNamed((String) params.get("Name"));
    	assert cookie != null: "Error cookie not found.";
    	return cookie.getValue();
    }
}