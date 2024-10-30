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
		// Initializing JSON parser to read JSON file Data
        JSONParser jsp = new JSONParser();
        FileReader reader = new FileReader(".\\JsonData\\Task.json"); // This is JSON file Path

        // Parsing the JSON file and casting it to a JSONObject
        Object obj = jsp.parse(reader);
        JSONObject data = (JSONObject) obj;

        // Extract the JSON array with data entries
        JSONArray jArray = (JSONArray) data.get("Data");
        System.out.println("JSON Data: " + jArray); // Print JSON data for verification
        
        // Setting up WebDriver to launch Chrome Browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Defining implicit and explicit waits to handle webelements if those taken time to get visible
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize(); // Maximize browser window for better view

        try {
            // Accessing the webpage by loading the url
            driver.get("https://testpages.herokuapp.com/styled/tag/dynamic-table.html");

            // Clicking on 'Table Data' button to reveal the textarea for entering Json Data
            driver.findElement(By.xpath("//summary[.='Table Data']")).click();

            // Locating the text area and insert the parsed JSON data
            WebElement textArea = driver.findElement(By.xpath("//textarea[@id='jsondata']"));
            
            // Clearing pre-existing text in the text area
            textArea.clear(); 
            
            // Send JSON data to text area
            textArea.sendKeys(jArray.toString()); 

            // Click 'Refresh Table' button to populate the table with the given data
            driver.findElement(By.xpath("//button[.='Refresh Table']")).click();

            // Getting the populated table data and storing in a variable for validation
            String tableData = driver.findElement(By.xpath("//div[@id='tablehere']")).getText();
            System.out.println("Table Data: " + tableData); // Print table data for verification

            // Loop through each item in the JSON array to validate it is displayed in the table
            for (Object item : jArray) {
                JSONObject jsonObject = (JSONObject) item;
                String name = (String) jsonObject.get("name"); // Extract 'name' value from each JSON object

                // Assertion to verify the name in table data contains the name what we have given
                Assertions.assertTrue(tableData.contains(name), "Table does not contain the name: " + name);
            }
        } finally {
            // Closing the browser after test execution
            driver.quit();
        }
        		

	}
}
