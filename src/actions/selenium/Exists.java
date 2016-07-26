package actions.selenium;

import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;

import java.util.*;

class Exists{
    public void run(HashMap<String, Object> params){
        List<WebElement> elements = Elements.findAll(params,Browser.Driver);
	    if(params.get("Number of Matches") != null){
	      assert elements.size() == Integer.parseInt((String) params.get("Number of Matches")):String.format("Error element: %1$s was not found expected number of times:%2$s.  It was found: %3$s times.", params.get("ID"), params.get("Number of Matches"),elements.size());
	    }
	    else{
	        assert elements.size() > 0:String.format("Error element: %1$s was not found.",params.get("ID"));
	    }
    }
}