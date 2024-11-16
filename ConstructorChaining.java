class Student {
    String name;
    int rollNo;

    Student(String name) {
        this.name = name;
    }

    Student(String name, int rollNo) {
        this(name);
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Student name : " + name);
        System.out.println("Student rollNum : " + rollNo);
    }

    public static void main(String[] args) {
        Student std = new Student("Avnish", 10);
        std.display();
    }

}
