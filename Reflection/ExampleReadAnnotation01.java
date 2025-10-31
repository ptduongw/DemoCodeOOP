//Example Read Annotation 01
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Info {
    String author();
}

@Info(author = "Tac gia")
class Example {}

public class ExampleReadAnnotation01 {
    public static void main(String[] args) {
        var ann = Example.class.getAnnotation(Info.class);
        System.out.println("Tác giả: " + ann.author()); // Tac gia
    }
}
