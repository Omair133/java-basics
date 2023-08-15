package designpatterns.prototype;

public class Student implements Prototype<Student> {
    private int age;
    private String name;
    private String batch;
    private int averageBatchPsp;
    private int psp;

    public Student() {}
    public Student(Student student) {
        this.age = student.age;
        this.name = student.name;
        this.batch = student.batch;
        this.averageBatchPsp = student.averageBatchPsp;
        this.psp = student.psp;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAverageBatchPsp(int averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
