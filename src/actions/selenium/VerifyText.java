package actions.selenium;

import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;

import java.util.*;

class VerifyText{
    public void run(HashMap<String, Object> params){
        WebElement element = Elements.find(params,Browser.Driver);
    
    	assert element.getText().equals((String) params.get("Text")) : "Error expected text: "+params.get("Text")+" does not match text on the UI: "+element.getText();
    }
}