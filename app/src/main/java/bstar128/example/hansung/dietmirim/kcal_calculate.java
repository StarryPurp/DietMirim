package bstar128.example.hansung.dietmirim;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Display;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by HANSUNG on 2017-10-19.
 */
public class kcal_calculate extends Activity{
    EditText weight,height;
    TextView result;
    double bmi,kcal;
    String w,h;
    RadioGroup rdg;
    RadioButton male,female;
    Button cal;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //칼로리 계산
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kcal_calculate);
        height=(EditText)findViewById(R.id.kcal_height);
        weight=(EditText)findViewById(R.id.kcal_weight);
        rdg=(RadioGroup)findViewById(R.id.rdg);
        male=(RadioButton)findViewById(R.id.male);
        female=(RadioButton)findViewById(R.id.female);
        cal=(Button)findViewById(R.id.calcul);
        result=(TextView)findViewById(R.id.result);

        w=weight.getText().toString();
        h=height.getText().toString();

        cal.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (rdg.getCheckedRadioButtonId()){
                    case R.id.male:
                        kcal=Double.parseDouble(w)*24.0;
                        bmi=Double.parseDouble(w)/Math.pow(Double.parseDouble(h)/100,2);
                        break;
                    case R.id.female:
                        kcal=Double.parseDouble(w)*24.0*0.9;
                        bmi=Double.parseDouble(w)/Math.pow(Double.parseDouble(h)/100,2);
                        break;
                }
                result.setText("기초 대사량: "+kcal+", BMI: "+bmi);
                return false;
            }
        });
//        Toast tm=Toast.makeText(kcal_calculate.this,"기초 대사량: "+kcal,Toast.LENGTH_SHORT);
//        Display dis=((WindowManager)getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
//        int xoffset=(int)(Math.random()*dis.getWidth());
//        int yoffset=(int)(Math.random()*dis.getHeight());
//        tm.setGravity(Gravity.TOP|Gravity.LEFT,xoffset,yoffset);
//        tm.show(); //잘 뜨는지 테스트!

        //남자면 (질량)×24, 여자면  0.9×(질량)×24<- 기초 대사량
        //BMI-> 몸무게/ 키(m) 제곱

    }
}
//        Toast tm=Toast.makeText(kcal_calculate.this,"칼로리 계산중",Toast.LENGTH_SHORT);
//        Display dis=((WindowManager)getSystemService(WINDOW_SERVICE)).getDefaultDisplay();
//        int xoffset=(int)(Math.random()*dis.getWidth());
//        int yoffset=(int)(Math.random()*dis.getHeight());
//
//        tm.setGravity(Gravity.TOP|Gravity.LEFT,xoffset,yoffset);
//        tm.show(); //잘 뜨는지 테스트!