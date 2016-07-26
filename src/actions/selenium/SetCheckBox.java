package actions.selenium;

import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;

import java.util.*;

class SetCheckBox{
    public void run(HashMap<String, Object> params){
        WebElement element = Elements.find(params,Browser.Driver);
        if(params.get("Check").equals("true")){
          if(element.isSelected() == false){
            element.sendKeys(org.openqa.selenium.Keys.SPACE);
          }
        }
        else{
          if(element.isSelected() == true){
            element.sendKeys(org.openqa.selenium.Keys.SPACE);
          }
        }
    }
}