/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;

/**
 *
 * @author andre
 */
public class ConexaoBancoDeDados {
    public static Connection connect() {
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:banco.db")) {

         return connection;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
       
    }
}
