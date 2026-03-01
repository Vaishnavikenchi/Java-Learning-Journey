class Book{
    String title;
    String author;
    double price;

    Book()
    {
        title="Unknown";
        author="Unknown";
        price=0.0;
    }
    Book(String title,String author,double price)
    {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void display()
    {
        System.out.println(title+ " "+author+" "+price);
    }
}
    
class ConstructorProblem2
{
    public static void main(String args[]){
        Book b1=new Book();
        b1.display();

        Book b2=new Book("Java Basics","James",450);
        b2.display();
    }
}