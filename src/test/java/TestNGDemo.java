import annotations.User;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGDemo {
    @Test
    public void createNewUser(){
        User firstUser=new User("Sunny",23);
        Assert.assertNotNull(firstUser);
    }

    @DataProvider(name = "inputValues")
    public Object[][]getInputValues(){
        return new Object[][]{
                {"john@gmail.com","gmabino"},
                {"sam@gmail.com","valid"},
                {"tom@gmail.com","invalid"}
        };
    }
    @Test(dependsOnMethods = "createNewUser")
    public void loginTest(){
        Assert.assertTrue(true);


    }
    @Test(dataProvider = "inputValues")
    public void testLoginFun(String username,String password){
        System.out.println(username+""+password);
    }

}






