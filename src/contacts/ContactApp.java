package contacts;
import util.Input;

public class ContactApp {
    public static void main(String[] args) {
        ContactMethods.printMenu();
        Input input = new Input();
        int userInput = input.getInt();
        System.out.println();
        System.out.println(userInput);

    }
}
