package HostelWorldTest.HostelWorldTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Ejemplo {
	
	public static void main(String[] args)
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demoaut.katalon.com/");
		driver.findElement(By.id("btn-make-appointment")).click();
		driver.findElement(By.id("btn-login")).click();
		
		
		
		WebElement testDropdown = driver.findElement(By.id("combo_facility"));
		Select dropdown = new Select(testDropdown);
		
		dropdown.selectByValue("Seoul CURA Healthcare Center");
		
		driver.findElement(By.id("chk_hospotal_readmission")).click();
		
		driver.findElement(By.id("radio_program_none")).click();
		
		driver.findElement(By.id("txt_visit_date")).click();
				
		driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr[5]/td[4]")).click();
			
		driver.findElement(By.id("txt_comment")).click();
		driver.findElement(By.id("txt_comment")).sendKeys("Un turno polfavo");
		
		driver.findElement(By.id("btn-book-appointment")).click();
		
		/*	List<WebElement> fechas = driver.findElements(By.className("day"));					
		
		for(WebElement cell: fechas)
		{
			if(cell.getText().equals("1"))
			{
				cell.findElement(By.linkText("1")).click();
				break;
			}
			
		}*/
		
	
		
			
	
	
	
	}
	

}
