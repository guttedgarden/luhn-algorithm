import utils.BinList;
import utils.ConsoleColors;
import utils.Utils;

import java.io.Console;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ccNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("  _           _                   _                  _ _   _               \n" +
                " | |         | |                 | |                (_) | | |              \n" +
                " | |    _   _| |__  _ __     __ _| | __ _  ___  _ __ _| |_| |__  _ __ ___  \n" +
                " | |   | | | | '_ \\| '_ \\   / _` | |/ _` |/ _ \\| '__| | __| '_ \\| '_ ` _ \\ \n" +
                " | |___| |_| | | | | | | | | (_| | | (_| | (_) | |  | | |_| | | | | | | | |\n" +
                " |______\\__,_|_| |_|_| |_|  \\__,_|_|\\__, |\\___/|_|  |_|\\__|_| |_|_| |_| |_|\n" +
                "                                     __/ |                                 \n" +
                "                                    |___/  \n");
        System.out.println("This program uses Luhn's algorithm for credit card validation" +
                "\nYou can terminate the program by typing" + ConsoleColors.ANSI_RED + " \"exit\"" + ConsoleColors.ANSI_RESET + "." +
                "\n--------------------------------------------------");

        while(true){
            System.out.print("Please enter CC number to validate: ");
            ccNumber = scanner.next();

            if (ccNumber.equals("exit")){
                break;
            }
            else if(!Utils.isNumberString(ccNumber)){
                System.out.println(ConsoleColors.ANSI_RED + "Bad input!" + ConsoleColors.ANSI_RESET);
                continue;
            }

            int lenth = ccNumber.length();
            int doubleEvenSum = 0;

            /*
            * Step 1 is to double every second digit, starting from the right.
            * If it result in a two digit number, add both the digits to obtain a single number.
            * Finally, sum all the answers to obtain 'doubleEvenSum'
            * **/

            for (int i = lenth - 2; i >= 0; i-=2) {
                int dbl = ((ccNumber.toCharArray()[i] - 48) * 2);
                if(dbl > 9){
                    dbl = (dbl / 10) + (dbl % 10);
                }
                doubleEvenSum += dbl;
            }

            /*
            * Step 2 is to add every odd placed digit form the right to the value 'doubleEvenSum'
            * **/

            for (int i = lenth - 1; i >= 0; i-=2) {
                doubleEvenSum += ccNumber.toCharArray()[i] - 48;
            }

            /*
             * Step 3 is to check if the final 'doubleEvenSum' is a multiple of 10.
             * If true, it is a valid CC number.
             * **/

            if (doubleEvenSum % 10 == 0){
                System.out.println("This card belongs to the: " + ConsoleColors.ANSI_YELLOW + BinList.BIN(ccNumber) + ConsoleColors.ANSI_RESET);
                System.out.println(ConsoleColors.ANSI_GREEN + "This card is valid!" + ConsoleColors.ANSI_RESET + "\n--------------------------------------------------");
            }else{
                System.out.println(ConsoleColors.ANSI_RED + "This card is Invalid!" + ConsoleColors.ANSI_RESET);
            }

            continue;
        }
    }
}
