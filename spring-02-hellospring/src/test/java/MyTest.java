import com.kang.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author klr
 * @create 2020-03-18-12:05
 */
public class MyTest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在Spring中管理了（控制反转了，不再由我们创建了），我们要使用，直接去里面取出来就可以！
        Hello hello =(Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
