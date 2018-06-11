package database;

//import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest?autoReconnect=true&useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";


    public static void main(String[] args){

        //Connection connection;


        try {
            //Driver driver = new FabricMySQLDriver();
            //DriverManager.registerDriver(driver);

            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }catch (SQLException e){

            e.printStackTrace();
        }

    }

}

