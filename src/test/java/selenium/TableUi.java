package selenium;

import java.util.List;
//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

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableUi {

	@Test
	public void table() {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.iplt20.com/points-table/men/2022");
		WebElement table=driver.findElement(By.xpath("//div[@class='ih-pcard-wrap']//table[@class='ih-td-tab table table-striped']/tbody/tr"));
		int count=driver.findElements(By.xpath("//div[@class='ih-pcard-wrap']//table[@class='ih-td-tab table table-striped']/tbody[2]/tr")).size();
		System.out.println(count);
		for(int i=1;i<count;i++) {
			String t="LSG";
			String team=driver.findElement(By.xpath("//div[@class='ih-pcard-wrap']//table[@class='ih-td-tab table table-striped']/tbody[2]/tr["+i+"]//td[2]/div//h2[@class='ih-pt-cont mb-0 ng-binding']")).getText();
			if(team.equalsIgnoreCase(t)) {
				WebElement lsg=driver.findElement(By.xpath("//div[@class='ih-pcard-wrap']//table[@class='ih-td-tab table table-striped']/tbody[2]/tr["+i+"]//td[2]/div//h2[@class='ih-pt-cont mb-0 ng-binding']"));
				System.out.println(lsg.getText());
				
				int td=driver.findElements(By.xpath("//div[@class='ih-pcard-wrap']//table[@class='ih-td-tab table table-striped']/tbody[2]/tr["+i+"]/td")).size();
				for(int j=1;j<td;j++) {
				//System.out.println(td);
					String details=driver.findElement(By.xpath("//div[@class='ih-pcard-wrap']//table[@class='ih-td-tab table table-striped']/tbody[2]/tr["+i+"]/td["+j+"]")).getText();
					System.out.print(details+" ");
				}
			}
			
		}
	}
}
