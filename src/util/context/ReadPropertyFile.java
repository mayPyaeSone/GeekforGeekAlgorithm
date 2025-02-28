/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util.context;

/**
 *
 * @author User
 */
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadPropertyFile {

    public static void main(String[] args) {
        Properties properties = new Properties();

        try (InputStream input = ReadPropertyFile.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            properties.load(input);

            // Read properties
            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            String url = properties.getProperty("url");

            // Print out values
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("URL: " + url);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String read(String fileName) {
        Properties properties = new Properties();
        String path = "";
        try (InputStream input = ReadPropertyFile.class.getClassLoader().getResourceAsStream("config.properties")) {
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
//                return;
            }
            properties.load(input);
            path = properties.getProperty("inputFile");

            // Read properties
        } catch (IOException ex) {
            Logger.getLogger(ReadPropertyFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        return path;
    }
}
