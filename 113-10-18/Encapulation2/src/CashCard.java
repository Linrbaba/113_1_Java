class CashCard {
    String number;
    int balance;
    int bonus;

    CashCard(String number, int balance, int bonus) {
        this.number = number;
        this.balance = balance;
        this.bonus = bonus;
    }

    void store(int money){
        if (money > 0){
            this.balance += money;
            if (money >= 1000){
                this.bonus += money/1000;
            }
        }
        else{
            System.out.println("儲值金額為負，來亂的!");
        }
    }

    void charge(int money){
        if (money > 0){
            if (this.balance >= money){
                this.balance -= money;
            }
            else{
                System.out.println("餘額不足!");
            }
        }
        else {
            System.out.println("扣款金額為負，來亂的!");
        }
    }

    int exchange(int bonus){
        if (bonus > 0){
            this.bonus -= bonus;

        }
        return this.bonus;
    }
}