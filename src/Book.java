import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int yearPublication;
     public Book(String name, Author autor, int yearPublication){
         this.name = name;
         this.author = autor;
         this.yearPublication = yearPublication;
     }
public String getName(){
         return this.name;
}
public Author getAuthor(){
        return  this.author;
}
public  int getYearPublication(){
         return this.yearPublication;
}
public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, yearPublication);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author +
                ", yearPublication=" + yearPublication +
                '}';
    }
}
