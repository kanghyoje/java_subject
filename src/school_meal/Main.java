package school_meal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        WasteManager wM = new WasteManager();

        System.out.print("등록할 읍식 수를 입력하세요: ");
        int count = sc.nextInt();

        for (int i = 0; i < count ; i++) {
            System.out.print("음식 종류를 입력하세요 (1: 밥류, 2: 반찬류) : ");
            int style = sc.nextInt();
            sc.nextLine();
            System.out.print("음식명을 입력하세요: ");
            String name = sc.nextLine();
            System.out.print("배식량(g)을 입력하세요: ");
            double servedGrams = sc.nextDouble();
            System.out.print("잔반량(g)을 입력하세요: ");
            double wasteGrams = sc.nextDouble();

            if (style == 1) {
                RiceFood rF = new RiceFood(name,servedGrams,wasteGrams);
                wM.addFood(rF);
            } else if (style == 2) {
                SideDish sD = new SideDish(name,servedGrams,wasteGrams);
                wM.addFood(sD);
            }
        }

        System.out.println("생성된 음식 객체 수: "+Food.getFoodCount()+"\n");
        wM.printReport();
    }
}
