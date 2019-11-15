package testhome;

import base.Base;
import org.junit.Test;
import pages.Newspage;

import java.util.Base64;

public class Testhomepage extends Base {
    private Newspage first_page;
    @Test
    public void testinBBChomepage(){
        first_page= homepage.clickNewsPage();
        first_page.searchPage("Weather report");
    }
    @Test
    public void testWeatherPage(){
        testinBBChomepage();
       first_page.clikingWeather();

    }



}
