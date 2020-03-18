import com.kang.dao.UserDaoMysqlImpl;
import com.kang.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author klr
 * @create 2020-03-18-10:41
 */
public class MyTest {
    public static void main(String[] args) {
//        //用户实际调用的是业务层，dao层他们不需要接触
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.setUserDao(new UserDaoMysqlImpl());
//        userService.getUser();
        //以上不再需要了


        //获取ApplicationContaxt
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();

    }
}
