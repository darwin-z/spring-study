import cloud.zhfsmy.junit.SpringConfig;
import cloud.zhfsmy.junit.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

//两种方式均可
//方式一
//@ExtendWith(SpringExtension.class)
//@ContextConfiguration("classpath:beans.xml")
//方式二
@SpringJUnitConfig(SpringConfig.class)
public class SpringJunitTest {
    @Autowired
    private User user;

    @Test
    public void test() {
        user.sayHello();
    }
}