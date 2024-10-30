package Assaignment;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.Duration;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


import io.github.bonigarcia.wdm.WebDriverManager;


public class T1 {

	@Test
	void task() throws Exception
	{
        JSONParser jsp = new JSONParser();
        FileReader reader = new FileReader(".\\JsonData\\Task.json");
        Object obj = jsp.parse(reader);
        JSONObject data = (JSONObject) obj;
        JSONArray jArray = (JSONArray) data.get("Data");
        System.out.println("JSON Data: " + jArray);
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        
        try {
        	driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");
            driver.findElement(By.xpath("//summary[.='Table Data']")).click();
            WebElement textArea = driver.findElement(By.xpath("//textarea[@id='jsondata']"));
            textArea.clear();
            textArea.sendKeys(jArray.toString());
            driver.findElement(By.xpath("//button[.='Refresh Table']")).click();
            String tableData = driver.findElement(By.xpath("//div[@id='tablehere']")).getText();
            System.out.println("Table Data: " + tableData);

            for (Object item : jArray) {
                JSONObject jsonObject = (JSONObject) item;
                String name = (String) jsonObject.get("name");

                Assertions.assertTrue(tableData.contains(name), "Table does not contain the name: " + name);
            }
		} finally {
			driver.quit();
		}
        		

	}
}
