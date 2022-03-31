package hotel_app_assessment_one.data;

import java.sql.ResultSet;
import java.util.HashMap;

//Class that connects to database and retrieves all the needed data
public class connectAndRetrieveData {

    //Creates an object for the dataConnector class and declares resultSet variables for login credentials and hotel data
    dataConnector connector = new dataConnector();

    //Initialize the connection to the database
    public HashMap<String,ResultSet> initializeConnection(){

        HashMap<String,ResultSet> dataFromDatabase = new HashMap<>();

        //Declaring and initializing database connection details
        String sConnectionUrl = "jdbc:mysql://localhost:3306/bookhoteldatabase";
        String sUname = "root";
        String sPass = "passwordinstance@MySql";

        try{
            //Connecting to database and querying login data
            String sloginSetQuery = "select * from LoginCredentials";
            dataFromDatabase.put("loginData",connector.ConnectAndQuerySQL(sConnectionUrl, sUname, sPass, sloginSetQuery));

            //Connecting to database and querying book hotel data
            String sBookHotelQuery = "select * from Booking";
            dataFromDatabase.put("hotelData",connector.ConnectAndQuerySQL(sConnectionUrl, sUname, sPass, sBookHotelQuery));

        }catch(Exception e){
            e.printStackTrace();
        }

        return dataFromDatabase;

    }

    //Close all open database connections
    public void closeDbConnections(ResultSet loginDataConnection,ResultSet hotelDataConnection){
        try{
            loginDataConnection.close();
            hotelDataConnection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
