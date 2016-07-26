package actions.selenium;

import actions.selenium.Browser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
    
import java.util.*;

class ExecuteJavascript{
    public void run(HashMap<String, Object> params){
        ((JavascriptExecutor) Browser.Driver).executeScript((String) params.get("Code"));
    }
}