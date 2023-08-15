package designpatterns.prototype;

public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry) {
        Student aprBatchStudent = new Student();
        aprBatchStudent.setAverageBatchPsp(89);
        aprBatchStudent.setBatch("April 21");

        studentRegistry.register("april21Batch", aprBatchStudent);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student siddharth = StudentRegistry.get("april21Batch").clone();
        siddharth.setAge(21);
        siddharth.setName("Siddharth");
        siddharth.setPsp(91);
    }
}
