package BuilderPattern;

public class Student {
    private String name;
    private int age;
    private String course;
    private int marks;
    private String country;

    public static class Builder {
        private Student s = new Student();

        public Builder name(String name) { s.name = name; return this; }
        public Builder age(int age) { s.age = age; return this; }
        public Builder course(String course) { s.course = course; return this; }
        public Builder marks(int marks) { s.marks = marks; return this; }
        public Builder country(String country) { s.country = country; return this; }

        public Student build() { return s; }
    }

    public static Builder builder() {
        return new Builder();
    }

    public static void main(String[] args) {
        Student student = Student.builder()
        .name("Rahul")
        .age(22)
        .course("CS")
        .marks(85)
        .country(null)
        .build();

        System.out.println("Name: " + student.name);
        System.out.println("Age: " + student.age);
        System.out.println("Course: " + student.course);
        System.out.println("Marks: " + student.marks);
        System.out.println("Country: " + student.country);

    }
}
