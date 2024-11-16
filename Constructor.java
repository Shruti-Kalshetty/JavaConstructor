class Car {
    String model;
    int year;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void display() {
        System.out.println("Car Model is: " + model);
        System.out.println("Car Year: " + year);
    }

    public static void main(String[] args) {
        Car myCar = new Car("TATA Scoda", 2024);
        myCar.display();
    }
}
