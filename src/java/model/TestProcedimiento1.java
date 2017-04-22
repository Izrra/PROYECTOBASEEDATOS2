/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.sql.CallableStatement;
import java.sql.Connection;

/**
 *
 * @author campitos
 */
public class TestProcedimiento1 {
    public static void main(String args[])throws Exception{
        Conexion c=new Conexion();
        Connection con=c.conectarse();
     CallableStatement callate=con.prepareCall("{call GUARDAR_FUTBOL(?,?,?)}");
        callate.registerOutParameter(1,java.sql.Types.INTEGER);
        callate.setString(2,"FC Barcelona");
        callate.setString(3,"Messi");
      
        callate.execute();
        int pk=callate.getInt(1);
        System.out.println("El id ingresado es:"+pk);
    }
    
}
