/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise1;

/**
 *
 * @author Asmaa mohamed
 */
public class Country {
    public Country(String name, String code){
        Name = name;
        Code = code;
    }
    
    public void setName(String name){
       Name = name;
    }
    
    public String getName(){
        return Name;
    }
    
    public void setCode(String code){
    Code = code;
    }
    
    public String getCode(){
    return Code;
    }
    
    String Name;
    String Code;
}
    


