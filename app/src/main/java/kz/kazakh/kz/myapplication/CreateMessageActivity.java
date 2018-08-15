package kz.kazakh.kz.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }
    public void onSendMessage(View view){
        EditText editText=findViewById(R.id.message);
        String s=editText.getText().toString();
//        Intent intent=new Intent(this,ReceiveMessageActivity.class);
//        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE,s);
//        startActivity(intent);

//        Intent intent=new Intent(Intent.ACTION_SEND);
//        intent.setType("text/plain");
//        intent.putExtra(Intent.EXTRA_TEXT,s);
//String chosuenIntent=getString(R.string.chooser);
//        Intent chosenIntent=Intent.createChooser(intent,chosuenIntent);
//        startActivity(chosenIntent);










        Intent intent2=new Intent(Intent.ACTION_SEND);
        intent2.setType("text/plain");
        intent2.putExtra(Intent.EXTRA_TEXT,s);
        Intent inentchosenn=Intent.createChooser(intent2,"a;lskjdfkasfjsakf");
        startActivity(inentchosenn);










































    }
}
