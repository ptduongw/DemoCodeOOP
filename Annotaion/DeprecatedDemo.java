//VD3
public class DeprecatedDemo {

    @Deprecated
    public void oldMethod() {
        System.out.println("Đây là phương thức cũ, đã lỗi thời!");
    }

    public void newMethod() {
        System.out.println("Đây là phương thức mới, nên sử dụng thay thế!");
    }

    @SuppressWarnings("deprecation")  //Bỏ qua cảnh báo Deprecated
    public static void main(String[] args) {
        DeprecatedDemo demo = new DeprecatedDemo();

        demo.oldMethod();  // Thường sẽ có cảnh báo “Deprecated”
        
        // Gọi phương thức mới
        demo.newMethod();
    }
}
