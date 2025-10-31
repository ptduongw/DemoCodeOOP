import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
 
@Retention(value = RetentionPolicy.SOURCE)
//Nó tồn tại trên mã nguồi và trình biên dịch không nhận ra
@Target(value = {ElementType.METHOD, ElementType.FIELD})
//Nó sẽ được dùng chú thích tren mot method
public @interface MyCustomAnnotation{    
}
public class VD4 {
    @MyCustomAnnotation  //Gán trước một field
    private int myAge = 22;    
    
    @MyCustomAnnotation   //Gán trước một method
    public void aMethod(){
        System.out.println("Phuong thuc duoc chu thich boi MyCustomAnnotation");
    }
    public static void main(String[] args) {
        VD4 obj = new VD4();
        obj.aMethod();
    }
}