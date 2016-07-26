package actions.selenium;

import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;

import java.util.*;

class VerifyCheckBox{
    public void run(HashMap<String, Object> params){
        WebElement element = Elements.find(params,Browser.Driver);
    
    	assert element.isSelected() == Boolean.getBoolean((String) params.get("Is Checked")):"Error check box checked state is expected to be: "+params.get("Is Checked");
    }
}