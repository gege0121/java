package Java8.Reflection;
import java.lang.annotation.*;

//define annotation interface

@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestMapping {
    String value(); // 写在annotation括号里面的参数
}