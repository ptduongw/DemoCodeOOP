//Example Getting Field 02
class Student {
    private int age = 18;
}

public class ExampleGettingField02 {
    public static void main(String[] args) throws Exception {
        Student s = new Student();
        var f = s.getClass().getDeclaredField("age");
        f.setAccessible(true);
        f.set(s, 22);
        System.out.println("Tuổi mới: " + f.get(s)); // Tuổi mới: 22
    }
}
