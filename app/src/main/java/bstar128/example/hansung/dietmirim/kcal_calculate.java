package bstar128.example.hansung.dietmirim;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Display;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by HANSUNG on 2017-10-19.
 */
public class kcal_calculate extends Activity{
    EditText weight,height;
    int bmi,kcal;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //칼로리 계산
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kcal_calculate);
        height=(EditText)findViewById(R.id.kcal_height);
        weight=(EditText)findViewById(R.id.kcal_weight);

//        Toast tm=Toast.makeText(kcal_calculate.this,"칼로리 계산중",Toast.LENGTH_SHORT);
//        Display dis=((WindowManager)getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
//        int xoffset=(int)(Math.random()*dis.getWidth());
//        int yoffset=(int)(Math.random()*dis.getHeight());
//
//        tm.setGravity(Gravity.TOP|Gravity.LEFT,xoffset,yoffset);
//        tm.show(); //잘 뜨는지 테스트!


        //남자면 (질량)×24, 여자면  0.9×(질량)×24<- 기초 대사량
        //BMI-> 몸무게/ 키(m) 제곱

    }
}
