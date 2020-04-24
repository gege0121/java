package Java8.Reflection;

//use @ in test controller

@MyRequestMapping("/test")
public class TestController {
    public void test() {
        System.out.println("进入Test方法");
    }
}
