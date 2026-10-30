package pa_practice;
import java.util.Scanner;
class Notebook {
    private int totalCount;
    private int rentalCount;

    public Notebook() {
        this.totalCount = 5;
        this.rentalCount = 0;
    }

    public void rentNotebook(int quantity) {
        if (quantity > 0 && quantity < (totalCount - rentalCount)) {
            rentalCount += quantity;
        } else {
            System.out.println("노트북을 대여할 수 없습니다.");
        }
    }

    public void returnNotebook(int quantity) {
        if (quantity > 0 && quantity < rentalCount) {
            rentalCount -= quantity;
        } else {
            System.out.println("노트북을 반납할 수 없습니다.");
        }
    }

    public void showInfo() {
        System.out.println("==노트북 대여 현황");
        System.out.println("전체 노트북: " + totalCount + "대");
        System.out.println("대여 중: " + rentalCount + "대");
        System.out.println("남은 노트북 수: " + (totalCount - rentalCount) + "대");
    }
}
class NotebookManager {
    private Notebook notebook;
    private static NotebookManager instance = new NotebookManager();

    private NotebookManager() {
        notebook = new Notebook();
    }

    public static NotebookManager getInstance() {
        return instance;
    }

    public void rentNotebook(int quantity) {
        notebook.rentNotebook(quantity);
    }

    public void returnNotebook(int quantity) {
        notebook.returnNotebook(quantity);
    }

    public void showInfo() {
        notebook.showInfo();
    }
}
public class problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NotebookManager manager = NotebookManager.getInstance();

        int rentQu = sc.nextInt();
        int returnQu = sc.nextInt();

        manager.rentNotebook(rentQu);
        manager.returnNotebook(returnQu);

        manager.showInfo();
    }
}
