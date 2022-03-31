package hotel_app_assessment_one.fileHandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//A class that contains the logic from writing to and from file
public class fileHandler {

    //Write to text file
    public void writeToTxt(String orderNumber) {

        //Creates a txt file and write the order number that will be passed as argument upon invocation
        try {

            FileWriter myWriter = new FileWriter("src/main/resources/orderNumber.txt");
            myWriter.write(orderNumber);
            myWriter.close();

        } catch (IOException e) {

            System.out.println("An error occurred.");
            e.printStackTrace();

        } catch (Exception e) {

            e.printStackTrace();

        }

    }

    //Read from text file

    public String readFromTxt() {

        //Declaring a variable that's going to store the order number read from file
        String orderNumber = null;

        //Read order number from file and store it in a "orderNumber" variable
        try {

            File myObj = new File("src/main/resources/orderNumber.txt");
            Scanner myReader = new Scanner(myObj);

            orderNumber = myReader.nextLine();

            myReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //return the orderNumber
        return orderNumber;

    }
}
