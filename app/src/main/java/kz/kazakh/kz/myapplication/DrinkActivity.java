package kz.kazakh.kz.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkActivity extends AppCompatActivity {
public static final String EXTRA_DRINKNUM="drinknum";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        int drinknum=(Integer) getIntent().getExtras().get(EXTRA_DRINKNUM);
        Drink drink=Drink.drinks[drinknum];
        ImageView photo=(ImageView)findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceId());
        photo.setContentDescription(drink.getName());
        TextView name=(TextView)findViewById(R.id.name);
        name.setText(drink.getName());
        TextView description=(TextView)findViewById(R.id.description);
        description.setText(drink.getDescription());
    }
}
