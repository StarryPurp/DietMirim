package bstar128.example.hansung.dietmirim;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Created by HANSUNG on 2017-10-24.
 */

public class sign_in extends Activity{
    EditText name,id,ps,em,tall,heavy;
    Button cancel,enter;
    String tall_c,kcal_c;
    double bmi,kcal_s;
    RadioGroup rdg;

    //회원가입-> 성별, 이름, 이메일, 아이디, 비밀번호, 키, 몸무게
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        mAuth = FirebaseAuth.getInstance();

        cancel=(Button)findViewById(R.id.cancel);
        enter=(Button)findViewById(R.id.enter);
        name=(EditText)findViewById(R.id.name);
        id=(EditText)findViewById(R.id.identity_s);
        ps=(EditText)findViewById(R.id.ps);
        em=(EditText)findViewById(R.id.email_s);
        tall=(EditText)findViewById(R.id.tall);
        heavy=(EditText)findViewById(R.id.heavy);

         tall_c=(tall.getText()).toString();
         kcal_c=(heavy.getText()).toString();

        // bmi=Double.parseDouble(tall_c)*Double.parseDouble(kcal_c);//bmi 지수



        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),main_page.class);
                startActivity(i);
            }
        });
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),profile.class);
                startActivity(i);
            }
        });

    }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
    }
}

//남자면 (질량)×24, 여자면  0.9×(질량)×24<- 기초 대사량
//BMI-> 몸무게/ 키(m) 제곱
