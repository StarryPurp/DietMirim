package bstar128.example.hansung.dietmirim;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.EditText;

/**
 * Created by HANSUNG on 2017-10-19.
 */
public class kcal_calculate extends Activity{
    EditText kcal;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //칼로리 계산
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kcal_calculate);
        kcal=(EditText)findViewById(R.id.kcal_put);

        //남자면 (질량)×24, 여자면  0.9×(질량)×24<- 기초 대사량
        //BMI-> 몸무게/ 키(m) 제곱

    }
}
