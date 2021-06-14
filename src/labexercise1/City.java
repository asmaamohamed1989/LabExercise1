/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise1;

/**
 *
 * @author asmaa mohamed fathy
 */
public class City {
    public City(String code, String name, String continent, Integer population, Integer area){
        Code = code;
        Name = name;
        Continent =continent;
        Population = population;
        Area = area;
    }
    
     public void setCode(String code){
        Code = code;
    }
     
    public String getCode(){
        return Code;
    }
   
     public void setName(String name){
        Name = name;
    }
     
    public String getName(){
        return Name;
    }
    
    public void setContinent(String continent){
        Continent = continent;
    }
     
    public String getContinent(){
        return Continent;
    }
  
     
 
    public void setPopulation(int population){
        Population = population;
    }
     
    public Integer getPopulation(){
        return Population;
    }
    public void setArea(int area){
        Area = area;
    }
     
    public Integer getArea(){
        return Area;
    }
    
    String Code;
    String Name;
    String Continent;
    int Population;
    int Area;
    }

