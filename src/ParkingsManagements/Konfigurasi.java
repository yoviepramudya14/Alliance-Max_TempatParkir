/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ParkingsManagements;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class Konfigurasi {
    
    private static Connection MySQLconfig;
    
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://127.0.0.1:3306/parkiran?serverTimezone=UTC";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            MySQLconfig = DriverManager.getConnection(url, user, pass);
            System.out.println("Koneksi ke Database berhasil");
            //MySQLconfig = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.1:1521:XE","ulfia","dataparkit");
        }catch(SQLException e){
            System.out.println("Koneksi ke Database gagal " + e.getMessage());
        }
        
        return MySQLconfig;
    }
    
}
