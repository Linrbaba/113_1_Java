import java.util.Scanner;

public class SalesDepartment {
    public  static void main(String args[]) {
        SalesPerson[] salesTeam = new SalesPerson[3];
        SalesPerson sales1 = new SalesPerson("SE111", "周柏睿");
        SalesPerson sales2 = new SalesPerson("SE222", "黃敬宇");
        SalesPerson sales3 = new SalesPerson("SE333", "吳嘉文");
        salesTeam[0] = sales1;
        salesTeam[1] = sales2;
        salesTeam[2] = sales3;
        operation(salesTeam);
    }

    public static void operation(SalesPerson[] salesTeam) {
        SalesPerson targetSales;
        Scanner input = new Scanner(System.in);
        menu();

        while (input.hasNext()) {
            int choice = input.nextInt();
            try {
                switch (choice) {
                    case 1: // 設定獎金比例
                        targetSales = selectedSales(salesTeam);
                        if (targetSales != null) {
                            System.out.print("請輸入獎金比例： ");
                            double rate = input.nextDouble();
                            targetSales.setCommissionRate(rate);
                            System.out.println("已設定獎金比例為：" + rate);
                        }
                        break;

                    case 2: // 新增訂單
                        targetSales = selectedSales(salesTeam);
                        if (targetSales != null) {
                            System.out.print("請輸入產品名稱： ");
                            String itemName = input.next();
                            System.out.print("請輸入產品單價： ");
                            double itemPrice = input.nextDouble();
                            System.out.print("請輸入產品數量： ");
                            int amount = input.nextInt();
                            targetSales.setOrderArray(itemName, itemPrice, amount);

                            // 顯示新增的訂單資訊
                            System.out.println("新增的訂單為：");
                            System.out.printf("產品名稱：%s 單價：%.1f 數量：%d%n", itemName, itemPrice, amount);
                        }
                        break;

                    case 3: // 薪資查詢
                        targetSales = selectedSales(salesTeam);
                        if (targetSales != null) {
                            System.out.println(targetSales); // 顯示業務員的資料，包括薪資
                        }
                        break;

                    case 4: // 訂單查詢
                        targetSales = selectedSales(salesTeam);
                        if (targetSales != null) {
                            System.out.println(targetSales.getOrders()); // 顯示所有訂單
                        }
                        break;

                    default:
                        System.out.println("請輸入有效的選項 (1~4)");
                        break;
                }
            } catch (IllegalArgumentException ex) {
                System.out.print(ex.getMessage());
            }
            menu(); // 顯示選單
        }
        for (SalesPerson s : salesTeam)
            System.out.print(s.toString());
    }

    public static SalesPerson selectedSales(SalesPerson[] salesTeam) {
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入編號： ");
        String salesID = input.next();

        // 從salesTeam陣列中尋找與輸入salesID相同的業務員物件
        for (SalesPerson salesPerson : salesTeam) {
            if (salesPerson.getId().equals(salesID)) {
                return salesPerson; // 返回該業務員物件
            }
        }

        System.out.println("編號輸入錯誤，請重新輸入有效的業務員編號！");
        return null;
    }

    public static void menu() {
        System.out.println("\n\nROC股份有限公司：");
        System.out.print("1.設定獎金比例\n2.新增訂單\n3.薪資查詢\n4.訂單查詢\n請輸入： ");
    }
}
