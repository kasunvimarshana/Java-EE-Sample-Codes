/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.system.util;

/**
 *
 * @author KASUN
 */
public class Commons {
    
    public static boolean isset(String str){
        if(str == null || str.trim().equalsIgnoreCase("")){
            return false;
        }
        return true;
    }
    
}
