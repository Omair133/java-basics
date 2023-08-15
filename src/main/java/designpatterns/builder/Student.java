package designpatterns.builder;

public class Student {
    private int studentId;
    private String name;
    private String rollNo;

    private Student(){}

    static class Builder {
        private int studentId;
        private String name;
        private String rollNo;

        public Builder setStudentId(int studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setRollNo(String rollNo) {
            this.rollNo = rollNo;
            return this;
        }

        public Student build() {
            Student student = new Student();
            student.studentId = this.studentId;
            student.rollNo = this.rollNo;
            student.name = this.name;
            return student;
        }
    }

    public static Builder getBuilder() {
        return new Builder();
    }
}
