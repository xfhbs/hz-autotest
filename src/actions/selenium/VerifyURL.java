package actions.selenium;

import actions.selenium.Browser;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class VerifyURL{
    public void run(HashMap<String, Object> params){
        if(params.get("Value") != null){
          assert Browser.Driver.getCurrentUrl().equals((String) params.get("Value")) : "Error: expected URL value "+params.get("Value")+" does not match URL displayed: "+Browser.Driver.getCurrentUrl();
        }

        if(params.get("Regular Expression") != null){
            //assert Browser.Driver.getCurrentUrl() =~ /${params."Regular Expression"}/ :
            Matcher m = Pattern.compile((String) params.get("Regular Expression")).matcher(Browser.Driver.getCurrentUrl());
            assert m.find() : "Error: expected URL reg expression "+params.get("Regular Expression")+" does not match URL displayed: "+Browser.Driver.getCurrentUrl();
        }

    }
}