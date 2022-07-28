package varargs.zadanie2;

import java.util.UUID;

public class BankAccount {
    private final Object lock = new Object();


    private double state;
    private String bankAccountNumber;

    public BankAccount() {
        this.bankAccountNumber = UUID.randomUUID().toString();
        this.state = 0d;
    }

    public double getState() {
        return state;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    // lock, mutex, synchronizer, semaphore
    public void transferIn (double amount) {
        synchronized (this) {
            this.state = this.state + amount;
        }
    }
// może być też wersja skrócona, tj.
 //   public synchronized void transferOut (double amount) {
  // this.state = this.state + amount;

    public void transferOut (double amount) {
            synchronized(this) {
        this. state = this.state - amount;
    }
}
}
