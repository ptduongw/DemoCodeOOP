//Example Getting Method 01
class Hello {
    private void sayHi() {
        System.out.println("Xin chào!");
    }
}

public class ExampleGettingMethod01 {
    public static void main(String[] args) throws Exception {
        Hello h = new Hello();
        var m = h.getClass().getDeclaredMethod("sayHi");
        m.setAccessible(true);
        m.invoke(h); // Xin chào!
    }
}
