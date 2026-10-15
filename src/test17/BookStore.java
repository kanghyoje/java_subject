package test17;

public class BookStore {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();

        book1.setTitle("연을 쫒는 아이");
        book1.setAuthor("할레드 호세이니");
        book1.setPrice(18000);

        book2.setTitle("오디세이아");
        book2.setAuthor("호메로스");
        book2.setPrice(27000);

        book1.getInfo();
        book2.getInfo();
    }
}
