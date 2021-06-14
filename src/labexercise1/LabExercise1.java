/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise1;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author asmaa mohamed fathy
 */

    
    

public class LabExercise1 {

    /**
     * @param args the command line arguments
     */
    public static List<City> sort(List<City>citylst)
    {
        citylst.sort(new comp());
        return citylst;
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        File CountryFile = new File("H:\\ITI\\Java & UML programming\\Assignments\\session 3(java file handling)\\LabExercise1\\Countries.csv");
        File CityFile = new File("H:\\ITI\\Java & UML programming\\Assignments\\session 3(java file handling)\\LabExercise1\\Cities.csv");
        
        
        List<String> Countrylines=new ArrayList<>();
        List<String> Citylines=new ArrayList<>();
        List<Country> Countrylst=new ArrayList<>();
        List<City> Citylst=new ArrayList<>(); 
        Map<String,List<City>>map=new HashMap<>();
        try
        {Countrylines= Files.readAllLines(CountryFile.toPath());
        System.out.println(Countrylines.size());
        
        Citylines=Files.readAllLines(CityFile.toPath());
        System.out.println(Citylines.size());
        }
      
        catch(Exception e)
        {System.out.println("Unable to read");
        return;
        }
        for(int i=0;i<Countrylines.size();i++)
        {
              String line=Countrylines.get(i);
              String[] splitted=line.split(",");
              //System.out.println(splitted[0]);
              //System.out.println(splitted[1]);
              Countrylst.add(new Country(splitted[0],splitted[1]));
             // map.put(splitted[0],new ArrayList<>());
             
              
               }
        for(int i=0;i<Citylines.size();i++)
        {
              String line=Citylines.get(i);
              String[] splitted=line.split(",");
              //System.out.println(splitted[0]);
              //System.out.println(splitted[1]);
              Citylst.add(new City(splitted[0],splitted[1],splitted[2],Integer.parseInt(splitted[3]),Integer.parseInt(splitted[4])));
              //Citylst.add(mcity);
              
               }
        for(int i=0;i<Countrylst.size();i++)
            map.put(Countrylst.get(i).getCode(),new ArrayList<>());
        
        for(int i=0;i<Citylst.size();i++)
        {
            System.out.println(Citylst.get(i).Code);
            List<City> lst=map.get(Citylst.get(i).Code);
            lst.add(Citylst.get(i));
            map.put(Citylst.get(i).Code,lst);
        }
        
        for(int i=0;i<map.get("111").size();i++)
            System.out.println(map.get("111").get(i).getName());
        List<City> finallst= sort(map.get("111"));
          for(int i=0;i<map.get("111").size();i++)
            System.out.println(map.get("111").get(i).getName());
    }
        
    
        //System.out.println(Countrylst.size());
    }
