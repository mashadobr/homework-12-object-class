public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Николай", "Гололь");

        Book book1 = new Book("Мертвые души", author1,  1842);
        System.out.println();
        System.out.println("book1.getAuthor() = " + book1.getAuthor());
        System.out.println("book1.getName() = " + book1.getName());
        System.out.println("book1.getYearPublication() = " + book1.getYearPublication());

        Author author2 = new Author("Оскар", "Уайлд");
        Book book2 = new Book("Портрет Дориана Грея", author2, 1891);
        System.out.println("book2.getName() = " + book2.getName());
        System.out.println("book2.getAuthor() = " + book2.getAuthor());
        System.out.println("book2.getYearPublication() = " + book2.getYearPublication());
        book2.setYearPublication(1890);
        System.out.println("book2.getYearPublication() = " + book2.getYearPublication());
    }

}