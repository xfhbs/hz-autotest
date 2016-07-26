package actions.selenium;

import actions.selenium.Browser;

import java.util.*;

class SwitchToFrame{
    public void run(HashMap<String, Object> params){
        if(params.get("Name") != null){
          Browser.Driver.switchTo().frame((String) params.get("Name"));
        }
        else if(params.get("Index") != null){
          Browser.Driver.switchTo().frame(Integer.parseInt((String) params.get("Index")));
        }
    }
}