package actions.selenium;

import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;

import java.util.*;

class VerifyAttribute{
    public void run(HashMap<String, Object> params){
        WebElement element = Elements.find(params,Browser.Driver);
    	assert ((String) params.get("Value")).equals(element.getAttribute((String) params.get("Attribute Name"))) : "Error: value "+element.getAttribute((String) params.get("Attribute Name"))+" of the attribute: "+params.get("Attribute Name")+" does not match expected value of: "+params.get("Value");
    
    }
}