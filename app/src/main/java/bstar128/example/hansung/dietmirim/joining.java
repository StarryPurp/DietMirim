package bstar128.example.hansung.dietmirim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by HANSUNG on 2017-10-19.
 */

public class joining extends Activity{
    EditText identity,password;
    Button sign,log;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        //회원가입, 기초대사량 알아보기
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joining);
        identity=(EditText)findViewById(R.id.identity);
        password=(EditText)findViewById(R.id.password);
        sign=(Button)findViewById(R.id.sign);
        log=(Button)findViewById(R.id.log);

    sign.setOnClickListener(new View.OnClickListener() {//회원가입 창 이동
        @Override
        public void onClick(View view) {
            Intent i=new Intent(getApplicationContext(),sign_in.class);
            startActivity(i);
        }
    });


    }
}
