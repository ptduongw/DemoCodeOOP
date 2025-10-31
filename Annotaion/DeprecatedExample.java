//VD2
public class DeprecatedExample {

    // Phương thức cũ - không nên dùng nữa
    @Deprecated
    public void oldMethod() {
        System.out.println("Đây là phương thức cũ (oldMethod), không nên dùng nữa!");
    }

    // Phương thức mới thay thế
    public void newMethod() {
        System.out.println("Đây là phương thức mới (newMethod), hãy dùng phương thức này!");
    }

    public static void main(String[] args) {
        DeprecatedExample demo = new DeprecatedExample();

        // Gọi phương thức cũ (sẽ có cảnh báo compile-time)
        demo.oldMethod();

        // Gọi phương thức mới
        demo.newMethod();
    }
}
