package wbs.demoFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demoUser {
    public static void main(String[] args) {
        User u = new User();
        System.out.println("new 出来的user对象："+u);
//        创建IOC容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
//        通过容器获取对象
        User u1 = (User)ac.getBean("u");
        System.out.println("这是IOC获取的对象："+ u1);

        User u2 = ac.getBean(User.class);
        System.out.println("IOC通过字节码文件获取对象"+ u2);

        User u3 = ac.getBean("u", User.class);
        System.out.println("IOC通过对象名+字节码文件获取对象："+u3);

    }
}
