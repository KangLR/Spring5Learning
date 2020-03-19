import com.kang.mapper.UserMapper;
import com.kang.mapper.UserMapperImpl;
import com.kang.mapper.UserMapperImplTwo;
import com.kang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author klr
 * @create 2020-03-19-19:57
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //SPring  jdk代理的是接口  cglib代理的类
        //在创建对象开始之前，会进行判断来决定使用JDK动态代理还是CGLIB动态代理，因为这两种代理模式对代理对象的要求不同，比如JDK动态代理就要求被代理的对象实现了某个接口。
        UserMapper userMapper1 = context.getBean("userMapper1", UserMapper.class);
        for (User user : userMapper1.selectUser()) {
            System.out.println(user);
        }
    }
}
