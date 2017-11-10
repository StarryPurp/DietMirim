package bstar128.example.hansung.dietmirim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;

/**
 * Created by HANSUNG on 2017-10-19.
 */

public class main_page extends Activity {
    TabHost t1;
    ImageView kcal;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

        kcal=(ImageView) findViewById(R.id.kcalanddbmi);

        t1=(TabHost)findViewById(R.id.tabhost);
        t1.setup();

        TabHost.TabSpec ts1=t1.newTabSpec("Tab Spec 1");
        ts1.setContent(R.id.BMI);
        ts1.setIndicator("BMI");
        t1.addTab(ts1);

        TabHost.TabSpec ts2=t1.newTabSpec("Tab Spec 2");
        ts2.setContent(R.id.CALENDER);
        ts2.setIndicator("CALENDER");
        t1.addTab(ts2);

        TabHost.TabSpec ts3=t1.newTabSpec("Tab Spec 3");
        ts3.setContent(R.id.SIGN);
        ts3.setIndicator("PROFILE");
        t1.addTab(ts3);

        kcal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),kcal_calculate.class);
                startActivity(i);
            }
        });


    }
}
