package pr02_staticIdAndInterestRate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        Map<Integer, BankAccount> accounts = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String command;

        while (!"End".equals(command = reader.readLine())) {
            String[] commandArgs = command.split("\\s+");
            String commandType = commandArgs[0];

            switch (commandType) {
                case "Create":
                    executeCreateCommand(commandArgs, accounts);
                    break;
                case "Deposit":
                    executeDepositCommand(commandArgs, accounts);
                    break;
                case "SetInterest":
                    executeSetInterestCommand(commandArgs, accounts);
                    break;
                case "GetInterest":
                    executeGetInterestCommand(commandArgs, accounts);
                    break;
            }
        }
    }

    private static void executeGetInterestCommand(String[] commandArgs, Map<Integer, BankAccount> accounts) {
        int id = Integer.parseInt(commandArgs[1]);

        if (!accounts.containsKey(id)) {
            System.out.println("Account does not exist");
            return;
        }

        int years = Integer.parseInt(commandArgs[2]);
        BankAccount account = accounts.get(id);
        double interest = account.getInterest(years);
        System.out.printf("%.2f%n", interest);
    }

    private static void executeSetInterestCommand(String[] commandArgs, Map<Integer, BankAccount> accounts) {
        double interestRate = Double.parseDouble(commandArgs[1]);
        BankAccount.setInterestRate(interestRate);
    }

    private static void executeCreateCommand(String[] commandArgs, Map<Integer, BankAccount> accounts) {

        BankAccount account = new BankAccount();
        accounts.put(account.getId(), account);
        System.out.printf("Account %s created%n", account);
    }

    private static void executeDepositCommand(String[] commandArgs, Map<Integer, BankAccount> accounts) {
        int id = Integer.parseInt(commandArgs[1]);

        if (!accounts.containsKey(id)) {
            System.out.println("Account does not exist");
            return;
        }

        double depositAmount = Double.parseDouble(commandArgs[2]);
        BankAccount account = accounts.get(id);
        account.deposit(depositAmount);

        System.out.printf("Deposited %.0f to %s%n", depositAmount, account);
    }
}
