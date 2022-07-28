package varargs.zadanie2;


// W Main :
//stwórz jeden obiekt bank. Dodaj jedno konto bankowe.
// Następnie przelej na konto 1000zł. Następnie przelej z konta 1200 zł

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        String bankAccountNumber = bank.createBankAccount();
        System.out.println("Created bank with account number: " + bankAccountNumber);

        for (int i = 0; i < 100000; i++) {
            bank.transferIn(5, bankAccountNumber);
            bank.transferOut(5, bankAccountNumber);
        }

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String word = scanner.nextLine();
            //ignorujemy word, bo chcemy tylko mieć możliwość
            // sprawdzenia stanu konta po kliknięciu enter
            bank.checkAccountState(bankAccountNumber);
        }
    }
}
