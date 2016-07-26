package actions.selenium;

import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

import groovy.lang.Binding;
import groovy.lang.GroovyShell;

import java.util.*;

class SendKeys{
    public static void run(HashMap<String, Object> params){
       WebElement element = Elements.find(params,Browser.Driver);
    
        if(params.get("Text") != null){
          element.sendKeys((String) params.get("Text"));  
        }
        
        if(params.get("key") != null){
          Binding binding = new Binding();
          binding.setVariable("key", null);
          GroovyShell shell = new GroovyShell(binding);
          shell.evaluate("key = org.openqa.selenium.Keys."+params.get("key"));

          element.sendKeys((CharSequence[]) binding.getVariable("key"));
        }
        
    }
}