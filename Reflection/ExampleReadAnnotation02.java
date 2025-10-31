//Example Read Annotation 02
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Test {}

class Calculator {
    @Test
    public void add() {}
}

public class ExampleReadAnnotation02 {
    public static void main(String[] args) {
        var m = Calculator.class.getDeclaredMethods()[0];
        if (m.isAnnotationPresent(Test.class))
            System.out.println(m.getName() + " là cộng");
        // Kết quả: add là cộng
    }
}
