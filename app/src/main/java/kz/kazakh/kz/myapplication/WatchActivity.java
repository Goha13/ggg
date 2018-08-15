package kz.kazakh.kz.myapplication;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class WatchActivity extends AppCompatActivity{
    private int seconds=0;
    private boolean running;
    private boolean wasrunning;
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_watch);
        if(saveInstanceState !=null){
            saveInstanceState.getInt("seconds");
            saveInstanceState.getBoolean("running");
            saveInstanceState.getBoolean("wasrunning");
        }
        runTimer();
    }
    public void onClickStart(View view){
        running=true;

    }
    public void onClickStop(View view){
        running=false;
    }

    public void onClickReset(View view){
        seconds=0;
        running=false;
    }
    public void runTimer(){
        final TextView txt=(TextView) findViewById(R.id.time_view);
        final Handler handler=new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours=seconds/3600;
                int minutes = (seconds % 3600) / 60;
                int secs = seconds % 60;
                String time=String.format("%d","%d","%d",hours,minutes,secs);
                txt.setText(time);
                if(running){
                    seconds++;
                }
                handler.postDelayed(this,1000);
            }
        });

    }
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("seconds",seconds);
        savedInstanceState.putBoolean("running",running);
        savedInstanceState.putBoolean("wasrunning",wasrunning);
    }
    @Override
    protected void onPause(){
        super.onPause();
        wasrunning=running;
        running=false;
    }
    @Override
    protected void onResume(){
        super.onResume();
        if(wasrunning){
            running=true;
        }
    }

}