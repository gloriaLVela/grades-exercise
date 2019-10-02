package grades;

import java.util.Scanner;

public class Input {
    private Scanner scanner;


    public Input(){
    this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {

        Input keyboard = new Input();

        System.out.println(keyboard.getString());
        System.out.println(keyboard.yesNo());
        System.out.println(keyboard.getInt( 1 ,10));
        System.out.println(keyboard.getInt(""));
        System.out.println(keyboard.getDouble(1,10));
        System.out.println(keyboard.getDouble(""));
        System.out.println(keyboard.getString());

    }

    public String getString(){
        return this.scanner.nextLine();
    }
    public String getString(String prompt){
        if (prompt.isEmpty()){
            System.out.println("Type: ");
        } else {
        System.out.println(prompt);
        }
        return getString();
    }

    private boolean yesNo(){
        //System.out.println("Want to continue? (y/n)");
        String answer =this.scanner.nextLine();
        return answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");

    }

    public boolean yesNo(String prompt){
        if (prompt.isEmpty()) {
        System.out.println("Want to continue? (y/n)");}
        else {
            System.out.println(prompt);
        }
        return yesNo();


    }


       public int getInt(int min, int max) {
//        System.out.println("Enter a number between 1 and 10: ");
//        if (scanner.hasNextLine()) {
//            int numInput = Integer.parseInt(this.scanner.nextLine());
//            if (numInput >= min && numInput <= max) {
//                System.out.println(numInput + " is between 1 & 10!");
//            } else if (numInput < min || numInput > max) {
//                System.out.println("This number is not valid, enter another number: ");
//                return getInt(min, max);
//            }
//        } else {
//            System.out.println("Not a valid input! Enter a valid number: ");
//            return getInt(min, max);
//        }
//        return getInt(min, max);
/**
 *FERNANDOS WAY
 */

           int number = getInt("Enter a number:");
           if(number >=min && number <= max) {
               return number;
           } else {
               System.out.println("Out of range");
           }
           return getInt(min, max);

    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }


    public double getDouble(double min, double max) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number between 1 and 10: ");
//        if (input.hasNextDouble()) {
//            int numInput = input.nextInt();
//            if (numInput >= min && numInput <= max) {
//                System.out.println(numInput + " is between 1 & 10!");
//            } else if (numInput < min || numInput > max) {
//                System.out.println("This number is not valid, enter another number: ");
//                return getDouble(min, max);
//            }
//        } else {
//            System.out.println("Not a valid input! Enter a valid number: ");
//            return getDouble(min, max);
//        }
//        return getDouble(min, max);
        /**
         *FERNANDOS WAY
         */

        double number = getDouble("Give me a decimal:");
        if(number >=min && number <= max) {
            return number;
        } else {
            System.out.println("Out of range");
        }
        return getDouble(min, max);

    }

    public int getDouble(String prompt) {
        System.out.println(prompt);
        return scanner.nextInt();
    }

}
