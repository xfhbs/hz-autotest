package actions.selenium;

import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;
    
import java.util.*;

class WaitForElement{
    public void run(HashMap<String, Object> params) throws InterruptedException{
        int count = Integer.parseInt((String) params.get("Timeout In Seconds"));
        while(count >= 0){
          List<WebElement> elements = Elements.findAll(params,Browser.Driver);
          if(elements.size() > 0) break;
          Thread.sleep(1000);
          count--;
        }
        if(count <= 0){
          assert false : "Element was not found in "+params.get("Timeout In Seconds")+" seconds.";
        }

    }
}