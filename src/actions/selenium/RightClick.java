package actions.selenium;

import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

class RightClick{
    public void run(HashMap<String, Object> params){
        WebElement element = Elements.find(params,Browser.Driver);

        Actions action = new Actions(Browser.Driver);

        action.contextClick(element).perform();
    }
}