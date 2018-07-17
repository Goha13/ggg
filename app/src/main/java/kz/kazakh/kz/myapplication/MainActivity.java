package kz.kazakh.kz.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {
private BeerExpert beerExpert=new BeerExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickFindBeer(View view){
        Spinner color=(Spinner) findViewById(R.id.color);
        TextView brands=(TextView)findViewById(R.id.brands);
        String beerType= String.valueOf(color.getSelectedItem());
        brands.setText(beerType);
        List<String> brandList=beerExpert.getBrands(beerType);
        StringBuilder brandsFormatted=new StringBuilder();

        for(String brand:brandList){
            brandsFormatted.append(brand).append('\n');
        }
        brands.setText(brandsFormatted);
    }
}
