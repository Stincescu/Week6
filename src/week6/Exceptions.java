package week6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {

    public static void main(String[] args) {
//        try {
//            readFile();
//        } catch (RuntimeException | FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        } finally {
//            System.out.println("Finally close the file");
//        }
//        int result = 0;
//        try {
//            result = divide(8, 0);
//        } catch (ArithmeticException ex) {
//
//            System.out.println("Division by 0");
//        }
//        System.out.println("Program finished with success");
        try {
            checkAccount("Alin");
            checkAccount("Bogdan");
        } catch (InsufficientFundsException ex) {
            System.out.println(ex.getAmount());
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File("test.txt");
        FileReader fr = new FileReader(file);
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    public static double checkAccount(String id) throws InsufficientFundsException {
        if (id.equals("Bogdan")) {
            throw new InsufficientFundsException(200);
        }
        return 500;
    }
}
