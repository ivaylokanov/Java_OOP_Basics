package pr01_bankAccountTestClient;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {

    private static int id;
    private static double amount;
    private static HashMap<Integer, BankAccountInterface> accounts = null;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        accounts = new HashMap<>();
        String line = "";

        while (!"End".equals(line = reader.readLine())) {
            String[] comArgs = line.split("\\s+");
            String command = comArgs[0];
            switch (command) {
                case "Create":
                    executeCreate(comArgs, accounts);
                    break;
                case "Deposit":
                    executeDeposit(comArgs);
                    break;
                case "Withdraw":
                    executeWithdraw(comArgs);
                    break;
                case "Print":
                    executePrint(comArgs);
                    break;
                default:
                    break;
            }
        }
    }

    private static void executePrint(String[] comArgs) {
        id = Integer.valueOf(comArgs[1]);
        if (checkId(id)) {
            System.out.println(accounts.get(id));
        } else {
            System.out.printf("Account does not exist%n");
        }
    }

    private static void executeWithdraw(String[] comArgs) {
        id = Integer.valueOf(comArgs[1]);
        amount = Double.valueOf(comArgs[2]);
        if (checkId(id)) {
            accounts.get(id).withdraw(amount);
        } else {
            System.out.printf("Account does not exist%n");
        }
    }

    private static void executeDeposit(String[] comArgs) {
        id = Integer.valueOf(comArgs[1]);
        amount = Double.valueOf(comArgs[2]);

        if (checkId(id)) {
            accounts.get(id).deposit(amount);
        } else {
            System.out.printf("Account does not exist%n");
        }
    }

    private static boolean checkId(int id) {
        if (accounts.containsKey(id)) {
            return true;
        } else {
            return false;
        }
    }

    private static void executeCreate(String[] comArgs, HashMap<Integer, BankAccountInterface> accounts) {
        id = Integer.valueOf(comArgs[1]);
        if (!accounts.containsKey(id)) {
            BankAccountInterface bankAccount = new BankAccount(id);
            accounts.put(id, bankAccount);
        } else {
            System.out.printf("Account already exists%n");
        }
    }
}
