package actions.selenium;

import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.*;

class SetFocus{
    public void run(HashMap<String, Object> params){
        WebElement element = Elements.find(params,Browser.Driver);
    
    

        if(element.getTagName().equals("input") ){
           element.sendKeys("");
        } 
        else{
           new Actions(Browser.Driver).moveToElement(element).perform();

        }

    }
}