package task;

public class BankAccount {
        private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void setBalance(double balance) {
            this.balance = balance;
        }
        public double getBalance() {
            return this.balance;
        }
        public void deposit_funds(double deposit) {
            this.balance +=deposit;
            System.out.println("Twój obecny balans to " + this.balance);
        }
        public void withdraw_funds(double funds) {
        double currentDeposit=0;
            if (funds > this.balance) {
                System.out.println("Niewystarczająca ilość środków na koncie. Twój balans to " +
                        this.balance);
            } else {
                currentDeposit = this.balance - funds;
                System.out.println("Twój obecny balans to " + currentDeposit);
            }

        }
    }

