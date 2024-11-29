import java.util.Scanner;

public class SalesPerson {
    private String id;
    private String name;
    private double grossSales;
    private double commissionRate;

    public SalesPerson(String id, String name) {
        this.id = id;
        this.name = name;
        this.grossSales = 0.0; // 初始銷售金額為0
        this.commissionRate = 0.0; // 初始獎金比例為0
    }

    // Getter 方法：獲取業務員的編號
    public String getId() {
        return this.id;
    }

    // Getter 方法：獲取業務員的姓名
    public String getName() {
        return this.name;
    }

    // 設置銷售金額，檢查輸入的銷售金額是否為正數
    public void setGrossSales(double grossSales) {
        if (grossSales >= 0) {
            this.grossSales = grossSales;
        } else {
            throw new IllegalArgumentException("輸入錯誤！銷售金額必須為正數！");
        }
    }

    // 設置獎金比例，檢查獎金比例是否在 0 到 1 之間
    public void setCommissionRate(double commissionRate) {
        if (commissionRate >= 0 && commissionRate <= 1) {
            this.commissionRate = commissionRate;
        } else {
            throw new IllegalArgumentException("輸入錯誤！獎金比例必須在 0 到 1 之間！");
        }
    }

    // 計算薪資：銷售金額 * 獎金比例
    public double salary() {
        return this.grossSales * this.commissionRate;
    }

    // 覆寫 toString() 方法，格式化輸出業務員資料
    public String toString() {
        return String.format("業務員編號：%s%n業務員姓名：%s%n銷售金額：%.1f%n獎金比例：%.2f%n薪資：%.1f%n",
                this.id, this.name, this.grossSales, this.commissionRate, salary());
    }
}