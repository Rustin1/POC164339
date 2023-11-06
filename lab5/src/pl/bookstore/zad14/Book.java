package pl.bookstore.zad14;

class Book {
    String title;
    String author;
    int publicationYear;
    String publisher;
    int numberOfPages;

    public Book(String title, String author, int publicationYear, String publisher, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
    }
    // getters

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
    //setters

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public String showInformation(){
        return this.title + ", Autor: " + this.author + ", Rok wydania: " + this.publicationYear + ", Wydawnictwo: " + this.publisher + ", Liczba stron: " + this.numberOfPages;
    }
}



