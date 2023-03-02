package lt.code.academy;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import lt.code.academy.client.MongoObjectClientProvider;
import lt.code.academy.data.BankAccount;
import lt.code.academy.data.User;
import static com.mongodb.client.model.Filters.*;

import java.util.List;
import java.util.Scanner;

public class LithuanianBankApp {

    private final MongoCollection<User> userCollection;
    private final MongoCollection<BankAccount> bankAccountCollection;

    public LithuanianBankApp(MongoCollection<User> userCollection, MongoCollection<BankAccount> bankAccountCollection) {
        this.userCollection = userCollection;
        this.bankAccountCollection = bankAccountCollection;
    }

    public static void main(String[] args) {
        MongoClient client = MongoObjectClientProvider.getClient();
        MongoDatabase database = client.getDatabase("bank");
        LithuanianBankApp lithuanianBankApp = new LithuanianBankApp(database.getCollection("users", User.class), database.getCollection("bankAccounts", BankAccount.class));

        lithuanianBankApp.createBankAccounts();
        Scanner sc = new Scanner(System.in);
        String userAction;
        do {
            lithuanianBankApp.menu();
            userAction = sc.nextLine();
            lithuanianBankApp.userSelection(sc, userAction);
        } while(!userAction.equals("5"));

    }

    private void userSelection(Scanner scanner, String action){
        switch (action) {
            case "1" -> registration(scanner);
            case "2" -> transferMoney();
            case "3" -> checkYourBalance();
            case "4" -> informationAboutTransfer();
            case "5" -> System.out.println("Jus ka tik issiregistravote");
            default -> System.out.println("Atidziau rinkites komandas, tokio veiksmo nera");
        }
    }

    private void registration(Scanner scanner) {

       User user;
        String personalID;

//        do{
//            System.out.println("Iveskite asmens koda: ");
//            personalID = scanner.nextLine();
//            user = userCollection.find(eq("personalID", personalID));
//            if(user != null) {
//                System.out.println("Toks vartotojas jau priregistruotas");
//            }
//        }while(user != null);


        System.out.println("Iveskite varda: ");
        String name = scanner.nextLine();
        System.out.println("Iveskite pavarde: ");
        String surname = scanner.nextLine();
        System.out.println("Iveskite asmens koda");
        String id = scanner.nextLine();

        user = new User(null, id, name, surname, null, null);
        userCollection.insertOne(user);
    }

    private void transferMoney(String sender, String receiver, double amount){


    }

    private void checkYourBalance(){}

    private void informationAboutTransfer(){}

    private void menu(){
        System.out.println("""
                1. Vartotojo registracija
                2. Siusti pinigus
                3. Perziureti saskaitos likuti
                4. Informacija apie padaryta pavedima
                5. Issiregistruoti
                """);
    }

    private void createBankAccounts() {

        List<BankAccount> bankAccounts = List.of(new BankAccount(null, "VildaBank", "VB123456789", 1000000.99, null),
                new BankAccount(null, "VildaBank", "VB1987654321", 670000.99, null),
                new BankAccount(null, "VildaBank", "VB1122334456", 1090900000.99, null),
                new BankAccount(null, "VildaBank", "VB9988776555", 234000.99, null));

        bankAccountCollection.insertMany(bankAccounts);
    }

    private void createUsers() {
        List<User> users = List.of(new User(null, "49708273333", "Useryte", "Userianovaite", null, null),
                new User(null, "49708132222", "Vartotojas", "Vartotojkuaskas", null, null));

        userCollection.insertMany(users);



    }
}
