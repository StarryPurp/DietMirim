package bstar128.example.hansung.dietmirim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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

        kcal=(ImageView)findViewById(R.id.kcalandbmi);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_page);

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

//        kcal.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i=new Intent(getApplicationContext(),kcal_calculate.class);
//                startActivity(i);
//            }
//        });

//        imgbut1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i=new Intent(getApplicationContext(),kcal_calculate.class);
//                startActivity(i);
//            }
//        });
//        imgbut2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i=new Intent(getApplicationContext(),excercise_calender.class);
//                startActivity(i);
//            }
//        });
//        imgbut3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent i=new Intent(getApplicationContext(),joining.class);
//                startActivity(i);
//            }
//        });//깔끔하게 하는 방법 찾기
    }
}
