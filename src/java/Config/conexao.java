/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 *
 * @author bruno.alves
 */
public class conexao {
     public DriverManagerDataSource Conectar(){
     DriverManagerDataSource datasource = new DriverManagerDataSource();
     datasource.setDriverClassName("com.mysql.jdbc.Driver");
     datasource.setUrl("jdbc:mysql://localhost:3306/springmvc_crud");
     datasource.setUsername("root");
     datasource.setPassword("");
     return datasource;
     }
    
    
}
