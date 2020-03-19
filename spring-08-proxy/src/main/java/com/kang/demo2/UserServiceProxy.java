package com.kang.demo2;

/**
 * @author klr
 * @create 2020-03-19-11:42
 */
public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    //我们在不改变原有业务的情况下要扩展功能，使用代理模式很好


    //增加一个Debug日志实现
    public void log(String msg){
        System.out.println("[Debug]:调用了"+msg+"方法");
    }


}
