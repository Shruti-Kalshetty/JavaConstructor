class Rectangle {
    int length;
    int width;


    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    
    Rectangle(int side) {
        this.length = side;
        this.width = side;
    }

    
    int area() {
        return length * width;
    }

    public static void main(String[] args) {
        
        Rectangle rect1 = new Rectangle(5, 10);
        Rectangle square = new Rectangle(4);

        System.out.println("Area of rectangle: " + rect1.area());
        System.out.println("Area of square: " + square.area());
    }
}

