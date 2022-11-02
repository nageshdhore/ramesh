package patil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a12345 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		  driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		  driver.manage().window().maximize();
		 
		  WebElement txt_firstname = driver .findElement(By.name("firstname"));
			
			txt_firstname.sendKeys("Nagesh");
			
	
			  WebElement txt_lastname = driver .findElement(By.name("lastname"));
				
				txt_lastname.sendKeys("patil");
				
		
 	 WebElement radiogen = driver .findElement(By.name("sex"));
					
		radiogen.click();
					
					 WebElement radioexp = driver .findElement(By.name("exp"));
						
						radioexp.click();
						
						 WebElement txt_date = driver .findElement(By.id("datepicker"));
							
							txt_date.sendKeys("28/09/22");
						
							 WebElement prof = driver .findElement(By.id("profession-1"));
								
								prof.click();
										
								WebElement sele = driver .findElement(By.id("tool-2"));
									
									sele.click();
										
							
							
							
							
					 WebElement btnlogin = driver .findElement(By.id("submit"));
								
					btnlogin.click();
								
						
			  String title=driver.getTitle();
			    
			    System.out.println(title);
			
			
				  String url=driver.getCurrentUrl();

			    System.out.println(url);
			
	
	
	
	
	
	
	}

}
