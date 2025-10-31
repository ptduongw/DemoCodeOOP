//VD1
class SuperExample {
    public void methodOverride() {
        System.out.println("Nguyen Van A");
    }
}

class Example extends SuperExample {
    @Override // Annotation báo rằng phương thức này ghi đè phương thức cùng tên ở lớp cha
    public void methodOverride() {
        System.out.println("Nguyen Van B");
    }
}

// Lớp chính để chạy chương trình
public class VD1 {
    public static void main(String[] args) {
        Example ex = new Example();  // Tạo đối tượng lớp con
        ex.methodOverride();         // Gọi phương thức bị ghi đè
    }
}
