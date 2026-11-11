class Student {
    int studentId;
    String name;
    int age;

    void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.studentId = 101;
        s1.name = "Meghanadh";
        s1.age = 19;

        s2.studentId = 102;
        s2.name = "Surya";
        s2.age = 20;

        s3.studentId = 103;
        s3.name = "Rahul";
        s3.age = 18;

        s1.display();
        s2.display();
        s3.display();
    }
}