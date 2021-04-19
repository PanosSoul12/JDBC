/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcapp;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author USER
 */
public class JDBCAPP {
    //crud operations (Insert ,select ,Update,Delete)
        
    private static String url="jdbc:mysql://localhost:3306/sakila";
    private static String user="root";
    private static String password="panakos12";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        // 1 import Driver jar.
        // 2 DriverManager will give us the connection object.
        // 3 connection(url,port,username,password,schema/database)
        
        Connection connection=DriverManager.getConnection(url,user,password);
       Statement statement= connection.createStatement();
       String query ="SELECT * FROM actor";
       ResultSet resultSet=statement.executeQuery(query);
       resultSet.next();
       int actorId=resultSet.getInt(1);
       String fname=resultSet.getString(2);
       String lname=resultSet.getString(3);
       
        System.out.println("actorId=" +actorId+","
                + "fname="+fname+",lname"+lname);
        resultSet.next();
        actorId=resultSet.getInt(1);
        fname=resultSet.getString(3);
        lname=resultSet.getString(3);
       
        System.out.println("actorId=" +actorId+","
                + "fname="+fname+",lname"+lname);
        resultSet.close();
        statement.close();
        connection.close();
    }
    
}
