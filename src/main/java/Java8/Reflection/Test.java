package Java8.Reflection;

public class Test {
    public static void main(String[] args) {
        Class<?> c = TestController.class;
        MyRequestMapping baseRequestMapping = c.getAnnotation(MyRequestMapping.class);
        System.out.println(baseRequestMapping.value()); // 输出value的值
    }
}