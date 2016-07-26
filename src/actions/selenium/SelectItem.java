package actions.selenium;

import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

class SelectItem{
    public void run(HashMap<String, Object> params){
        WebElement element = Elements.find(params,Browser.Driver);
    
        if(params.get("Visible Text") != null){
            new Select(element).selectByVisibleText((String) params.get("Visible Text"));
        }
        else if(params.get("Value") != null){
            new Select(element).selectByValue((String) params.get("Value"));
        }
        else if (params.get("Index") != null){
            new Select(element).selectByIndex(Integer.parseInt((String) params.get("Index")));
        }


    }
}