package actions.selenium;

import actions.selenium.utils.Elements;
import org.openqa.selenium.JavascriptExecutor;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.*;

class DragAndDrop{
    public void run(HashMap<String, Object> params){
        HashMap<String, Object> From = new HashMap<String,Object>();
        HashMap<String, Object> To = new HashMap<String,Object>();
        From.put("ID",params.get("From ID"));
        From.put("ID Type",params.get("From ID Type"));
        To.put("ID",params.get("To ID"));
        To.put("ID Type",params.get("To ID Type"));

        //WebElement element = Elements.find(new HashMap<String,Object>(){{put("ID", params.get("From ID"));put("ID Type", params.get("From ID Type"));}},Browser.Driver);
        //WebElement target = Elements.find(new HashMap<String,Object>(){{put("ID", params.get("To ID"));put("ID Type", params.get("To ID Type"));}},Browser.Driver);
        WebElement element = Elements.find(From,Browser.Driver);
        WebElement target = Elements.find(To,Browser.Driver);

        Actions action = new Actions(Browser.Driver);
        action.dragAndDrop(element,target);
        action.build();
        action.perform();
    }
}