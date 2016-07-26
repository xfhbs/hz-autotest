package actions.selenium;

import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;
    
import java.util.*;

class GetText{
    public String run(HashMap<String, Object> params){
        WebElement element = Elements.find(params,Browser.Driver);
    
    	return element.getText();
    }
}