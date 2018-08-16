package kz.kazakh.kz.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class DrinkCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listView = getListView();
        ArrayAdapter<Drink> listAdapter = new ArrayAdapter<Drink>(this, R.layout.support_simple_spinner_dropdown_item, Drink.drinks);

        listView.setAdapter(listAdapter);
    }
    public void onListItemClick(ListView listView,View itemView,int position,long id){
        Intent intent=new Intent(DrinkCategoryActivity.this,DrinkActivity.class);
        intent.putExtra(DrinkActivity.EXTRA_DRINKNUM,(int) id);
        startActivity(intent);
    }

}
