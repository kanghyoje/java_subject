package array;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        Book[] booksCopy = new Book[5];

        books[0] = new Book("말포이와 해리포터의 비밀 연애", "ts말포이");
        books[1] = new Book("부자", "강효제");
        books[2] = new Book("문워크", "마이클 잭슨");
        books[3] = new Book("덩크는 어떻게 하나요?", "마이클 조던");
        books[4] = new Book("가오 사는법", "류상준");

        System.out.println("books");
        for (int i = 0; i < books.length; i++) {
            books[i].showInfo();
        }

        for (int i = 0; i < booksCopy.length; i++) {
            booksCopy[i] = new Book();
        }

        for (int i = 0; i < booksCopy.length;i++) {
            booksCopy[i].setBookTitle(books[i].getBookTitle());
            booksCopy[i].setAuthor(books[i].getAuthor());
        }

        System.out.println("booksCopy");
        for (int i = 0; i < booksCopy.length; i++) {
            booksCopy[i].showInfo();
        }


    }
}
