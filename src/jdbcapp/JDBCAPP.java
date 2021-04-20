/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbcapp;


import emergo.dao.ActorDao;
import emergo.entity.Actor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class JDBCAPP {
    //crud operations (Insert ,select ,Update,Delete)
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
      
        // 1 import Driver jar.
      ActorDao actorDao= new ActorDao();
      List<Actor> actors=actorDao.findAll();
      for(Actor actor :actors){
          System.out.println(actor);
      }
        
      
    }
    
}
