class Book {
    String title;
    String author;

    Book() // Defailt Constructor
    {
        this.title = " Unknown Title";
        this.author = "Unknown Author";
    }

    void display() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
    }

    public static void main(String[] args) {
        Book bk = new Book();
        bk.display();
    }
}
