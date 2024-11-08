import java.util.Scanner;

public class SalesDepartment {
    public  static void main(String args[]) {
        SalesPerson[] salesTeam = new SalesPerson[3];
        SalesPerson sales1 = new SalesPerson("SE111", "林俊傑");
        SalesPerson sales2 = new SalesPerson("SE222", "張佳豪");
        SalesPerson sales3 = new SalesPerson("SE333", "劉威廷");
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
                    case 1: // 設定銷售金額
                        targetSales = selectedSales(salesTeam); // 查找目標業務員
                        if (targetSales != null) {
                            System.out.print("請輸入銷售金額： ");
                            double sales = input.nextDouble();
                            targetSales.setGrossSales(sales); // 設定銷售金額
                        }
                        break;

                    case 2: // 設定獎金比例
                        targetSales = selectedSales(salesTeam); // 查找目標業務員
                        if (targetSales != null) {
                            System.out.print("請輸入獎金比例： ");
                            double rate = input.nextDouble();
                            targetSales.setCommissionRate(rate); // 設定獎金比例
                        }
                        break;

                    case 3: // 查詢薪資
                        targetSales = selectedSales(salesTeam); // 查找目標業務員
                        if (targetSales != null) {
                            System.out.println(targetSales); // 顯示業務員的資料，包括薪資
                        }
                        break;

                    default:
                        System.out.println("請輸入有效的選項 (1~3)");
                        break;
                }
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage()); // 顯示異常訊息
            }
            menu(); // 顯示選單
        }
        for (SalesPerson s : salesTeam)
            System.out.print(s.toString()); // 顯示所有業務員資料
    }

    public static SalesPerson selectedSales(SalesPerson[] salesTeam) {
        Scanner input = new Scanner(System.in);
        System.out.print("請輸入編號： ");
        String salesID = input.next();

        // 從salesTeam陣列中尋找與輸入salesID相同的業務員物件
        for (SalesPerson salesPerson : salesTeam) {
            if (salesPerson.getId().equals(salesID)) { // 如果找到匹配的編號
                return salesPerson; // 返回該業務員物件
            }
        }

        // 如果未找到對應的編號，提示錯誤並返回null
        System.out.println("編號輸入錯誤，請重新輸入有效的業務員編號！");
        return null;
    }

    public static void menu() {
        System.out.println("\n\nROC股份有限公司：");
        System.out.print("1.設定銷售金額\n2.設定獎金比例\n3.薪資查詢\n請輸入： ");
    }
}