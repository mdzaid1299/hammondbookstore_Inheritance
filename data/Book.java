package data;

public class Book extends Authur {
    private long ISBN;
    private String title;
    private String description;
    private double price;

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public long getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void display(){
        System.out.println("isbnNo = " + ISBN);
        System.out.println("title = " + title);
        System.out.println("description = " + description);
        System.out.println("price = " + price);
    }
}
