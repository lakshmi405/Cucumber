package bbc;

import base.Base;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import pages.Newspage;

public class StepDefinations extends Base {

    private Newspage newsPage;

    @Given("^I am on home page$")
    public void i_am_on_home_page() throws Throwable {
        Base.setupBrowser();

    }

    @Given("^I navigate to news page$")
    public void i_navigate_to_news_page() throws Throwable {

        newsPage = homepage.clickNewsPage();
    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String search) throws Throwable {
        newsPage.searchPage(search);

    }

    @Then("^I should see weather related results$")
    public void i_should_see_weather_related_results() throws Throwable {

        Assert.assertEquals(newsPage.getTextFromSearch(), "weather report");

    }

    @After
    public void closeBrowse()
    {
        System.out.println("close");
        Base.quitBrowser();
    }

}

   /* @Given("^I'm on bbc home apge$")
    public void i_m_on_bbc_home_apge() throws Throwable {
        Base.setupBrowser();
    }

    @When("^click on news link$")
    public void click_on_news_link() throws Throwable {
        obj1= homepage.clickNewsPage();
        obj1.searchPage("weather report");

    }

    @Then("^it should open news page$")
    public void it_should_open_news_page() throws Throwable {
        Assert.assertEquals( obj1.getTextFromSearch(),"weather report","incorrect");

    }
*/

