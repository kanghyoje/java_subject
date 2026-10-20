package array;

public class BookArray2 {
    public static void main(String[] args) {
        Book book1 = new Book("말포이와 해리포터의 비밀 연애", "ts말포이");
        Book book2 = new Book("부자", "강효제");
        Book book3 = new Book("문워크", "마이클 잭슨");
        Book book4 = new Book("덩크는 어떻게 하나요?", "마이클 조던");
        Book book5 = new Book("가오 사는법", "류상준");

        book1.showInfo();
        book2.showInfo();
        book3.showInfo();
        book4.showInfo();
        book5.showInfo();
    }
}
