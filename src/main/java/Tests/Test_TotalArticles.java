package Tests;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import TestComponents.BaseTest;
import TestComponents.Retry;
import data.DataReader;

public class Test_TotalArticles extends BaseTest {
	
	//Test method in Test class which calls methods from the Page Object class and define logic
	
	@Test(dataProvider ="getData" , retryAnalyzer =Retry.class)
	public void Test_TotalArticlesByLanguages(HashMap<String, String[]> input){
		
		table.goToArticles();
		int totalArticle = table.totalArticlesByLang(input.get("language"));
		
		// Asserting from Data file
		Assert.assertEquals(totalArticle, Integer.parseInt(input.get("total")[0]));
		
		
	}
	
	@DataProvider
	public Object[][] getData() throws IOException {
		
		List<HashMap<String,String[]>> data = DataReader.getJsonDataToMap();
		return new Object[][] {{data.get(0)},{data.get(1)},{data.get(2)},{data.get(3)}};
	}
	
}
