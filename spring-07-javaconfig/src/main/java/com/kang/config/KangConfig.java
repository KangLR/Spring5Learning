package com.kang.config;

import com.kang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author klr
 * @create 2020-03-18-22:43
 */

//Configuration实现了@Component注解
    //Configuration也会被Spring容器托管，因为它本来就是一个@Component
    //@Configuration代表这是一个配置类，就和beans.xml一样

    //用componentScan就不用@bean了，二选一

//加了该注解就类似于xml的<beans>
@Configuration
@ComponentScan("com.kang.pojo")
@Import(KangConfig1.class)//类似于import
public class KangConfig {


    //@Bean相当于bean标签
    //这个方法的名字相当于标签中的id
    @Bean
    public User getUser(){
        return new User();//返回要注入到bean的对象
    }

}
