package actions.selenium.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import java.util.*;

public class Elements{
	public static WebElement find(HashMap<String, Object> params,WebDriver Driver){
	    assert Driver != null:"Error browser is not opened.  Use Open Browser action.";

	    WebElement foundElement = null;
	    String ID_Type = (String)params.get("ID Type");
        String ID = (String)params.get("ID");
	    switch (ID_Type){
	      case "Class Name":
	      	foundElement = Driver.findElement(By.className(ID));
	      	break;
	      case "Css Selector":
	      	foundElement = Driver.findElement(By.cssSelector(ID));
	      	break;
	      case "ID":
	      	foundElement = Driver.findElement(By.id(ID));
	      	break;
	      case "Link Text":
	      	foundElement = Driver.findElement(By.linkText(ID));
	      	break;
	      case "XPath":
	      	foundElement = Driver.findElement(By.xpath(ID));
	      	break;  
	      case "Name":
	      	foundElement = Driver.findElement(By.name(ID));
	      	break;    
	      case "Partial Link Text":
	      	foundElement = Driver.findElement(By.partialLinkText(ID));
	      	break;
	      case "Tag Name":
	      	foundElement = Driver.findElement(By.tagName(ID));
	      	break;
	      default:
	        foundElement = Driver.findElement(By.id(ID));
	    }
	    
	    return foundElement;
	  }
	  
	  public static List<WebElement> findAll(HashMap<String, Object> params,WebDriver Driver){
	    assert Driver != null:"Error browser is not opened.  Use Open Browser action.";
	    
	    List<WebElement> foundElements = new ArrayList<WebElement>();
	    String ID_Type = (String)params.get("ID Type");
        String ID = (String)params.get("ID");
	    switch (ID_Type){
	      case "Class Name":
	      	foundElements = Driver.findElements(By.className(ID));
	      	break;
	      case "Css Selector":
	      	foundElements = Driver.findElements(By.cssSelector(ID));
	      	break;
	      case "ID":
	      	foundElements = Driver.findElements(By.id(ID));
	      	break;      
	      case "Link Text":
	      	foundElements = Driver.findElements(By.linkText(ID));
	      	break;      
	      case "XPath":
	      	foundElements = Driver.findElements(By.xpath(ID));
	      	break;      
	      case "Name":
	      	foundElements = Driver.findElements(By.name(ID));
	      	break;      
	      case "Partial Link Text":
	      	foundElements = Driver.findElements(By.partialLinkText(ID));
	      	break;      
	      case "Tag Name":
	      	foundElements = Driver.findElements(By.tagName(ID));
	      	break;
	      default:
	        foundElements = Driver.findElements(By.id(ID));
	    }
	    
	    return foundElements;
	  }
}