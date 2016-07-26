package actions.selenium;

import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
    
import java.util.*;

class DoubleClick{
    public void run(HashMap<String, Object> params){
        WebElement element = Elements.find(params,Browser.Driver);
    
        Actions action = new Actions(Browser.Driver);
        action.doubleClick(element);
        action.perform();
    }
}