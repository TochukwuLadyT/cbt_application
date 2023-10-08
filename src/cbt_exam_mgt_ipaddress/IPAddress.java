/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cbt_exam_mgt_ipaddress;

import jamb_secondary_general_cbt_connectivity.cconnection;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author LADYT
 */
public class IPAddress {
    public static void main(String[] args){
        try{
        InetAddress myIP = InetAddress.getLocalHost();
        System.out.println(myIP);
        
        System.out.println(myIP.getHostName());
        System.out.println(myIP.getHostAddress());
        
        String sysname = myIP.getHostName();
        String sysip= myIP.getHostAddress();
        
           try {
            cconnection cconnection = new cconnection();
            Connection conn = cconnection.getConnection();
                Statement stati = conn.createStatement();
                
                String sv = "INSERT into login_systems values('" + sysname + "','" +sysip+"','connected');";
                stati.executeUpdate(sv);
              
               
            } catch (Exception ex) {
             ex.printStackTrace();
               // JOptionPane.showMessageDialog(null, "Dear Candidate you have lost connection", "Info", JOptionPane.ERROR_MESSAGE);
            }
        
        
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
                
         
        
    }
    
}


 

