import com.kang.config.KangConfig;
import com.kang.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author klr
 * @create 2020-03-18-22:45
 */
public class MyTest {
    public static void main(String[] args) {

        //如果完全使用配置类方式去做，我们就只能通过AnnotationContext上下文来获取容器，通过配置类的class对象来加载
        ApplicationContext context = new AnnotationConfigApplicationContext(KangConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser.getName());
    }
}
