package actions.general;

import java.util.*;

class Wait{
    public void run(HashMap<String, Object> params) throws InterruptedException{
        if (params.get("Seconds") != ""){
          Thread.sleep(Integer.parseInt((String) params.get("Seconds")) * 1000);
        }
    }
}