package ParkingsManagements;

import java.sql.*;

public class Konfigurasi {
    private static Connection MySQLconfig;
    
    public static Connection configDB()throws java.sql.SQLException{

        try{
            String url = "jdbc:oracle:thin:@192.168.56.1:1521:XE";
            String user = "ulfia";
            String pass = "1234";
            
            //String driverName = "oracle.jdbc.driver.OracleDriver";
            //Class.forName(driverName);
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            MySQLconfig = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi ke Database berhasil");
        }catch(java.sql.SQLException e){
            System.out.println("Koneksi ke Database gagal " + e.getMessage());
        }
    return MySQLconfig;
    }
}