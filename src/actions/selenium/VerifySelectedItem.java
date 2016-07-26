package actions.selenium;

import actions.selenium.utils.Elements;
import actions.selenium.Browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

class VerifySelectedItem{
    public void run(HashMap<String, Object> params){
        WebElement element = Elements.find(params,Browser.Driver);
        WebElement option = new Select(element).getFirstSelectedOption();
        String selectedLabel = option.getText();
        String selectedValue = option.getAttribute("value");

        if(params.get("Item Label") != null){
          assert selectedLabel.equals((String) params.get("Item Label")) : "Error: selected option ${selectedLabel} does not match expected option of: "+params.get("Item Label");
        }

        if(params.get("Item Value") != null){
          assert selectedValue.equals((String) params.get("Item Value")) : "Error: selected option ${selectedValue} does not match expected option of: "+params.get("Item Value");
        }
    }
}