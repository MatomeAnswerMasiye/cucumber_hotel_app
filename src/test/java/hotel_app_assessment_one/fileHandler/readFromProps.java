package hotel_app_assessment_one.fileHandler;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class readFromProps {

    public HashMap<String, String> readConfigData(){

        HashMap<String,String> urlAndBrowser = new HashMap<>();

        try{

            //Read the props file
            InputStream input = new FileInputStream("src/main/resources/config.properties");
            Properties prop = new Properties();
            prop.load(input);

            //Store props file data in variables
            urlAndBrowser.put("adactinUrl",prop.getProperty("url"));
            urlAndBrowser.put("browser",prop.getProperty("browser"));


        }catch (Exception e){
            e.printStackTrace();
        }

        return urlAndBrowser;

    }
}
