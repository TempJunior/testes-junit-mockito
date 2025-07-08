package tempjunior_github.fase1;
import org.junit.Assert;
import org.junit.Test;

public class FirstTest {

    @Test
    public void firstTest(){
        String name = "Junior";

        //Assert tem metodos para testar uma determinada variavel
        Assert.assertEquals("Junior", name);
    }

    @Test
    public void testNotEquals(){
        String name = "Jose";

        Assert.assertNotEquals("Joselito", name);
    }

}
