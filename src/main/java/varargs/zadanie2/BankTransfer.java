package varargs.zadanie2;

public class BankTransfer {

    private double ammount;
    private String accountNumber;
    private TransferDirection direction;


    public BankTransfer(double ammount, String accountNumber, TransferDirection direction) {
        this.ammount = ammount;
        this.accountNumber = accountNumber;
        this.direction = direction;
    }

    public BankTransfer(double ammount, String accountNumber) {
        this.ammount = ammount;
        this.accountNumber = accountNumber;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
