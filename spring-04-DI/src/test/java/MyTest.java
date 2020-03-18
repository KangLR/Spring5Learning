import com.kang.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author klr
 * @create 2020-03-18-15:02
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student=(Student) context.getBean("student");
//        System.out.println(student.getName());
//        System.out.println(student.getAddress());
        System.out.println(student.toString());

    }
}
