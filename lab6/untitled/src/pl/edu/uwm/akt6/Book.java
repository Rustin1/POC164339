package pl.edu.uwm.akt6;

class Book {
    private String title;
    private int yearPublished;
    private double price;

    public Book(String title, int yearPublished, double price){
        this.title = title;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    //getters

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public double getPrice() {
        return price;
}
    //setters


    public void setTitle(String title) {
        this.title = title;
}
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Tytuł: " + title + ", rok wydawania " + yearPublished + ", cena: " + price +".";
    }
}