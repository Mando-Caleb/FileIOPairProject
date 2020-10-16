package util;

import java.util.Scanner;

public class Input {
    protected Scanner input;

    public Input(){
        this.input = new Scanner(System.in);
    }

    public int getInt() {
        System.out.println("\"Enter an option (1, 2, 3, 4 or 5):\"");
        int num;

        try {
            String userInput = input.nextLine();
            num = Integer.parseInt(userInput);
        } catch (RuntimeException rex) {
            System.err.println("You must enter an option between 1-5");
            rex.printStackTrace();
            return getInt();
        }
        if (num >= 1 && num <= 5) {
            return num;
        } else {
            System.out.println("Invalid Number.");
            return getInt();
        }
    }
}
