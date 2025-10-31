//Example Getting Method 02
class MathTool {
    private int add(int a, int b) {
        return a + b;
    }
}

public class ExampleGettingMethod02 {
    public static void main(String[] args) throws Exception {
        MathTool tool = new MathTool();
        var m = tool.getClass().getDeclaredMethod("add", int.class, int.class);
        m.setAccessible(true);
        System.out.println(m.invoke(tool, 3, 5)); // 8
    }
}
