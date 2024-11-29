public class SalesPerson {
    private String id;
    private String name;
    private double grossSales;
    private double commissionRate;

    public SalesPerson(String id, String name) {
        this(id, name, 0.0, 0.0); // 呼叫下一個建構子
    }

    public SalesPerson(String id, String name, double grossSales, double commissionRate) {
        this.id = id;
        this.name = name;
        setGrossSales(grossSales);        // 呼叫set方法檢查銷售金額
        setCommissionRate(commissionRate); // 呼叫set方法檢查獎金比例
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setGrossSales(double grossSales) {
        if (grossSales < 0) {
            throw new IllegalArgumentException("銷售金額必須為正值！");
        }
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate < 0 || commissionRate > 1) {
            throw new IllegalArgumentException("獎金比例必須在0到1之間！");
        }
        this.commissionRate = commissionRate;
    }

    public double salary() {
        return grossSales * commissionRate;
    }

    public String toString() {
        // 修改後的輸出格式
        return String.format("業務員編號：%s%n業務員姓名：%s%n銷售金額：%.1f%n獎金比例：%.2f %n薪資：%.1f",
                this.id, this.name, this.grossSales, this.commissionRate, salary());
    }
}