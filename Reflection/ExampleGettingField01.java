//Example Getting Field 01
class Subject {
    private String name = "OOP";
}

public class ExampleGettingField01 {
    public static void main(String[] args) throws Exception {
        Subject p = new Subject();
        var field = p.getClass().getDeclaredField("name");
        field.setAccessible(true);
        System.out.println("Tên: " + field.get(p)); // Tên: OOP
    }
}
