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
}
