package designpatterns.builder;

public class Client {
    public static void main(String[] args) {
        Student student = Student.getBuilder().setStudentId(12).setName("Test").setRollNo("124").build();
    }
}
