package kz.kazakh.kz.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {
public static final String EXTRA_MESSAGE="a;lsfdlksa";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);

        Intent intent=getIntent();
        String string=intent.getStringExtra(EXTRA_MESSAGE);
        TextView textView=findViewById(R.id.messagereceive);
        textView.setText(string);
    }
}
