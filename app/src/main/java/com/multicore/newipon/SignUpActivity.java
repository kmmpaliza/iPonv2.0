package com.multicore.newipon;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;

public class SignUpActivity extends AppCompatActivity {

    @BindView(R.id.txtLogInUP) TextView txtLogInUp;
    @BindView(R.id.btnSignUp) TextView btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

       // txtLogInUp.setPaintFlags(txtLogInUp.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.txtLogInUP:
                startActivity(new Intent(getApplicationContext(), LogInActivity.class));
                finish();
                break;
            case R.id.btnSignUp:
                startActivity(new Intent(getApplicationContext(), ChooseActivity.class));
                finish();
                break;
        }
    }
}
