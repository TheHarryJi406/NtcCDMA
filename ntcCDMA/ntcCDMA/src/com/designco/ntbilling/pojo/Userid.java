/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designco.ntbilling.pojo;

/**
 *
 * @author admin
 */
public class Userid {
public String username=null;
public String userid=null;

 public Userid(String user_n,String user_i)
 {
 username=user_n;
 userid=user_i;
}
@ Override
public String toString()
{
return username+"\t"+userid;
       
}  

}

