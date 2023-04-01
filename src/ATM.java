import java.util.Scanner;

public class ATM {
    public ATM(float balance, int pin) {
        this.balance = balance;
        this.pin = pin;
    }

    ATM(){

    }
    float balance;
    int pin = 2222;


    public void checkPin(){
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();
        if (enteredPin==pin){
            menu();
        }else {
            System.out.println("Enter a Valid Pin");
        }
    }

    public  void menu() {
        System.out.println("Enter Your Choice");
        System.out.println("1 : Check your A/C Balance");
        System.out.println("2 :Withdraw Money");
        System.out.println("3 : Deposit Money");
        System.out.println("4 : Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        switch (opt){
            case 1 -> {
                checkBalance();

            }

            case 2 -> {
                withdrawMoney();
                break;
            }

            case 3 -> {
                depositMoney();

            }

            case 4 -> {
                exitProgram();

            }

            default -> System.out.println("Enter a Valid Choice");


        }
    }

    private void exitProgram() {
    }

    private void depositMoney() {
        System.out.println("Enter the Amount to Deposit");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        balance = balance + amount;
        System.out.println("Money Deposit Successfully");
        menu();
    }

    private void withdrawMoney() {
        System.out.println("Enter amount to withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount>balance){
            System.out.println("Insufficient Fund");
        }else {
            balance = balance-amount;
            System.out.println("Money withdraw Successfully");
            menu();
        }
    }

    private void checkBalance() {
        System.out.println("Balance : " + balance);
        menu();

    }

}
