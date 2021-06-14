/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise1;

import java.util.Comparator;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;

/**
 *
 * @author Muslim
 */
    

@SupportedSourceVersion(SourceVersion.RELEASE_15)
public class comp implements Comparator<City>
{

    @Override
    public int compare(City o1, City o2) {
        
        return o1.getPopulation().compareTo(o2.getPopulation());
    }
}

 
