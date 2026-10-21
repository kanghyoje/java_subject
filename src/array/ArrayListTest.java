package array;
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<Book>();

        bookList.add(new Book("태백산맥", "조정래"));
        bookList.add(new Book("연을 쫒는 아이", "할레드 호세이니"));
        bookList.add(new Book("데미안", "헤르만 헤세"));
        bookList.add(new Book("토지", "박경리"));
        bookList.add(new Book("어린왕자", "생텍쥐페리"));

//        for (int i = 0; i < bookList.size(); i++) {
//            bookList.get(i).showInfo();
//        }
        for (Book book : bookList) {
            book.showInfo();
        }

        bookList.remove(2);
        System.out.println("세번째 항목 제거 후");
        for (Book book : bookList) {
            book.showInfo();
        }

        bookList.removeAll(bookList);
        System.out.println("항목 모두 제거 후");
        for (Book book : bookList) {
            book.showInfo();
        }

        System.out.println("배열이 비었는지 확인 : " + bookList.isEmpty());

    }
}
