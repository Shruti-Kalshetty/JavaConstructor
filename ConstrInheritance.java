class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Employee Name: " + name);
    }
}

class Worker extends Employee {
    int age;

    Worker(String name, int age) {
        super(name);
        this.age = age;
    }

    void displayDetails() {
        display();
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Worker wr = new Worker("Avnish", 30);
        wr.displayDetails();
    }
}
