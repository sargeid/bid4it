/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author George
 */

@ManagedBean (name = "mainpage")
@SessionScoped
public class mainpage implements Serializable{
    
    public String redirection(){
        return "item";
    }
}
