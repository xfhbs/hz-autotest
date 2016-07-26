package actions.selenium;

import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;

import java.util.*;

class VerifyElementState{
    public void run(HashMap<String, Object> params){
        WebElement element = Elements.find(params,Browser.Driver);
	
        if(params.get("Is Enabled") != null){
          assert element.isEnabled() == Boolean.getBoolean((String) params.get("Is Enabled")):"Error, expected enabled state as: "+params.get("Is Enabled")+" did not match current element state.";
        }

        if(params.get("Is Visible") != null){
          assert element.isDisplayed() == Boolean.getBoolean((String) params.get("Is Visible")):"Error, expected visible state as: "+params.get("Is Visible")+" did not match current element state.";
        }
    }
}