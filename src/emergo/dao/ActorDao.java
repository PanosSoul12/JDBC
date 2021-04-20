/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emergo.dao;

import emergo.entity.Actor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class ActorDao {

    private String url = "jdbc:mysql://localhost:3306/sakila";
    private String user = "root";
    private String password = "panakos12";

    
        // 2 DriverManager will give us the connection object.
        // 3 connection(url,port,username,password,schema/database)
    
    public Connection getConnection() {

        Connection connection=null;
        try {
            connection = DriverManager.getConnection
                (url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(ActorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
    public void closeConnections(ResultSet rs,Statement stmt,Connection conn ){
        try {
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(ActorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //method that returns all actors from db
    public List<Actor> findAll(){
        ArrayList<Actor> List =new ArrayList<>();
        ResultSet resultSet=null;
        Connection conn=getConnection();
        Statement stmt=null;
        try {
            
           stmt  = conn.createStatement();
            String query ="SELECT * FROM actor";
             resultSet=stmt.executeQuery(query);
             while(resultSet.next()){
                   int actor_id=resultSet.getInt(1);
            String fname=resultSet.getString(2);
            String lname=resultSet.getString(3);
            
            Actor actor = new Actor(actor_id,fname,lname);
            List.add(actor);
             } 
           
            
        } catch (SQLException ex) {
            Logger.getLogger(ActorDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            //close connections
            closeConnections(resultSet, stmt, conn);
            
        }return List;
    }
}
