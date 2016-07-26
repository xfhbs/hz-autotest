package actions.selenium;

import actions.selenium.Browser;

import java.util.*;

class SwitchWindow{
    public void run(HashMap<String, Object> params) throws InterruptedException{
        int iTimeout = 20;

        if(params.get("Browser window name").equals("Default Window")){
          Browser.Driver.switchTo().window(Browser.MainWinHandle);
          return;
        }

        while(iTimeout > 0){
          for (String handle : Browser.Driver.getWindowHandles()){

            Browser.Driver.switchTo().window(handle);
            if (Browser.Driver.getTitle().equals((String) params.get("Window Name"))){
              return;
            }
          }
          iTimeout--;
          Thread.sleep(1000);
        }

        assert false:"Window: "+params.get("Window Name")+" does not exist.";
    }
}