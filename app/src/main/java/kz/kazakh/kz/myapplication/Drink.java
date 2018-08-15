package kz.kazakh.kz.myapplication;

/**
 * Created by gayny on 15.08.2018.
 */

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;
    public static final Drink[] drinks={
            new Drink("Latte","A couple 1",R.drawable.latte),
            new Drink("Latte","A couple 2",R.drawable.cappuchino),
            new Drink("Latte","A couple 3",R.drawable.expresso)
    };

    private Drink(String name,String description,int imageResourceId){
        this.name=name;
        this.description=description;
        this.imageResourceId=imageResourceId;
    }
    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }
    public String toString(){
        return this.name;
    }
}
