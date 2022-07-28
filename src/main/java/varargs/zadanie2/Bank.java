package varargs.zadanie2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bank {

    // metody:
    //
    //    przelew wychodzący(kwota, numer konta) (tworzy nowy transfer, dodaje do listy)
    //    przelew przychodzący(kwota, numer konta) (tworzy nowy transfer, dodaje do listy)
    //    dodaj konto bankowe (metoda zwraca nowy, wygenerowany numer konta) (string)


    private final ExecutorService pulaWatkow = Executors.newFixedThreadPool(5);

    private Map<String, BankAccount> bankAccounts = new HashMap<>();
    private List<BankTransfer> transfersList = new ArrayList<>();

    public void transferOut (final double ammount, String accountNumber) {
        BankTransfer transfer = new BankTransfer(ammount, accountNumber, TransferDirection.OUTCOME);
        transfersList.add(transfer);

        pulaWatkow.submit(() -> {
           BankAccount account = bankAccounts.get(accountNumber);
           account.transferOut(ammount);

        });
    }

    public void transferIn (final double ammount, String accountNumber) {
        BankTransfer transfer = new BankTransfer(ammount, accountNumber, TransferDirection.INCOME);
        transfersList.add(transfer);

        pulaWatkow.submit(() -> {
            BankAccount account = bankAccounts.get(accountNumber);
            account.transferIn(ammount);
        });
    }

    public void checkAccountState(String accountNumber) {
        BankAccount account = bankAccounts.get(accountNumber);
        System.out.println(account.getState());
    }

    public String createBankAccount () {
      //  String generatedBankAccountNumber = UUID.randomUUID().toString();
        // BankAccount bankAccount = new BankAccount(generatedBankAccountNumber);

        BankAccount bankAccount = new BankAccount();
        bankAccounts.put(bankAccount.getBankAccountNumber(), bankAccount);
        return bankAccount.getBankAccountNumber();

    }
}
