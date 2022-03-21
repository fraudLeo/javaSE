public class CreditAccount extends Account{
    private double credit;

    public CreditAccount(String actno, double balance, double credit) {
        super(actno, balance);
        this.credit = credit;
    }

    public CreditAccount() {
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
