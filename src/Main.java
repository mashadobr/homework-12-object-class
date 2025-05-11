public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Николай", "Гололь");

        Book book1 = new Book("Мертвые души", author1, 1842);
        System.out.println();
        Author author2 = new Author("Оскар", "Уайлд");
        Book book2 = new Book("Портрет Дориана Грея", author2, 1891);
        System.out.println(book2);
        book2.setYearPublication(1890);
        System.out.println(book1);
        System.out.println(book2);
    }

}