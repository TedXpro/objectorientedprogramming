package code.src.startingoutwithjava.chapter6asecondlookatclass.aggregation;

public class TextBook {
    private String title; // holds the name of the title.
    private String author;// holds the name of the author.
    private String publisher;// holds the name of the publisher

    /**
     * The constructor is used to assign the fields.
     * @param title holds the title of the book.
     * @param author holds the name of the author of the book,
     * @param publisher holds the name of the publisher of the book.
     */
    public TextBook(String title, String author, String publisher){
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    /**
     * is a Copy Constructor used to copy the fields of
     * the parameter.
     * @param book2 holds the object of the one being copied
     * from.
     */
    public TextBook(TextBook book2){
        title = book2.title;
        author = book2.author;
        publisher = book2.publisher;
    }

    /**
     * The Set method is used to set the fields.
     * 
     * @param title     holds the title.
     * @param author    holds the author.
     * @param publisher holds the publisher.
     */
    public void set(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String toString() {
        String str;
        str = "TextBook Title: " + title +
                "\nText Book Author: " + author +
                "\nText Book Publisher: " + publisher;
        return str;
    }
}
