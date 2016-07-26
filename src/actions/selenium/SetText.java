package actions.selenium;

import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

import java.util.*;

class SetText{
    public void run(HashMap<String, Object> params){
        WebElement element = Elements.find(params,Browser.Driver);
    
        element.clear();
        element.sendKeys((String) params.get("Text"));
    }
}