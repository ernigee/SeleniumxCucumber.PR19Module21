package stepdef;

import com.fasterxml.jackson.databind.ser.Serializers;
import org.junit.After;
import org.junit.Before;

import static java.sql.DriverManager.getDriver;

public class CucumberHooks extends BaseTest {

    @Before
    public void beforeTest(){
        getDriver();
    }

    @After
    public void afterTest(){
        driver.close();
    }
}
