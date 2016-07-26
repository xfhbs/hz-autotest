package actions.selenium;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
    

class Browser{
	public static WebDriver Driver = null;
  	public static String MainWinHandle = null;
  	
  	public void run(HashMap<String, Object> params) throws IOException, InterruptedException{
        String os = System.getProperty("os.name").toLowerCase();

		Thread.sleep(1000);
        if (params.get("Browser Type").equals("Firefox")){
          Driver = new FirefoxDriver();
        }
        else if (params.get("Browser Type").equals("Chrome")){
        	ChromeDriverService service = null;

          if(os.contains("nix") || os.contains("nux")||os.contains("aix")){
              File chromedriver = new File("chromedriver");
              if(!chromedriver.exists()){
            	  assert false : "Please upload proper linux chromedriver file to bin directory under scripts tab.";
              }
              chromedriver.setExecutable(true);
              service = new ChromeDriverService.Builder().usingPort(9518).usingDriverExecutable(chromedriver).build();
          }
          else{
            service = new ChromeDriverService.Builder().usingPort(9518).usingDriverExecutable(new File("chromedriver.exe")).build();
          }
          service.start();
          Driver = new RemoteWebDriver(service.getUrl(),DesiredCapabilities.chrome());
        }
        else{
          InternetExplorerDriverService serviceIE = new InternetExplorerDriverService.Builder().usingPort(9516).usingDriverExecutable(new File("IEDriverServer.exe")).build();
          serviceIE.start();
          DesiredCapabilities d = DesiredCapabilities.internetExplorer();
          d.setCapability("nativeEvents", false);
          d.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);

          Driver = new RemoteWebDriver(serviceIE.getUrl(),d);

        }

        if (params.get("URL")!=""){
          if (((String) params.get("URL")).startsWith("http://") || ((String) params.get("URL")).startsWith("https://")){
            Driver.get((String) params.get("URL"));
          }
          else{
            Driver.get("http://"+params.get("URL"));
          }

        }
        Driver.manage().window().maximize();
        Driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
        MainWinHandle = Driver.getWindowHandle();
    }
}