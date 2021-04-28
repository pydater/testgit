import com.maven.Hello;
import org.junit.Test;

public class HelloTest {
    @Test
    public void testHello() {
        Hello hello = new Hello();
        hello.sayhello();
    }
}
