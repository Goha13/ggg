package kz.kazakh.kz.myapplication;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gayny on 17.07.2018.
 */

public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands=new ArrayList<String>();
        if(color.equals("amber")){
            brands.add("Jack");
            brands.add("Red");
        }
        else {
            brands.add("Jail");
            brands.add("Gout");
        }
        return brands;
    }
}
