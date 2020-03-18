import com.kang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author klr
 * @create 2020-03-18-13:53
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        //走无参构造创建对象
        //删掉User中的无参构造就报错了
        //默认实现
        User user =(User) context.getBean("user");
        System.out.println(user.toString());
    }
}
