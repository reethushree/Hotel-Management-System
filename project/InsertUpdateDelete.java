/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Reethu
 */

public class InsertUpdateDelete {
   public static void setData(String Query , String msg) {
    Connection con = null;
    Statement st = null;
    try
    {
    con=ConnectionProvider.getCon();
    st=con.createStatement();
    st.executeUpdate(Query);
    if(!msg.equals(""))
        JOptionPane.showMessageDialog(null, msg);
    }
    catch(HeadlessException | SQLException e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
    finally
    {
      try
     {
    
    }
    catch(Exception e)
    {
    
    }
    }
}
        }
