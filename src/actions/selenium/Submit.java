package actions.selenium;

import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;

import java.util.*;

class Submit{
    public void run(HashMap<String, Object> params){
        WebElement element = Elements.find(params,Browser.Driver);

    	element.submit();
    }
}