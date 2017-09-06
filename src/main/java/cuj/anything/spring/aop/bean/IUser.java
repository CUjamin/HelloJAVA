package cuj.anything.spring.aop.bean;

/**
 * Created by cujamin on 2017/8/26.
 */
public interface IUser {
    public String findUser(String username);
    public void addUser(String username);
    public void findAll();
}
