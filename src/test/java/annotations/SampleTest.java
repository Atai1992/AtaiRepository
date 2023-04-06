package annotations;

import org.testng.annotations.*;

public class SampleTest {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");

    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("demo after method");
    }
    @BeforeGroups(groups = "groups1")
    public void beforeGroups() {
        System.out.println("Before group");
    }
    @Test(groups = "groups1")
    public void demoTest(){
        System.out.println("demo test1");

    }
    @AfterGroups(groups = "groups1")
    public void afterGroups(){
        System.out.println("after group");
    }
    @Test(groups = "groups1")
    public void demoTest2(){
        System.out.println("demo test2");
    }
    @Test(dependsOnMethods = "demoTest")
    public void demoTest12 (){
        System.out.println("demo test 12");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("after test");
    }
}
