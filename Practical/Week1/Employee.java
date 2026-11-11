class Employee {
    int empId;
    String name;
    double salary;

    Employee(int id, String n, double s) {
        empId = id;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println();
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Meghanadh", 25000);
        Employee e2 = new Employee(102, "Surya", 30000);
        Employee e3 = new Employee(103, "Rahul", 35000);

        e1.display();
        e2.display();
        e3.display();
    }
}