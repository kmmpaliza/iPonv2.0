package com.multicore.newipon;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;

public class LogInActivity extends AppCompatActivity {

    @BindView(R.id.txtSignUp) TextView txtSignUp;
    @BindView(R.id.btnSignInLog) Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        //txtSignUp.setPaintFlags(txtSignUp.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.txtSignUp:
                startActivity(new Intent(getApplicationContext(), SignUpActivity.class));
                finish();
                break;
            case R.id.btnSignInLog:
                startActivity(new Intent(getApplicationContext(), ChooseActivity.class));
                finish();
                break;
        }
    }
}
